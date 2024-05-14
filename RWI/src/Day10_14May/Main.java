package Day10_14May;

import java.util.Comparator;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getMarks(), s2.getMarks());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 90);

        MarksComparator comparator = new MarksComparator();

        int comparisonResult = comparator.compare(student1, student2);

        if (comparisonResult > 0) {
            System.out.println("Higher");
        } else if (comparisonResult < 0) {
            System.out.println("Less");
        } else {
            System.out.println("Equal");
        }
    }
}