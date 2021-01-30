package com.project.model.user;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
@Entity
@Table(name = "userinfo")
public class UserEntity {

    @Id 
    private String uid;
    private String upw;
    private String uname;
    private String uemail;
    private String uphone;
    private String uaddr;
    private LocalDateTime ucreatedate;

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return this.upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return this.uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphone() {
		return this.uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUaddr() {
		return this.uaddr;
	}

	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}

	public LocalDateTime getUcreatedate() {
		return this.ucreatedate;
	}

	public void setUcreatedate(LocalDateTime ucreatedate) {
		this.ucreatedate = ucreatedate;
	}


    public UserEntity(){};
    
    public UserEntity(String uid, String upw,String uname,String uemail,String uphone,String uaddr,LocalDateTime ucreatedate){
      
        this.uid = uid;
        this.upw = upw;
        this.uname = uname;
        this.uemail = uemail;
        this.uphone = uphone;
        this.uaddr = uaddr;
        this.ucreatedate = ucreatedate;
    }
    
}
