package com.project.model.portfolio;

public class PortfolioDTO {
    private PortfolioDTO() {}
    // 포트폴리오 데이터베이스는 아이디당 한개만 설정 가능 (한개로 통합시킴)
    public static class AddMod {
        private String uid;
        private String pintro;
        private String purl;
        private String pjob;

        public String getUid() {
            return this.uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
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

        public String getPjob() {
            return this.pjob;
        }

        public void setPjob(String pjob) {
            this.pjob = pjob;
        }
        
    }
}
