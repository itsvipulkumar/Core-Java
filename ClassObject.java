class Calculator {

    int num1=0;
    int num2=0;
    public int add(int a, int b) {
        int res = a + b;
        return res;
    }

    void sub(int a, int b) {
        int res = a - b;
        System.out.println("Subtration is : " + res);
    }
    void mul(int a, int b) {
        int res = a*b;
        System.out.println("Multiplication  is : " + res);
    }
    void div()
    {
         int res = 5*5;
        System.out.println("Division  is : " + res);
    }
    void printting()
    {
        System.out.println(this.num1);
        System.out.println(this.num2);
    }
}

public class ClassObject {
    public static void main(String args[]) {
        int n1 = 5;
        int n2 = 10;

        Calculator obj = new Calculator();
        Calculator obj2 = new Calculator();
        int ans = obj.add(n1, n2);
        System.out.println("Addition is : " + ans);

        obj.sub(n1, n2);
        obj.mul(n1, n2);
        obj2.num1=10;
        obj2.num2=20;
        obj2.printting();

       

    }
}
