package com.test.classbook;

import com.test.group.Group;
import com.test.student.Sex;
import com.test.student.Student;

import java.util.List;

public interface ClassBookService {

    /**
     *
     * @param allStudents - a List of all Students in a School (for example)
     * @param lastName - a name of student/students we want to look for
     * @return the String (to don`t write cycle in main method) of student/students we want to find by name
     */
    String getStudentByLastName(List<Student> allStudents, String lastName);

    /**
     *
     * @param allStudents - a List of all Students in a School (for example)
     * @param group - a group object we want to filter our students
     * @return - the String (to don`t write cycle in main method) of student/students we want to find in definite group
     */
    String getAllStudentsInGroup(List<Student> allStudents, Group group);

    /**
     *
     * @param allStudents - a List of all Students in a School (for example)
     * @param sex - a sex we want to filter our students
     * @return - the String (to don`t write cycle in main method) of student/students we want to find by sex
     */
    String getStudentBySex(List<Student> allStudents, Sex sex);
}
