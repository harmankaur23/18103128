package assignment5;

	  
	public class ques1 extends Thread
	{
	    public static void main(String[] args)
	    {
	        ques1 obj = new ques1();
	        obj.start();
	    }

	    public void run()
	    {
	        for(int i=1;i<=100;i++)
	        {
	            System.out.println(i);
	            try
	            {
	                Thread.sleep(1000);
	            }catch(Exception e){}
	        }
	    }

	}
