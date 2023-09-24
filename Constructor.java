class Student {
    String name;
    int age = 0;
     static int count=0;
  public Student() {
    count++;
        System.out.println("Student called! "+count);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Vipul", 22);

        s2.printInfo();

    }
}
