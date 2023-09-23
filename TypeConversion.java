public class TypeConversion {
    public static void main(String args[])
    {
        int a=12;
        double db=a;

        double x=123.24;

        // int val=x; // error 
        int val=(int)x;
        System.out.println(db);
        System.out.println(val); // 123


    }
}
