package com.test.professor;

import com.test.group.Group;
import com.test.student.Sex;
import com.test.student.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Professor implements ProfessorService{

    private static final Logger LOG = LoggerFactory.getLogger(Professor.class);

    private String firstName;
    private String lastName;
    private String subject;
    private Sex sex;

    public Professor() {
    }

    public Professor(String firstName, String lastName, String subject, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.sex = sex;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


    @Override
    public String listOfPresentedStudents(List<Student> allStudents, Group group, boolean presented) {
        List<Student> listOfPresentedStudents = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        listOfPresentedStudents.addAll(allStudents.stream().filter(student -> group.getName() != null && group.getName().equals(student.getGroup().getName()) && student.isPresented() == presented).collect(Collectors.toList()));
        for (Student listOfPresentedStudent : listOfPresentedStudents) {
            sb.append(listOfPresentedStudent).append("\n");
        }
        LOG.info("listOfPresentedStudents() with group " + group);
        return sb.toString();
    }

    @Override
    public String introduce() {
        return "Hello, my name is " + firstName + " " + lastName + ", I will teach you " + subject;
    }

    @Override
    public String toString() {
        return "Professor " +
                firstName + lastName + ", subjectName='" + subject + ", sex=" + sex;
    }
}
