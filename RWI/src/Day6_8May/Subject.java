package Day6_8May;

class Subject {
    private String sub1;
    private String sub2;
    private String sub3;
    private String sub4;

    // Constructor
    public Subject(String sub1, String sub2, String sub3, String sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    // Getter methods
    public String getSub1() {
        return sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public String getSub4() {
        return sub4;
    }

    // Override toString method to provide string representation
    @Override
    public String toString() {
        return "Sub1= " + sub1 + ", Sub2= " + sub2 + ", Sub3=  " + sub3 + ", Sub4=  " + sub4;
    }
}