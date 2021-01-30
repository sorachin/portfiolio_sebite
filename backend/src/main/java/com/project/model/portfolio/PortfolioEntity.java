package com.project.model.portfolio;

// import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// import lombok.Builder;
import lombok.ToString;

@ToString
// @Builder
//@NoArgsConstructor
@Entity
@Table(name = "portfolio")
public class PortfolioEntity {

    @Id 
    private String uid;
	private Integer pid;
	private String pintro;
	private String purl;
	private String pjob;

	public String getPjob() {
		return this.pjob;
	}

	public void setPjob(String pjob) {
		this.pjob = pjob;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPintro() {
		return this.pintro;
	}

	public void setPintro(String pintro) {
		this.pintro = pintro;
	}

	public String getPurl() {
		return this.purl;
	}

	public void setPurl(String purl) {
		this.purl = purl;
	}


	// private 

    public PortfolioEntity(){};
    
    public PortfolioEntity(String uid, String pintro,String purl, String pjob){
      
		this.uid = uid;
		// this.pid = pid;
		this.pintro = pintro;
		this.purl = purl;
		this.pjob = pjob;
    }
    
}
