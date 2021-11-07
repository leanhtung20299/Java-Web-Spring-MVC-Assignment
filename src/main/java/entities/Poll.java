package entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_poll")
public class Poll implements Serializable{
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name = "status")
  private String status;
  
  @Column(name = "text")
  private String text;
  
  @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true , mappedBy = "pollId")
  private Set<PollQuestion> listPollQuestion;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Set<PollQuestion> getListPollQuestion() {
    return listPollQuestion;
  }

  public void setListPollQuestion(Set<PollQuestion> listPollQuestion) {
    this.listPollQuestion = listPollQuestion;
  }
  
}
