package com.test.data;

import com.test.group.DotNetGroup;
import com.test.group.JavaGroup;
import com.test.group.JavaScriptGroup;
import com.test.student.Sex;
import com.test.student.Student;

import java.util.ArrayList;
import java.util.List;
/**
 List of data for testing our application
 */
public class TestData {

    public static final List<Student> LIST_OF_STUDENTS = new ArrayList<>();
    static {
        LIST_OF_STUDENTS.add(new Student("Bill","Gates", 99.77, false, new DotNetGroup(), Sex.MAN, 0.88));
        LIST_OF_STUDENTS.add(new Student("Warren","Buffett", 95.11, true, new JavaScriptGroup(), Sex.MAN, 0.52));
        LIST_OF_STUDENTS.add(new Student("Christy","Walton", 88.17, true, new JavaGroup(), Sex.WOMAN, 0.02));
        LIST_OF_STUDENTS.add(new Student("Carlos","Slim", 90.13, false, new JavaGroup(), Sex.MAN, 0.23));
        LIST_OF_STUDENTS.add(new Student("Larry","Ellison", 99.13, true, new JavaScriptGroup(), Sex.MAN, 0.99));
        LIST_OF_STUDENTS.add(new Student("Liliane","Bettencourt", 93.10, true, new DotNetGroup(), Sex.WOMAN, 0.23));
        LIST_OF_STUDENTS.add(new Student("Amancio","Ortega", 69.33, true, new JavaScriptGroup(), Sex.MAN, 0.12));
        LIST_OF_STUDENTS.add(new Student("Mark","Zuckenberg", 99.77, false, new JavaGroup(), Sex.MAN, 0.77));
        LIST_OF_STUDENTS.add(new Student("Natalia","Poroschenko", 20.97, true, new DotNetGroup(), Sex.WOMAN, 0.77));
        LIST_OF_STUDENTS.add(new Student("Jeff","Bezos", 98.10, true, new JavaGroup(), Sex.MAN, 0.14));
        LIST_OF_STUDENTS.add(new Student("Evan","Spiegel", 77.77, true, new JavaGroup(), Sex.MAN, 0.94));
        LIST_OF_STUDENTS.add(new Student("Alice","Walton", 91.19, true, new JavaScriptGroup(), Sex.WOMAN, 0.00));
        LIST_OF_STUDENTS.add(new Student("Wang","Jianlin", 88.77, true, new JavaScriptGroup(), Sex.MAN, 0.84));
        LIST_OF_STUDENTS.add(new Student("Adam","Neumann", 61.71, false, new JavaGroup(), Sex.MAN, 0.19));
        LIST_OF_STUDENTS.add(new Student("Migual","McKelvey", 99.00, true, new JavaScriptGroup(), Sex.MAN, 0.04));
        LIST_OF_STUDENTS.add(new Student("Hillary","Clinton", 74.79, true, new DotNetGroup(), Sex.WOMAN, 0.44));
        LIST_OF_STUDENTS.add(new Student("Evan","Sharp", 85.77, false, new DotNetGroup(), Sex.WOMAN, 0.94));
        LIST_OF_STUDENTS.add(new Student("David","Rockfeller", 35.47, false, new JavaGroup(), Sex.MAN, 0.34));
        LIST_OF_STUDENTS.add(new Student("Sam","Walton", 40.56, true, new DotNetGroup(), Sex.WOMAN, 0.41));
        LIST_OF_STUDENTS.add(new Student("Denny","Sturkley", 90.56, true, new JavaScriptGroup(), Sex.MAN, 0.91));
    }
}
