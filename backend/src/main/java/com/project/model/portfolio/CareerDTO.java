package com.project.model.portfolio;

public class CareerDTO {
    private CareerDTO() {}
    public class Add {
        private String uid;
        private String cname;
        private String cjob;
        private String cstartdate;
        private String cenddate;
        private String crole;

        public String getUid() {
            return this.uid;
        }
        public String getCname() {
            return this.cname;
        }
        public String getCjob() {
            return this.cjob;
        }
        public String getCstartdate() {
            return this.cstartdate;
        }
        public String getCenddate() {
            return this.cenddate;
        }
        public String getCrole() {
            return this.crole;
        }
    }

    public class Mod {
        private int cid;
        private String cname;
        private String cjob;
        private String cstartdate;
        private String cenddate;
        private String crole;
        public int getCid() {
            return this.cid;
        }
        public String getCname() {
            return this.cname;
        }
        public String getCjob() {
            return this.cjob;
        }
        public String getCstartdate() {
            return this.cstartdate;
        }
        public String getCenddate() {
            return this.cenddate;
        }
        public String getCrole() {
            return this.crole;
        }
    }
}
