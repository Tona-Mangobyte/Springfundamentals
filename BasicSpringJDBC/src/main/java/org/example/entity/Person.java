package org.example.entity;

import java.util.Map;

public class Person {
    private Integer ID;
    private String FIRST_NAME;

    public Person() {}
    public Person(Integer ID, String FIRST_NAME, String LAST_NAME) {
        this.ID = ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    private String LAST_NAME;


    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                '}';
    }
}
