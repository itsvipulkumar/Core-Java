public class demo {
    public static void main(String args[])
    {
        int num= 134;
  int i=1;
  int sum=0;
    while(num!=0)
    {
        int rem=num%10;
        if(rem==3)
        rem=5;
        sum=sum+rem*i;
        i=i*10;
        num=num/10;
    }
    System.out.println(sum);
    }
}
