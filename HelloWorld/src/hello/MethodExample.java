package hello;

public class MethodExample {
	public static void main(String[] args) {
		/*int a = 30;

		System.out.println(args[0]);
		showName();
		showAge(a);
		showMe(170, 65.8);
		int reslut = sum(4, 5);
		int nus = minus(4, 5);
		int mul = multi(4, 5);
		double di = div(1.5, 5);
		double k = mum(177.5);
		System.out.println("더하기 결과값 : " + reslut);
		System.out.println("빼기 결과값 : " + nus);
		System.out.println("곱하기결과값 : " + mul);
		System.out.println("나누기 결과값 : " + di);
		System.out.println(args[1]);
		System.out.println("적정 몸무게는 : " + k);*/
		
		int[] intAry = {2,3,4,5,6};
		int sum = 0;
		sum = sum2(intAry);
		for(int i = 0; i<intAry.length;i++) {
			sum +=intAry[i];
		}
		System.out.println("합은 : " + sum);
		}
	
	
	public static int sum2(int[] ary) {
		int sum = 0;
		for(int i = 0; i<ary.length;i++) {
			sum +=ary[i];
		}
		return sum;
	}
			
	public static double mum(double ki) {
		return (ki - 100) * 0.9;
	}

	public static double div(double d1, double d2) {
		return d1 / d2;
	}

	public static int multi(int m3, int m4) {
		return m3 * m4;
	}

	public static int minus(int m1, int m2) {
		return m1 - m2;
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void showAge(int age) {
		System.out.println("I am " + age + " years old");
	}

	public static void showMe(int height, double weight) {
		System.out.println("I am " + height + " and " + weight + " kg");
	}

	public static void showName() {
		System.out.println("Hello, my name is Inho");
	}
}
