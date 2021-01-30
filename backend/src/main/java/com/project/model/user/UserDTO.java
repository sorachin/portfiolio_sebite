package com.project.model.user;


public class UserDTO {
    private UserDTO() {}
    public static class SignUp {
        private String uid;
        private String upw;
        private String uname;
        private String uemail;
        private String uphone;
        private String uaddr;

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
    }
}
