package com.test.student;

import com.test.group.Group;

import java.util.List;

public interface CourseLeaderAppointment {
    /**
     *
     * @param allStudents - a List of all Students in a School (for example)
     * @param group - a group object we want to filter our students
     * @return - the CourseLeader of definite group
     */
    CourseLeader getCourseLeader(List<Student> allStudents, Group group);
}
