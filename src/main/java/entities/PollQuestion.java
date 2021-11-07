package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_poll_question")
public class PollQuestion implements Serializable{
  @Id
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "poll_id")
  private Poll pollId;
  
  @Id
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "question_id")
  private Question questionId;

  public Poll getPollId() {
    return pollId;
  }

  public void setPollId(Poll pollId) {
    this.pollId = pollId;
  }

  public Question getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Question questionId) {
    this.questionId = questionId;
  }
  
  
}
