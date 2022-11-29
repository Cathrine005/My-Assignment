package week2.assignment1;

public class Itersection {

	public static void main(String[] args) {
		
		int a1[]= {3,2,11,4,6,7};
		int a2[]= {1,2,8,4,9,7};
		int intersec=0;
		int len=a1.length;
		for(int i=0;i<len;i++){
			
			for(int j=0;j<len;j++) {
				
				if(a1[i]==a2[j]) {
					
					intersec= (intersec*10)+a2[j]; //(0*10)+2=2, (2*10)+4=24, (24*10)+7=247
					
					
					
				}
			}
		}System.out.println("intersection of array-a1[] and array-a2[] is " +intersec);
		

	}

}
