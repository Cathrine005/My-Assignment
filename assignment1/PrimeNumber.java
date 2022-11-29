package week2.assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int no=13;
		int i=2;
		boolean flag=true; // initially we assume 13 as a prime no and set flag to "true" 

		
	while(i<=6)
	        {		
		
			if(no%i==0)
			System.out.println("Not a prime number");
			flag=false; // finally set flag as false
		    i=i+1;
		    }
		
		if (flag==true)
		{
			System.out.println("Prime");
			
		}
		
	}
	}

		
	
		   
		   //if (flag=true)
		   ///{
			 //  System.out.println("Prime");
		  // }
		  
	




	
