package src;

import java.util.Arrays;
import java.util.HashMap;

public class Registration {
    HashMap<String, CourseData> allCourses;

    // constructor sets up the hashmap with an empty
    // CourseData object for each course name
    public Registration(String[] coursenames) {
        this.allCourses = new HashMap<>();
        for (String name : Arrays.asList(coursenames)) {
            this.allCourses.put(name, new CourseData());
        }
    }

    // add student to given course
    public void enroll(String student, String coursename) {
        allCourses.get(coursename).addStudent(student);
    }

    @Override
    public String toString() {
        return this.allCourses.toString();
    }
}
