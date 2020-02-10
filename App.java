package EPAM.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
 interface ICalculator{
	public int add(int a, int b);

	/** Returns a-b */
	public int subtract(int a, int b);

	/** Returns a*b */
	public int multiply(int a, int b);

	/** Returns quotient of a and b */
	public int divide(int a, int b);

	}
 class Calculator implements ICalculator{
	private int ans;
	public int add(int a,int b) {
		ans= a+b;
		return ans;
	}
	public int subtract(int a,int b) {
		ans= a-b;
		return ans;
	}
	public int multiply(int a,int b) {
		ans= a*b;
		return ans;
	}
	public int divide(int a,int b) {
		ans= a/b;
		return ans;
	}
	
	
}

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Calculator c1=new Calculator();
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println(c1.add(a, b));
    	System.out.println(c1.divide(a, b));
    	
    }
}
