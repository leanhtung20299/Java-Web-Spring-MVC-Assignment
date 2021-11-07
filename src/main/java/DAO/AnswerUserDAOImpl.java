//package DAO;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Supplier;
//
//import org.hibernate.Criteria;
//import org.hibernate.FetchMode;
//import org.hibernate.Hibernate;
//import org.hibernate.Session;
//import org.hibernate.criterion.DetachedCriteria;
//import org.hibernate.criterion.Disjunction;
//import org.hibernate.criterion.Example;
//import org.hibernate.criterion.LogicalExpression;
//import org.hibernate.criterion.Order;
//import org.hibernate.criterion.ProjectionList;
//import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Property;
//import org.hibernate.criterion.Restrictions;
//import org.hibernate.criterion.SimpleExpression;
//import org.hibernate.criterion.Subqueries;
//import org.hibernate.hql.internal.ast.tree.SessionFactoryAwareNode;
//import org.hibernate.transform.Transformers;
//import org.hibernate.type.StandardBasicTypes;
//
//import DTO.UserDTO;
//import entities.Answer;
//import entities.AnswerUser;
//import entities.User;
//import utils.HibernateUtils;
//
//public class AnswerUserDAOImpl implements AnswerUserDAO {
//
//  @Override
//  public Long getListAnswerLength() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//      Long count = (Long) session.createCriteria(Answer.class)
//          .setProjection(Projections.rowCount())
//          .uniqueResult();
//      session.getTransaction().commit();
//      session.close();
//      System.out.println(count);
//      return count;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<Answer> panigationListAnswer(Integer pageIndex, Integer perPage) {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//      
//      Criteria criteria = session.createCriteria(Answer.class)
//          .setFirstResult((pageIndex - 1) * perPage)
//          .setMaxResults(pageIndex * perPage);
//      List<Answer> list = criteria.list();
//
//      session.getTransaction().commit();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<Answer> searchListAnswerByAttribute(Integer pageIndex, Integer perPage, String attribute,
//      String valueSearch) {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//
//      Criteria criteria = session.createCriteria(Answer.class);
//      // set by Id fiels
//      if (attribute.equals("id")) {
//        criteria.add(Restrictions.like(attribute, Integer.parseInt(valueSearch)));
//      }
//      // set another fiels
//      if (attribute != null & attribute != "id") {
//        valueSearch = "%" + valueSearch + "%";
//        criteria.add(Restrictions.like(attribute, valueSearch));
//      }
//
//      criteria.setFirstResult((pageIndex - 1) * perPage);
//      criteria.setMaxResults(pageIndex * perPage);
//      List<Answer> list = criteria.list();
//      session.getTransaction().commit();
//
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<User> getNumberUserAnswerTheMostQuestionInDay(LocalDate day, Integer numberUser) {
//    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//
//      Criteria criteria = session.createCriteria(User.class)
//            .add(Restrictions.eq("createTime", day));
//
//      ProjectionList projectionList = Projections.projectionList();
//      projectionList.add(Projections.groupProperty("ip").as("ip"))
//          .add(Projections.groupProperty("createTime").as("createTime"))
//          .add(Projections.sqlGroupProjection("count(ip) countip",
//              "create_time,ip having count(ip) >= 1 order by countip desc", new String[] { "countip" },
//              new org.hibernate.type.Type[] { StandardBasicTypes.LONG }));
//      criteria.setProjection(projectionList);
//      criteria.setMaxResults(numberUser);
//      List<User> list = new ArrayList<User>();
//      List<Object[]> userData = criteria.list();
//      for (Object[] u : userData) {
//        
////        System.out.print(" Count: " + u[2]);
////        System.out.print(" IP: " + u[0]);
////        System.out.println(" Day: " + u[1]);      
//        list.add(new User(u[0].toString(), LocalDate.parse(u[1].toString(), pattern)));
//      }
//
////      List<UserDTO> list = criteria.setResultTransformer(Transformers.aliasToBean(UserDTO.class)).list();
////      list.stream().forEach(u->System.out.println(u.toString()));
//
//      session.getTransaction().commit();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//
//  }
//
//  @Override
//  public List<AnswerUser> getListAnswerUserSortOrderBy() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//      Criteria criteria = session.createCriteria(AnswerUser.class);
//
////       criteria.addOrder(Order.desc("answer.text")); ->Error
////       criteria.addOrder(Order.desc("user.createTime")); ->Error
//
//      // Fetch.JOIN
//
//      criteria.createAlias("user", "users");
//      criteria.createAlias("answer", "answer");
//      criteria.addOrder(Order.desc("users.createTime"));
//      criteria.addOrder(Order.desc("answer.text"));
//
////      Criteria subCriteria1 = criteria.createCriteria("user", "user");
////      subCriteria1.addOrder(Order.desc("user.createTime"));
////
////      Criteria subCriteria2 = criteria.createCriteria("answer", "answer");
////      subCriteria2.addOrder(Order.desc("answer.text"));
//
//      List<AnswerUser> list = criteria.list();
//      session.getTransaction().commit();
//      session.close();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<AnswerUser> getListAnswerUserSortOrderByPerformance() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//      Criteria criteria = session.createCriteria(AnswerUser.class);
//      criteria.createAlias("user", "users");
//      criteria.createAlias("answer", "answer");
//      criteria.addOrder(Order.desc("users.createTime"));
//      criteria.addOrder(Order.desc("answer.text"));
////      criteria.setFetchMode("user", FetchMode.EAGER).setFetchMode("answer", FetchMode.EAGER);
//      List<AnswerUser> list = criteria.list();
//      session.getTransaction().commit();
//      session.close();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<AnswerUser> getListByCondition() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//
//      Criteria criteria = session.createCriteria(AnswerUser.class)
//              .createAlias("user", "user")
//              .add(Restrictions.eq("user.ip", "192.168.0.1"));
//      List<AnswerUser> list = criteria.list();
//      list.stream().forEach(u -> System.out.println(u));
//      session.getTransaction().commit();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//  
//  @Override
//  public List<User> getListUserbyAnswerUserID() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//      DetachedCriteria subCriteria = DetachedCriteria.forClass(AnswerUser.class)
//            .createAlias("answer", "answer")
//            .createAlias("user", "user");
//      // Express condition
//      SimpleExpression eqAnswer = Restrictions.eq("answer.id", 2);
//      SimpleExpression eqText = Restrictions.eq("answer.text", "%java%");
//      Disjunction disjunction = Restrictions.disjunction();
//      disjunction.add(eqAnswer);
//      disjunction.add(eqText);
//      disjunction.add(eqText);
//      LogicalExpression cs = Restrictions.or(eqText, disjunction);
//      subCriteria.add(cs);
//      subCriteria.setProjection(Projections.property("user.id").as("id"));
//
////      Subqueries
//      Criteria criteria = session.createCriteria(User.class);
////      criteria.add(Restrictions.in("id", subCriteria));       -->Error
//      criteria.add(Property.forName("id").in(subCriteria));
//      List<User> results = criteria.list();
//      return results;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<User> getListUserAnswerbyDate(LocalDate beginDate, LocalDate endDate, Integer pageIndex,
//      Integer perPage) {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//
//      Criteria criteria = session.createCriteria(User.class)
//                .add(Restrictions.between("createTime", beginDate, endDate))
//                .setFirstResult((pageIndex - 1) * perPage)
//                .setMaxResults(pageIndex * perPage);
//
//      List<User> list = criteria.list();
//
//      session.getTransaction().commit();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//    }
//    return null;
//  }
//
//  @Override
//  public List<User> getUserByExampleObject() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
////    Example example = Example.create(criteria);
//      Criteria criteria = session.createCriteria(User.class)
//              .add(Example.create(new User("192.168.0.2")));
//      List<User> list = criteria.list();
//      session.getTransaction().commit();
//      session.close();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//
//    }
//    return null;
//  }
//
//  @Override
//  public List<Answer> getAnswerbyTextCondition() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//
//      Criteria criteria = session.createCriteria(Answer.class)
//            .add(Restrictions.sqlRestriction("text like '%[A-Z][A-Za-z]%'")); 
//      List<Answer> list = criteria.list();
//      session.getTransaction().commit();
//      session.close();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//
//    }
//    return null;
//  }
//
//  @Override
//  public List<Answer> getListAnswerUserByCondition() {
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    try {
//      session.beginTransaction();
//
//      Criteria criteria = session.createCriteria(Answer.class)
//            .add(Restrictions.sqlRestriction("{alias}.text like '%java%'"));
//      List<Answer> list = criteria.list();
//      session.getTransaction().commit();
//      session.close();
//      return list;
//    } catch (Exception e) {
//      e.printStackTrace();
//      session.getTransaction().rollback();
//      session.close();
//
//    }
//    return null;
//  }
//
//}
