package week2.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n=8;
		int sum=0;
        int fn=0;
        int sn=1;
        
        System.out.println("fibonacci Series of 8 is: " +fn);
        System.out.println("fibonacci Series of 8 is: " +sn);
        for(int i=3;i<=8;i++) {
        	
        	sum=fn+sn;
        	fn=sn;
        	sn=sum;
        
        	System.out.println("fibonacci Series of 8 is: " +sum);
        
        	
        	
        } 
	}

}
