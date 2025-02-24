package src;

public class Main {
    public static void main(String[] args) {
        String[] fall25Courses = {"CS111", "CS17", "CS15"};
        Registration fall25 = new Registration(fall25Courses);
        System.out.println(fall25);
        fall25.enroll("Priya", "CS111");
        System.out.println(fall25);
    }
}
