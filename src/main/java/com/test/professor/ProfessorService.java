package com.test.professor;

import com.test.group.Group;
import com.test.student.Student;

import java.util.List;

public interface ProfessorService extends BasedProfessorService{

    /**
     *
     * @param allStudents - a List of all Students in a School (for example)
     * @param group - a group object we want to filter our students
     * @param presented - identifier to mark all presented students
     * @return - the String (to don`t write cycle in main method) of all presented student/students
     */
    String listOfPresentedStudents(List<Student> allStudents, Group group, boolean presented);
}
