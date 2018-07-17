package com.example.ooad.domain;

public class Person {

    private Integer ssn;

    private String name;

    private String password;

    public Person(Integer ssn,String name,String password){

        this.ssn = ssn;
        this.name = name;
        this.password = password;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
