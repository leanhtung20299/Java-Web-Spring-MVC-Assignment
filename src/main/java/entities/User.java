package entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_User")
public class User{
  @Id 
  @Column(name = "username")
  private Integer userName;
  
  @Column(name = "password")
  private String passWord;
  
  @Column(name = "create_time")
  private LocalDate createTime;

   public User() {
    // TODO Auto-generated constructor stub
  }
  
  

 
  

  public Integer getUserName() {
    return userName;
  }



  public void setUserName(Integer userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public LocalDate getCreateTime() {
    return createTime;
  }

  public void setCreateTime(LocalDate createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "User [userName=" + userName + ", passWord=" + passWord + ", createTime=" + createTime + "]";
  }

 
  
}
