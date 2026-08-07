import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int n=10;
        int a=0,b=1,c;
        System.out.println("Fibonacci series:");
        for(int i=1;i<=n;i++)
{
    System.out.println(a+" ");
    c=a+b;
    a=b;
    b=c;
}   
    }
}