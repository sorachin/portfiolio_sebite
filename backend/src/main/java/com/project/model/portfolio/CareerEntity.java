package com.project.model.portfolio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// import lombok.Builder;
import lombok.ToString;

@ToString
// @Builder
@Entity
@Table(name = "career")
public class CareerEntity {
    
    @Id
    private String uid;
    private int cid;
    private String cname;
    private String cjob;
    private String cstartdate;
    private String cenddate;
    private String crole;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCjob() {
        return cjob;
    }

    public void setCjob(String cjob) {
        this.cjob = cjob;
    }

    public String getCstartdate() {
        return cstartdate;
    }

    public void setCstartdate(String cstartdate) {
        this.cstartdate = cstartdate;
    }

    public String getCenddate() {
        return cenddate;
    }

    public void setCenddate(String cenddate) {
        this.cenddate = cenddate;
    }

    public String getCrole() {
        return crole;
    }

    public void setCrole(String crole) {
        this.crole = crole;
    }
    
    public CareerEntity() {};

    public CareerEntity(String uid, String cname, String cjob, String cstartdate, String cenddate,
            String crole) {
        this.uid = uid;
        this.cname = cname;
        this.cjob = cjob;
        this.cstartdate = cstartdate;
        this.cenddate = cenddate;
        this.crole = crole;
    }
}
