package hello;

public class Hello {
	public static void main(String[] args)
	{
		int num1 = 10;
		num1++;
		int a= 5, b=7;
		num1 = a++ + ++b;
		System.out.println("num : "+ num1);
		System.out.println(a + "," + b);
		
		System.out.println(3 > 5);
	}

}
