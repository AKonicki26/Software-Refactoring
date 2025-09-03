package Enrollment;

public class Enrollment {

    private Course course;
    private short grade;
    private short section;
    private String semester;
    public Enrollment(Course course, short section, String semester) {
        this.course = course;
        this.grade = 100;
        this.section = section;
        this.semester = semester;
    }

    public short getGrade() {
        return grade;
    }

    public void setGrade(short grade) {
        this.grade = grade;
    }

    public short getSection() {
        return section;
    }

    public void setSection(short section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "course=" + course +
                ", grade=" + grade +
                ", section=" + section +
                '}';
    }
}
