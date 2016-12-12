package com.test.professor;

import com.test.group.Group;
import com.test.student.Student;

import java.util.List;

public interface ProfessorService extends BasedProfessorService{

    /**
     *
     * @param allStudents - a List of all Students at School (for example)
     * @param group - a group object by which we want to filter our students
     * @param presented - identifier to mark all present students
     * @return - the String (not to write cycle in main method) of all present students
     */
    String listOfPresentedStudents(List<Student> allStudents, Group group, boolean presented);
}
