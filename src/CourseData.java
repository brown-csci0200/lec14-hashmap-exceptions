package src;

import java.util.LinkedList;

public class CourseData {
    LinkedList<String> allStudents;

    public CourseData() {
        this.allStudents = new LinkedList<>();
    }

    // addStudent adds student to allStudents if they are not already there
    public void addStudent(String student) {
        if (this.allStudents.contains(student))
            throw new RuntimeException("Student " + student + " is already in course");
        this.allStudents.add(student);
    }

    @Override
    public String toString() {
        return this.allStudents.toString();
    }
}
