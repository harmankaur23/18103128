import java.util.Scanner;
public class ass2q2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of input");
        int n=sc.nextInt();
        int arr[]=new int[21];
        for(int i=0;i<21;i++)
        arr[i]=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(x<0||x>20)
            {
                System.out.println("Input not in the range");
                sc.close();
                return;
            }
            arr[x]++;
        }
        for(int i=0;i<21;i++)
        {
            for(int j=0;j<arr[i];j++)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}