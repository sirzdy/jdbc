package com.zdy.model;

import java.util.Date;

/**
 * Created by zdy on 2016/12/27 0027.
 */
public class Model {
    private String no;
    private String pwd;
    /*private String name;
    private byte sex;
    private String tel;
    private String email;
    private String qq;
    private String wechat;
    private String country;
    private String province;
    private String city;
    private String address;
    private String school;
    private Date birthday;*/

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Model{" +
                "no='" + no + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
