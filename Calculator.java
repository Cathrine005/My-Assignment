package week1.assignment1;

public class Calculator {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("sum of " +a +"+" +b +" is:" +c);
	}
	
	public void addition(float c, float d, float e)
	{
		float Sum;
		Sum=(c+d+e);
		System.out.println("sum of " +c +"+" +d +"+" +e +" is:" +Sum);
	}
	
	
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication of " +a +"*" +b +" is:" +c);
	}
	
	public void multiply(int c, double d)
	{
		double m;
		m=(c*d);
		System.out.println("Multiplication of " +c +"*" +d +" is :" +m);
	}
	

	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction of a-b is:" +c);
	}
	
	public void subtraction(double c, double d)
	{
		double m;
		m=(c-d);
		System.out.println("Subtraction of c-d is :" +m);
	}

	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Division of a/b is:" +c);
	}
	
	public void division(double c, int d)
	{
		double m;
		m=(c/d);
		System.out.println("Division of c/d is :" +m);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
        Calculator cal=new Calculator();
        cal.add(5, 5);
        cal.addition(9, 3, 6);
        cal.mul(4, 4);
        cal.multiply(100, 4.35);
        cal.sub(50,10);
        cal.subtraction(8.2242, 4.2241);
        cal.div(10, 2);
        cal.division(2.444, 2);
		
	}

}
