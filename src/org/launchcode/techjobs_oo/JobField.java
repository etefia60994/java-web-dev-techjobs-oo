package org.launchcode.techjobs_oo;

import org.launchcode.techjobs_oo.Employer;

import java.util.*;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == "" || value == null){
            return "No Data Available";}
        else{
            return value;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    @Override
    public abstract boolean equals(Object o);
    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
       return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
