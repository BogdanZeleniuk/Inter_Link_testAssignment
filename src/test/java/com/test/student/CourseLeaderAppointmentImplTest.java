package com.test.student;

import com.test.group.Group;
import com.test.group.JavaGroup;
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

@RunWith(JUnit4.class)
public class CourseLeaderAppointmentImplTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private Group group = new JavaGroup();
    private CourseLeaderAppointment service = new CourseLeaderAppointmentImpl();
    private Student student_one = new CourseLeader("Mark", "Zuckenberg", 99.77, false, new JavaGroup(), MAN, 0.77);

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
    public void selectCourseLeaderTest(){
        Assert.assertEquals(student_one.toString(),
                service.getCourseLeader(LIST_OF_STUDENTS, group).toString());
    }

}