package com.test;

import com.test.classbook.ClassBook;
import com.test.classbook.ClassBookService;
import com.test.group.DotNetGroup;
import com.test.group.JavaGroup;
import com.test.group.JavaScriptGroup;
import com.test.professor.Professor;
import com.test.student.CourseLeaderAppointment;
import com.test.student.CourseLeaderAppointmentImpl;
import com.test.student.Sex;

import static com.test.data.TestData.LIST_OF_STUDENTS;

public class Main {

    public static void main(String[] args) {

        ClassBookService classBookService = new ClassBook();

        System.out.println("The list of all students in .net group: \n"
                + classBookService.getAllStudentsInGroup(LIST_OF_STUDENTS, new DotNetGroup()));
        System.out.println("Information about the students with last name Walton: \n"
                + classBookService.getStudentByLastName(LIST_OF_STUDENTS, "Walton"));
        System.out.println("The list of men in school: \n" + classBookService.getStudentBySex(LIST_OF_STUDENTS, Sex.MAN));

        Professor professor = new Professor("Ада", "Лавлейс", "Programming", Sex.WOMAN);
        System.out.println(professor.introduce());
        System.out.println("Lets check who is presented: \n"
                + professor.listOfPresentedStudents(LIST_OF_STUDENTS, new JavaGroup(), true));

        CourseLeaderAppointment studentService = new CourseLeaderAppointmentImpl();
        System.out.println( "The CourseLeader of JavaScript Group is: " +
                studentService.getCourseLeader(LIST_OF_STUDENTS, new JavaScriptGroup()));
    }
}
