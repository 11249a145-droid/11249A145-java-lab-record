import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        int n=17;
        int flag=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(n + " is a prime Number");
        else
            System.out.println(n + "is Not a Prime Number");
    }
}