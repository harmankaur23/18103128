public class ass2q4 {
    public static void main(String args[])
    {
        int sum=0;
        int c=0;
        for(int i=1;i<Integer.MAX_VALUE;i++)
        {
            sum=sum+i;
            c++;
            // System.out.println(i+" "+sum);
            if(sum<0 || (i*i)<0)
            {
                System.out.println(c);
            return;
            }
            if(sum==i*i)
            {
            System.out.println(i);
            }
        }
    }
}