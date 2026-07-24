
abstract class Course {
    abstract void enroll_student(String student_name);

    abstract void assign_grade(String student_name, String grade);
}

class OnlineCourse extends Course {
    private String platform;

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    void enroll_student(String student_name) {
        System.out.println("Enrolling " + student_name + " to the online course on " + platform);

    }

    @Override
    void assign_grade(String student_name, String grade) {
        System.out.println("Assigning grade " + grade + " to " + student_name + " in the online course on " + platform);
    }
}

class InPersonCourse extends Course {
    private String classroom_location;

    public void setClassroomLocation(String classroom_location) {
        this.classroom_location = classroom_location;
    }

    public String getClassroomLocation() {
        return classroom_location;
    }

    @Override
    void enroll_student(String student_name) {
        System.out.println("Enrolling " + student_name + " to the in-person course at " + classroom_location);
    }

    @Override
    void assign_grade(String student_name, String grade) {
        System.out.println("Assigning grade " + grade + " to " + student_name + " in the in-person course at "
                + classroom_location);
    }
}

public class MainCourseTest {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.setPlatform("Udemy");
        onlineCourse.enroll_student("Alice");
        onlineCourse.assign_grade("Alice", "A");

        InPersonCourse inPersonCourse = new InPersonCourse();
        inPersonCourse.setClassroomLocation("Room 101");
        inPersonCourse.enroll_student("Bob");
        inPersonCourse.assign_grade("Bob", "B+");
    }
}
