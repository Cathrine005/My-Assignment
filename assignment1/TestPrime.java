package week2.assignment1;

public class TestPrime {

	public static void main(String[] args) {
		
		int no=13;
		int i=2;
		boolean flag=false; // initially we assume 15 as a prime no and set flag to "true" 

		
		for(i=2;i<=6;i=i+1)
		{
	        if(no%i==0)
	        {
			System.out.println("Not a prime number");
			flag=true; // finally set flag as false
			break;
		    }
		} 
		
		if (flag==false)
		{
			System.out.println("Prime");
			
		}
		
		

	}

}
