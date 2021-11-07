package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_question_answer")
public class QuestionAnswer implements Serializable{
  @Id
  @JoinColumn(name = "answer_id")
  @ManyToOne
  private Answer answer;
  
  @Id
  @JoinColumn(name = "question_id")
  @ManyToOne
  private Question questionId;

  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }

  public Question getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Question questionId) {
    this.questionId = questionId;
  }
  
}
