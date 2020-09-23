import java.util.Scanner;
public class ass2q3 {
    public static int func(String s1,String s2)
    {
        int i=0,j=0;
         while(i<s1.length()&&j<s2.length())
         {
             int x=(int)s1.charAt(i)-(int)s2.charAt(j);
             if(x==0)
             {
                 i++;
                 j++;
                 continue;
             }
             else if(x>0)
             {
                 return x;
             }
             else
             {
                return x;
             }
         }
         if (s1.length() < s2.length()) { 
            return(s1.length()-s2.length()); 
        }  
        else if (s1.length() > s2.length()) { 
            return(s1.length()-s2.length()); 
        } 
        else{
         return 0;
        }
    }
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of strings ");
        n = scan.nextInt();
        String arr[] = new String[n];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Strings ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        for (int i = 0; i<n; i++) 
        {
            for (int j=i+1; j<n; j++)
            { 
                if(func(arr[i],arr[j])>0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<=n-1; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}