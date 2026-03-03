class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Person p = new Person("Dora", 18);
        p.display();
    }
}
