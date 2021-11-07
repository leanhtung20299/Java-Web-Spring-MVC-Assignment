package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "tbl_answer_user")
public class AnswerUser implements Serializable{
  @Id
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "answer_id") 
  private Answer answer;
  
  @Id
  @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")
  private User user;
  
  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "AnswerUser [answer=" + answer + ", user=" + user + "]";
  }
  
}
