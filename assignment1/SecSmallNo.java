package week2.assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecSmallNo {

	public static void main(String[] args) {
	
		//sec smallest number in array
		
		int number[]= {23,45,67,32,89,22};
		
		int len=0;
		
		//sort array values
		
		len=number.length;
		System.out.println("array lenth :" +len);
		 Arrays.sort(number);
		System.out.println("sec smallest number is " +number[1]);
		 
	
	}
}


