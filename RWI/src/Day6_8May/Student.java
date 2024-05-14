package Day6_8May;

class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String className, Subject subject) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Class: " + className;
    }
}