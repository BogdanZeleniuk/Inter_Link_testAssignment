package com.test.classbook;

import com.test.group.Group;
import com.test.student.Sex;
import com.test.student.Student;

import java.util.List;

public interface ClassBookService {

    /**
     *
     * @param allStudents - a List of all Students at School (for example)
     * @param lastName - a name of a student/students we want to look for
     * @return the String (not to write cycle in main method) of a student/students we want to find by name
     */
    String getStudentByLastName(List<Student> allStudents, String lastName);

    /**
     *
     * @param allStudents - a List of all Students at School (for example)
     * @param group - a group object by which we want to filter our students
     * @return - the String (not to write cycle in main method) of a student/students we want to find in a definite group
     */
    String getAllStudentsInGroup(List<Student> allStudents, Group group);

    /**
     *
     * @param allStudents - a List of all Students at School (for example)
     * @param sex - a sex by which we want to filter our students
     * @return - the String (not to  write cycle in main method) of a student/students we want to find by sex
     */
    String getStudentBySex(List<Student> allStudents, Sex sex);
}
