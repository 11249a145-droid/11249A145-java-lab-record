public class TrainException {
    public static void main (String[]args){
        String train[]={"12635","22675","16853"};
        try{
            System.out.println(train[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception Handled");
        }
    }
}