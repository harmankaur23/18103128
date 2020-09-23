import java.util.Scanner;
public class ass2q1 {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter two strings");
         String s1=sc.nextLine();
         String s2=sc.nextLine();
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
                 System.out.println(s1+" is greater than "+s2);
                 System.out.println("Value returned by string library function would be "+ x);
                 sc.close();
                 return;
             }
             else
             {
                System.out.println(s1+" is less than "+s2);
                System.out.println("Value returned by string library function would be "+ x);
                sc.close();
                return;
             }
         }
         if (s1.length() < s2.length()) { 
            System.out.println(s1.length()-s2.length()); 
        }  
        else if (s1.length() > s2.length()) { 
            System.out.println(s1.length()-s2.length()); 
        } 
        else{
         System.out.println(s2+" is equal to "+s1);
         System.out.println("Value returned by string library function would be 0");
        }
         sc.close();
    }
}