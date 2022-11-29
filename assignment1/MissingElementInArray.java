package week2.assignment1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		int len=arr.length;
		System.out.println("Array length " +len); //length
		
		Arrays.sort(arr);
		for(int i : arr) // for loop to print sorted array
		System.out.println("sorted array  " +i);
		
		for(int i=1;i<=7;i++) {
			
			if(i!=arr[i-1]) { 
				
				System.out.println("missing element is " +i);
				break;
			}
			
		}
		
		

	}
}

