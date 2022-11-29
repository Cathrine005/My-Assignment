package week2.assignment1;

public class TestPalindrome {

	public static void main(String[] args) {
		
		int no=34343;
		int no2=no;
		int rev=0;// initially no reverse no found = 0
		int temp=no; // we need to change the input value to manipulate quotient 
		int rem;
		
		for(;temp!=0;)// similar to while condition while(temp>0)
		{
		   rem=temp%10;
		   rev=rev*10+rem;
		   temp=temp/10;
		}
		
		   System.err.println("reverse value is " +rev);
		  
		  if(rev==no2)
		  {
			  System.out.println("the number is Palindrome " +rev);
		  }

}
}
	

	
