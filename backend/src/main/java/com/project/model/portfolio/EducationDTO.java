package com.project.model.portfolio;

public class EducationDTO {
    private EducationDTO() {}
    public class Add {
        private String uid;
        private String ename;
        private String edegree;
        private String estartdate;
        private String eenddate;
        private String emajor;
        public String getUid() {
            return this.uid;
        }
        public String getEname() {
            return this.ename;
        }
        public String getEdegree() {
            return this.edegree;
        }
        public String getEstartdate() {
            return this.estartdate;
        }
        public String getEenddate() {
            return this.eenddate;
        }
        public String getEmajor() {
            return this.emajor;
        }
    }

    public class Mod {
        private int eid;
        private String ename;
        private String edegree;
        private String estartdate;
        private String eenddate;
        private String emajor;
        public int getEid() {
            return this.eid;
        }
        public String getEname() {
            return this.ename;
        }
        public String getEdegree() {
            return this.edegree;
        }
        public String getEstartdate() {
            return this.estartdate;
        }
        public String getEenddate() {
            return this.eenddate;
        }
        public String getEmajor() {
            return this.emajor;
        }
    }
}
