import java.util.Scanner;
public class ass2q6 {
    public static void main(String args[])
    {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        if(x<=0)
        {
            System.out.println("Wrong Input");
            sc.close();
            return;
        }
        int c=0;
        System.out.println("Hailstorm Sequence is");
        // System.out.println();
        while(x!=1&&x<Integer.MAX_VALUE &&c<Integer.MAX_VALUE )
        {
            System.out.println(x+" ");
            if(x%2==0)
            {
                x=x/2;
            }
            else{
                x=x*3+1;
            }
            c++;
        }
        if(x>=Integer.MAX_VALUE)
        System.out.println("Integer overflow reached");
        else if(c==Integer.MAX_VALUE){
            System.out.println("No of steps maxed out.");
        }
        else{
            System.out.println("1");
        }
        sc.close();
    }
}