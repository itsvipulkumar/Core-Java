import java.util.*;
import Bank;
class Person{
    String name;

int age=0;
   

    public Person(String name, int age)
    {
           this.age=age;
           this.name=name;
    }
    
     void walk()
    {
        System.out.println("Person is walking !"+this.name+" "+this.age);
    }
}
class Developer extends Person{

    public Developer(String name, int age)
    {
        super(name, age);
          
    }
     public void test()
     {
        System.out.println("This is testing !"+super.name+" "+super.age);

     }
    
}
public class Inheritance {
    public static void main(String args[])
    {
             Person p1=new Person("Vipul",21);
            

            Developer d1= new Developer("Sonia",22);
            p1=d1;
            d1.walk();
             d1.test();
        
          bank.Account
    }
}
