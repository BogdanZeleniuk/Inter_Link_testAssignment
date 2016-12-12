package com.test.student;

import com.test.group.Group;

public class CourseLeader extends Student{

    public CourseLeader(String firstName, String lastName, double averageGrade, boolean presented, Group group, Sex sex, double percentOfSkippingLessons) {
        super(firstName, lastName, averageGrade, presented, group, sex, percentOfSkippingLessons);
    }
}
