
class Student {
    int age = 0;
    String name = "";

    public Student() {
        System.out.println("Studnet construcor called !");
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;

    }

    void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

public class ThisKeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Sonia", 20);
        s2.printInfo();
        s1.age = 22;
        s1.name = "Vipul";
        // s1.printInfo();

    }
}
