package com.project.model.portfolio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// import lombok.Builder;
import lombok.ToString;

@ToString
// @Builder
//@NoArgsConstructor
@Entity
@Table(name = "education")
public class EducationEntity {
    @Id
    private String uid;
    private int eid;
    private String ename;
    private String edegree;
    private String estartdate;
    private String eenddate;
    private String emajor;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdegree() {
        return edegree;
    }

    public void setEdegree(String edegree) {
        this.edegree = edegree;
    }

    public String getEstartdate() {
        return estartdate;
    }

    public void setEstartdate(String estartdate) {
        this.estartdate = estartdate;
    }

    public String getEenddate() {
        return eenddate;
    }

    public void setEenddate(String eenddate) {
        this.eenddate = eenddate;
    }

    public String getEmajor() {
        return emajor;
    }

    public void setEmajor(String emajor) {
        this.emajor = emajor;
    }

    public EducationEntity() {}

    public EducationEntity(String uid, String ename, String edegree, String estartdate, String eenddate,
            String emajor) {
        this.uid = uid;
        // this.eid = eid;
        this.ename = ename;
        this.edegree = edegree;
        this.estartdate = estartdate;
        this.eenddate = eenddate;
        this.emajor = emajor;
    }


}


