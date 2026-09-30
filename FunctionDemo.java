class Calculator {
    //funtion overloading
    // method one add two integers
    int add(int a, int b) {
        return a + b;

    }

    //method2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }

}

// class demostring constructors and returning by reference
class Student {
    String name;
    int age;

    //default constructor
    Student() {
        name = "Litesh";
        age = 19;
    }
    //paramateralised constructor
    Student(String n, int a) {
        name = n;
        age = a;

    }
    
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);

    }

    //method returning reference to current object
    Student getsStudent() {
        return this;
    }
    
}

public class FunctionDemo {
    public static void main(String[] args) {
        //---function operator---
        Calculator calc = new Calculator();
        System.out.println("Add two integers: " + calc.add(5, 10));
        System.out.println("Add three integers: " + calc.add(5,10, 15));
        System.out.println("Add two doubles: " + calc.add(5.5, 4.5));

        Student s1 = new Student();
        Student s2 = new Student("Hello", 22);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();


        Student s4 = s2.getsStudent();
        System.out.println("Student s4 details (reference to s2):");
        s4.display();
    }
}
