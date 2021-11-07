package DAO;

import java.time.LocalDate;
import java.util.List;

import entities.Answer;
import entities.AnswerUser;
import entities.Question;
import entities.User;

public interface AnswerUserDAO {  
  public Long getListAnswerLength();
//  public Integer getListAnswerLengthNativeQuery();
  public List<Answer> panigationListAnswer(Integer pageIndex , Integer perPage);
  public List<Answer> searchListAnswerByAttribute(Integer pageIndex , Integer perPage , String attribute, String valueSearch);
  
  public List<User> getNumberUserAnswerTheMostQuestionInDay(LocalDate day,Integer numberUser);
  public List<User> getListUserAnswerbyDate(LocalDate beginDate , LocalDate endDate , Integer pageIndex , Integer perPage);
  public List<User> getUserByExampleObject();
  public List<AnswerUser> getListAnswerUserSortOrderBy();
  public List<AnswerUser> getListAnswerUserSortOrderByPerformance();
  public List<AnswerUser> getListByCondition();
  public List<Answer> getListAnswerUserByCondition();
  public List<User> getListUserbyAnswerUserID();
  // Advanced
  public List<Answer> getAnswerbyTextCondition();

  
}
