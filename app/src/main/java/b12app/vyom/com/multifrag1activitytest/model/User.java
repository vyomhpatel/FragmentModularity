package b12app.vyom.com.multifrag1activitytest.model;

import com.google.gson.Gson;

import java.io.Serializable;

public class User implements Serializable {


    /**
     * msg : success
     * id : 1249
     * firstname : patel
     * lastname : husain
     * email : vansh3vns@gmail.com
     * mobile : 55565454
     * appapikey  : f91c8b80606534b2d4cf89a7ab65879c
     */

    private String msg;
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String appapikey;

    public static User objectFromData(String str) {

        return new Gson().fromJson(str, User.class);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAppapikey() {
        return appapikey;
    }

    public void setAppapikey(String appapikey) {
        this.appapikey = appapikey;
    }
}