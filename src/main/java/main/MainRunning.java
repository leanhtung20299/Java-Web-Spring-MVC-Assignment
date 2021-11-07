//package main;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//import org.hibernate.Session;
//
//import DAO.AnswerUserDAO;
//import DAO.AnswerUserDAOImpl;
//import utils.HibernateUtils;
//
//public class MainRunning {
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    Session session = HibernateUtils.getSessionFactory().openSession();
//    AnswerUserDAO answerUserDAO = new AnswerUserDAOImpl();
//    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//    while (true) {
//      Initial();
//      Integer choice = Integer.parseInt(sc.nextLine());
//      switch (choice) {
//      case 1:
//        System.out.println(answerUserDAO.getListAnswerLength());
//        break;
//      case 2:
//        answerUserDAO.panigationListAnswer(1, 5).stream().forEach(u -> System.out.println(u));
//        break;
//      case 3:
//        answerUserDAO.searchListAnswerByAttribute(1, 5, "text", "java").stream().forEach(u -> System.out.println(u));
//        break;
//      case 4:
//        LocalDate day = LocalDate.parse("2021-09-10", pattern);
//        answerUserDAO.getNumberUserAnswerTheMostQuestionInDay(day, 5).stream().forEach(u -> System.out.println(u));
//        break;
//      case 5:
//        LocalDate beginTime = LocalDate.parse("2021-09-10", pattern);
//        LocalDate endTime = LocalDate.parse("2021-09-21", pattern);
//        answerUserDAO.getListUserAnswerbyDate(beginTime, endTime, 1, 5).stream().forEach(u -> System.out.println(u));
//        break;
//      case 6:
//        answerUserDAO.getUserByExampleObject().stream().forEach(u->System.out.println(u));;
//        break;
//      case 7:
//        answerUserDAO.getListAnswerUserSortOrderBy().stream().forEach(u -> System.out.println(u));
//        break;
//
//      case 8:
//        answerUserDAO.getListUserbyAnswerUserID().stream().forEach(u -> System.out.println(u));
//        break;
//      case 9:
//        answerUserDAO.getListAnswerUserByCondition().stream().forEach(u -> System.out.println(u));
//        break;
//      case 10:
//        answerUserDAO.getAnswerbyTextCondition().stream().forEach(u -> System.out.println(u));
//        break;
//      }
//
//    }
//  }
//
//  public static void Initial() {
//    System.out.println("1 . get Answer length");
//    System.out.println("2 . panigation List Answer");
//    System.out.println("3 . search Answer By Attribute");
//    System.out.println("4 . get Number User Answer The Most Question In Day");
//    System.out.println("5 . get List User Answer by Date");
//    System.out.println("6 . static List User No Longer Return System");
//    System.out.println("7 . get List Answer User Sort OrderBy");
//    System.out.println("8 . get List User by Answer User ID");
//    System.out.println("9 . get List Answer User By Condition Length Text");
//    System.out.println("10. get Answer by Text Condition");
//  }
//}
//
////  public static void DurationTime() {
////    AnswerUserDAO dao = new AnswerUserDAOImpl();
////    long startTime = System.currentTimeMillis();
////    for (int i = 0; i <= 3000; i++) {
////      dao.getListAnswerUserSortOrderBy();
////    }
////    long stopTime = System.currentTimeMillis();
////
////    System.out.println(stopTime-startTime);
////  
////  }
////  public static void DurationTime2() {
////    AnswerUserDAO dao = new AnswerUserDAOImpl();
////   
////    long startTime2 = System.currentTimeMillis();
////    for (int i = 0; i <= 3000; i++) {
////      dao.getListAnswerUserSortOrderByPerformance();
////    }
////    long stopTime2 = System.currentTimeMillis();
////
////    System.out.println(stopTime2-startTime2);
////  }
