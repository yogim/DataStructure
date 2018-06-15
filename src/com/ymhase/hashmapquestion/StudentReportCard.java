package com.ymhase.hashmapquestion;

public class StudentReportCard {
    private int percentage;
    private char grade;
    
    

    public StudentReportCard(int percentage, char grade) {
	super();
	this.percentage = percentage;
	this.grade = grade;
    }

    public int getPercentage() {
	return percentage;
    }

    public void setPercentage(int percentage) {
	this.percentage = percentage;
    }

    public char getGrade() {
	return grade;
    }

    public void setGrade(char grade) {
	this.grade = grade;
    }

}
