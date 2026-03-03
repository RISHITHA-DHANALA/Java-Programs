class Student {
    String name;
    int roll;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Dora";
        s.roll = 101;

        s.display();
    }
}
