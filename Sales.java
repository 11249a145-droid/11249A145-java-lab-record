public class Sales{
    public static void main(String[]args){
        int sales[]={2500,3200,1500,4100,2800,3900,2100,4600,3500,2900,3300,2700};
        int max=sales[0];
        int min=sales[0];
        for(int i=1;i<sales.length;i++)
        {
            if(sales[i]>max)
                max=sales[i];
            if(sales[i]<min)
                min=sales[i];
        }
        System.out.println("Maximum Sales="+max);
        System.out.println("Minimum Sales="+min);
    }
}