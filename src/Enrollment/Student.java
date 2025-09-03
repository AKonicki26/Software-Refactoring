package Enrollment;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Student {

    private String name;
    private String Id;

    public Student(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    public void enroll(Enrollment... enrollments) {
        Collections.addAll(this.enrollments, enrollments);
    }

    public List<Enrollment> getEnrollments() {
        return Collections.unmodifiableList(this.enrollments);
    }

    private List<Enrollment> enrollments = new ArrayList<Enrollment>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", enrollments=" + enrollments +
                '}';
    }

    public static void main(String[] args) {
        Student me = new Student("Astrid", "82-1264783");

        Course softwareRefactor = new Course("Software Refactoring", "CSI-320");
        Course seniorCapstone = new Course("Senior Capstone", "ITS-410");
        me.enroll(
                new Enrollment(softwareRefactor, (short) 1, "Fall 2025"),
                new Enrollment(seniorCapstone, (short) 3, "Fall 2025")
        );

        System.out.println(me);
    }

}
