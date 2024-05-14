package Day6_8May;

public class School {

    private String schoolName;
    private Student student;
    private Subject subject;

    // Constructor
    public School(String schoolName, Student student, Subject subject) {
        this.schoolName = schoolName;
        this.student = student;
        this.subject = subject;
    }

    // Getter methods
    public String getSchoolName() {
        return schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void displaySchoolInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students:");

        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Class: " + student.getClassName());

        System.out.println("Subjects:");
        System.out.println("Sub1: " + subject.getSub1() + ", Sub2: " + subject.getSub2()+ " , Sub3 :  " + subject.getSub3() + ", Sub4 : " + subject.getSub4());
    }

    public static void main(String[] args) {

        Subject subject = new Subject("Math", "Eng", "Hindi", "SSC");

        Student student = new Student("Mohit", 15, "10th Grade", subject);

        School school = new School("XYZ School", student, subject);

        school.displaySchoolInfo();
    }
}