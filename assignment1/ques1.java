import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;
public class ques1 {  
    //Function for swapping the characters at position I with character at position j  
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
      
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		// System.out.println(str);
        // int len = str.length();  
        System.out.println("Enter substring");
        String sstr = sc.nextLine();
        int len=sstr.length();
        List<String> nlist = new ArrayList<>();
        // System.out.println("All the permutations of the string are: ");  
        generatePermutation(sstr, 0, len,nlist);  
        // for(int i=0;i<nlist.size();i++)
        // System.out.println(nlist.get(i));
        int count=0;
        for(int i=0;i<=str.length()-len;i++)
        {
            String temp=str.substring(i, i+len);
            // System.out.println(temp);
            if(nlist.contains(temp))
            count++;
        }
        System.out.println(count);
    }  
      
    //Function for generating different permutations of the string  
    public static void generatePermutation(String str, int start, int end,List<String> nlist)  
    {  
        //Prints the permutations  
        if (start == end-1)  
            nlist.add(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end,nlist);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
    }  
} 