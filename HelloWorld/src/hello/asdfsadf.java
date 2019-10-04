package hello;

public class asdfsadf {
	public static void main(String[] args) {
//		int a= 10;
//		int b= 20;
//		int result = (a>b ? a++:b--);
//		System.out.println("결과: " + "result: " +result + "a:"+a +"b:"+ b);
//		
		int max = 0;
		for (int i = 0; i < 200; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				max = i;
			}
		}
		System.out.println(max);


	}

}
