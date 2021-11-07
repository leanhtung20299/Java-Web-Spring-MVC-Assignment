package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_question")
public class Question implements Serializable{
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "is_multiple")
  private boolean isMultiple;
  
  @Column(name = "is_required")
  private boolean isRequired;
  
  @Column(name = "text")
  private String text;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public boolean isMultiple() {
    return isMultiple;
  }

  public void setMultiple(boolean isMultiple) {
    this.isMultiple = isMultiple;
  }

  public boolean isRequired() {
    return isRequired;
  }

  public void setRequired(boolean isRequired) {
    this.isRequired = isRequired;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
  
  
}
