public class ExceptionDemo {
    public static void main(String[] args){
        try{
            int a=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Handled");
        }
        try{
            int age=Integer.parseInt("ABC");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception Handled");
        }
    }
}