package com.ymhase.hashmapquestion;

public class Student {

    private String name;
    private int rollNo;

    public Student(String string, int rollNo) {
	super();
	this.name = string;
	this.rollNo = rollNo;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getRollNo() {
	return rollNo;
    }

    public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object arg0) {

	System.out.println("called equlas");
	return super.equals(arg0);
    }
    
    
    @Override
    public int hashCode() {

	System.out.println("called hash code");
	return super.hashCode();
    }
    
}
