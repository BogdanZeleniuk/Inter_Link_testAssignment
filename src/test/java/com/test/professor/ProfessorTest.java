package com.test.professor;

import com.test.group.Group;
import com.test.group.JavaGroup;
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
import static com.test.student.Sex.MAN;
import static com.test.student.Sex.WOMAN;

@RunWith(JUnit4.class)
public class ProfessorTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private Professor professor = new Professor("Ада", "Лавлейс", "Programming", Sex.WOMAN);
    private Group group = new JavaGroup();
    private Student student_one = new Student ("Christy", "Walton", 88.17, true, new JavaGroup(), WOMAN, 0.02);
    private Student student_two = new Student ("Jeff", "Bezos", 98.1, true, new JavaGroup(), MAN, 0.14);
    private Student student_three = new Student ("Evan", "Spiegel", 77.77, true, new JavaGroup(), MAN, 0.94);

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
    public void listOfPresentedStudentsTest() throws Exception {
        Assert.assertEquals(student_one+"\n"+student_two+"\n"+student_three+"\n",
                professor.listOfPresentedStudents(LIST_OF_STUDENTS, group, true));
    }

    @Test
    public void introduceTest() throws Exception {
        Assert.assertEquals("Hello, my name is Ада Лавлейс, I will teach you Programming", professor.introduce());

    }
}