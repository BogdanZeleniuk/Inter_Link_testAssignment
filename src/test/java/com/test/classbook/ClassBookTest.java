package com.test.classbook;

import com.test.group.DotNetGroup;
import com.test.group.JavaGroup;
import com.test.group.JavaScriptGroup;
import com.test.student.Sex;
import com.test.student.Student;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static com.test.data.TestData.LIST_OF_STUDENTS;
import static com.test.student.Sex.WOMAN;

@RunWith(JUnit4.class)
public class ClassBookTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private ClassBookService service = new ClassBook();
    private Student student_one = new Student("Christy","Walton", 88.17, true, new JavaGroup(), WOMAN, 0.02);
    private Student student_two = new Student("Alice","Walton", 91.19, true, new JavaScriptGroup(), WOMAN, 0.00);
    private Student student_three = new Student("Sam", "Walton", 40.56, true, new DotNetGroup(), WOMAN, 0.41);
    private Student student_four = new Student("Liliane", "Bettencourt", 93.1, true, new DotNetGroup(), WOMAN, 0.23);
    private Student student_five = new Student("Natalia", "Poroschenko", 20.97, true, new DotNetGroup(), WOMAN,0.77);
    private Student student_six = new Student ("Hillary", "Clinton", 74.79, true,new DotNetGroup(), WOMAN, 0.44);
    private Student student_seven = new Student("Evan", "Sharp", 85.77, false, new DotNetGroup(), WOMAN, 0.94);
    private Student student_eight = new Student("Bill","Gates", 99.77, false, new DotNetGroup(), Sex.MAN, 0.88);

    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        private void logInfo(Description description, long nanos) {
            log.info(String.format("Test %s spent %d microseconds",
                    description.getMethodName(), TimeUnit.NANOSECONDS.toMicros(nanos)));
        }

        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, nanos);
        }
    };

    @Test
    public void selectStudentByLastNameTest(){
        Assert.assertEquals(student_one + "\n" + student_two + "\n" + student_three + "\n",
                service.getStudentByLastName(LIST_OF_STUDENTS, "Walton"));
    }
    @Test
    public void getStudentBySexTest(){
        Assert.assertEquals(student_one + "\n" + student_four + "\n" + student_five + "\n" + student_two + "\n" +
                        student_six + "\n" + student_seven + "\n" + student_three + "\n",
                service.getStudentBySex(LIST_OF_STUDENTS, WOMAN));
    }
    @Test
    public void getAllStudentsInGroupTest(){
        Assert.assertEquals(student_eight + "\n" + student_four + "\n" + student_five + "\n" + student_six + "\n" +
                        student_seven + "\n" + student_three + "\n",
                service.getAllStudentsInGroup(LIST_OF_STUDENTS, new DotNetGroup()));
    }

}