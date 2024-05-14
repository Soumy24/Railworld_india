package Day9_13May;
class Employee {
    void salary() {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Employee {
    // Programmer class inherits from Employee class
    void bonus() {
        System.out.println("Bonus=50000");
    }
}

class singleInheritance {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
    }
}