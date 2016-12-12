package com.test.classbook;

import com.test.group.Group;
import com.test.student.Sex;
import com.test.student.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ClassBook implements ClassBookService{

    private static final Logger LOG = LoggerFactory.getLogger(ClassBook.class);

    @Override
    public String getStudentByLastName(List<Student> allStudents, String lastName) {
        StringBuilder sb = new StringBuilder();
        List<Student> listOfStudentsByLastName = allStudents.stream().filter(student -> student.getLastName() != null && lastName.equals(student.getLastName())).collect(Collectors.toList());
        for (Student student : listOfStudentsByLastName) {
            sb.append(student).append("\n");
        }
        LOG.info("getStudentByLastName() with lastName " + lastName);
        return sb.toString();
    }

    @Override
    public String getAllStudentsInGroup(List<Student> allStudents, Group group) {
        StringBuilder sb = new StringBuilder();
        List<Student> listOfAllStudentsByGroup = allStudents.stream().filter(student -> student.getGroup() != null && group.getName().equals(student.getGroup().getName())).collect(Collectors.toList());
        for (Student student : listOfAllStudentsByGroup) {
            sb.append(student).append("\n");
        }
        LOG.info("getAllStudentsInGroup() with group " + group);
        return sb.toString();
    }

    @Override
    public String getStudentBySex(List<Student> allStudents, Sex sex) {
        StringBuilder sb = new StringBuilder();
        List<Student> listOfStudentsBySex = allStudents.stream().filter(student -> student.getSex() != null && sex.equals(student.getSex())).collect(Collectors.toList());
        for (Student student : listOfStudentsBySex) {
            sb.append(student).append("\n");
        }
        LOG.info("getStudentBySex() with sex " + sex);
        return sb.toString();
    }
}
