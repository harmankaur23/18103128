import java.util.*;
public class ass2q5a {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        System.out.println("Enter the limit of universe");
        int lim=sc.nextInt();
        boolean arr1[]=new boolean[lim];
        boolean arr2[]=new boolean[lim];
        System.out.println("Enter number of elements in set 1");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        arr1[i]=false;
        System.out.println("Enter elements of set 1");
        for(int i=0;i<a;i++)
        {
            int x=sc.nextInt();
            if(x<0||x>lim)
            {
                System.out.println("Input out of range");
                sc.close();
                return;
            }
            set1.add(x);
            arr1[x]=true;
        }
        System.out.println("Enter number of elements in set 2");
        int b=sc.nextInt();
        for(int i=0;i<b;i++)
        arr2[i]=false;
        System.out.println("Enter elements of set 2");
        for(int i=0;i<b;i++)
        {
            int x=sc.nextInt();
            if(x<0||x>lim)
            {
                System.out.println("Input out of range");
                sc.close();
                return;
            }
            set2.add(x);
            arr2[x]=true;
        }
        System.out.println("Union of the 2 sets is");
        for(int i=0;i<lim;i++)
        {
            if(arr1[i]==true || arr2[i]==true)
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Intersection of the 2 sets is");
        for(int i=0;i<lim;i++)
        {
            if(arr1[i]==true && arr2[i]==true)
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Set difference of set 1 is");
        for(int i=0;i<lim;i++)
        {
            if(arr1[i]==true && arr2[i]==false)
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Set difference of set 2 is");
        for(int i=0;i<lim;i++)
        {
            if(arr2[i]==true && arr1[i]==false)
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println('\n'+"Using HashSet data structure of Java");
        System.out.println("Union of the 2 sets is");
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println(union);
        System.out.println("Intersection of the 2 sets is");
        Set<Integer> inters = new HashSet<Integer>(set1);
        inters.retainAll(set2);
        System.out.println(inters);
        System.out.println("Set difference of the set 1 is");
        Set<Integer> setd1 = new HashSet<Integer>(set1);
        setd1.removeAll(set2);
        System.out.println(setd1);
        System.out.println("Set difference of the set 2 is");
        Set<Integer> setd2 = new HashSet<Integer>(set2);
        setd2.removeAll(set1);
        System.out.println(setd2);
        sc.close();
    }
}