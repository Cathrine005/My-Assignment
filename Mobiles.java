package week1.assignment1;

public class Mobiles {
	
    public void makeCall()
    
    {
    	String mobileModel= "iphone 9";
    	float mobileWeight= 30.2f;
    	System.out.println("Mobile Model :" +mobileModel);
    	System.out.println("Mobile Weight : " +mobileWeight);
     }
    
    public void sendMsg()
    
    {
    	boolean FullCharge = true;
    	int mobileCost = 55000;
    	System.out.println("FullCharge =" +" "+ FullCharge);
    	System.out.println("mobileCost is :" +mobileCost);
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Mobiles mb=new Mobiles();
          mb.makeCall();
          mb.sendMsg();
          
        
        }
}
