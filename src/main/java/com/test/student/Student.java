package com.test.student;

import com.test.group.Group;

public class Student {
    private String firstName;
    private String lastName;
    private double averageGrade;
    private boolean presented;
    private Group group;
    private Sex sex;
    private double percentOfSkippingLessons;

    public Student() {
    }

    public Student(String firstName, String lastName, double averageGrade, boolean presented, Group group, Sex sex, double percentOfSkippingLessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
        this.presented = presented;
        this.group = group;
        this.sex = sex;
        this.percentOfSkippingLessons = percentOfSkippingLessons;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public boolean isPresented() {
        return presented;
    }

    public void setPresented(boolean presented) {
        this.presented = presented;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getPercentOfSkippingLessons() {
        return percentOfSkippingLessons;
    }

    public void setPercentOfSkippingLessons(double percentOfSkippingLessons) {
        this.percentOfSkippingLessons = percentOfSkippingLessons;
    }

    @Override
    public String toString() {
        return firstName + " "+ lastName + ", averageGrade=" + averageGrade + ", " + (presented ? "I am hear" : "" )+
                ", group=" + group + ", " + sex + ", percentOfSkippingLessons=" + percentOfSkippingLessons;
    }
}
