package DTO;

import java.time.LocalDate;

import javax.persistence.Column;

public class UserDTO {
  private Long countip;

  private String ip;

  private LocalDate createTime;

  public Long getId() {
    return countip;
  }

  public void setId(Long id) {
    this.countip = countip;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public LocalDate getCreateTime() {
    return createTime;
  }

  public void setCreateTime(LocalDate createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "UserDTO [countip=" + countip + ", ip=" + ip + ", createTime=" + createTime + "]";
  }
  
}
