package com.test.student;


import com.test.group.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class CourseLeaderAppointmentImpl implements CourseLeaderAppointment {
    /**
        If someone in a definite group has the best grade - then they (he/she) are CourseLeader.
        If we have 2 or more students with equal grades - then we determine our CourseLeader
        who has the smaller percentage of skipped lessons.
        You can implement CourseLeaderAppointment and determine CourseLeader in another way
     */

    private static final Logger LOG = LoggerFactory.getLogger(CourseLeaderAppointmentImpl.class);

    @Override
    public CourseLeader getCourseLeader(List<Student> allStudents, Group group) {
        CourseLeader head;

        List<Student> filteredByGroup = allStudents.stream().filter(student -> student.getGroup() != null && student.getGroup().getName().equals(group.getName())).collect(Collectors.toList());
        if (filteredByGroup.size() != 0 && !filteredByGroup.isEmpty()) {
            head = new CourseLeader(
                    filteredByGroup.get(0).getFirstName(),
                    filteredByGroup.get(0).getLastName(),
                    filteredByGroup.get(0).getAverageGrade(),
                    filteredByGroup.get(0).isPresented(),
                    filteredByGroup.get(0).getGroup(),
                    filteredByGroup.get(0).getSex(),
                    filteredByGroup.get(0).getPercentOfSkippingLessons());
            for (Student student : filteredByGroup) {
                if (student.getAverageGrade() > head.getAverageGrade()) {
                    head = new CourseLeader(
                            student.getFirstName(),
                            student.getLastName(),
                            student.getAverageGrade(),
                            student.isPresented(),
                            student.getGroup(),
                            student.getSex(),
                            student.getPercentOfSkippingLessons());
                } else if (student.getAverageGrade() == head.getAverageGrade()
                        && student.getPercentOfSkippingLessons() < head.getPercentOfSkippingLessons()) {
                    head = new CourseLeader(
                            student.getFirstName(),
                            student.getLastName(),
                            student.getAverageGrade(),
                            student.isPresented(),
                            student.getGroup(),
                            student.getSex(),
                            student.getPercentOfSkippingLessons());
                }
            }
        }
        else {
            LOG.debug("bad credentials in getCourseLeader() with parameters: allStudents - " + allStudents + ", group " + group);
            throw new IndexOutOfBoundsException("You can not choose the CourseLeader");
        }
        return head;
    }
}
