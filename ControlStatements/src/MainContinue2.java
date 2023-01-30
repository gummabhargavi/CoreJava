
public class MainContinue2 {
	
	
	    public static void main(String[] args)
	    {
	    outer:
	       for (int i = 1; i <= 2; i++) // Outer Loop
	       {
	           int j = 0;
	           System.out.println("i = " + i);
	       inner:
	           while (j <= 5) // Inner Loop
	           {
	               j++;
	               if (j == 1)
	               {
	                   System.out.println("Inner labelled continue at i = " + i + " and j = " + j);
	                   continue inner;
	               }
	               if (j == 2)
	               {
	                   System.out.println("Outer labelled continue at i = " + i + " and j = " + j);
	                   continue outer;
	               }
	               System.out.println("j = " + j);
	           }
	       }
	   }
	}




