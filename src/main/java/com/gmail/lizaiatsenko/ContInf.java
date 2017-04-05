package com.gmail.lizaiatsenko;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by liza on 21/03/2017.
 */
@Entity
public class ContInf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    long phoneNum;
    String email;

    public ContInf() {
    }

    public ContInf(long phoneNum, String email) {
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
