class Person{
    void eat()
    {
        System.out.println("Person is walking");
    }
    void eat(String person, int age)
    {
        System.out.println(person+" age is "+age+" currently eating..");
    }
}
public class Polymorphism {
    public static void main(String args[])
    {
        String  name="Vipul";
        int age=12;

        Person p1=new Person();

        p1.eat();
        p1.eat(name,age);


    }
}
/*
 
Polymorphism
If one task is performed in different ways, it is known as polymorphism. 
For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

In Java, we use method overloading and method overriding to achieve polymorphism.

Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc.
 */