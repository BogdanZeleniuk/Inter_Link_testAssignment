package com.test.student;

import com.test.group.Group;

import java.util.List;

public interface CourseLeaderAppointment {
    /**
     *
     * @param allStudents - a List of all Students at School (for example)
     * @param group - a group object by which we want to filter our students
     * @return - the CourseLeader of a definite group
     */
    CourseLeader getCourseLeader(List<Student> allStudents, Group group);
}
