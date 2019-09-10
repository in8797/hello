package hello;

public class MathExample {
	public static void main(String[] args) {
		int a = 75;
		a = (int) (Math.random()*100);
		a = a/10;
		switch(a) {
		case 9:
			System.out.println(a+"A");
			break;
		case 8:
			System.out.println(a+"B");
			break;
		case 7:
			System.out.println(a+"C");
			break;
		case 6:
			System.out.println(a+"D");
			break;
		default:
			System.out.println(a+"F");
			break;
		}
//		if(a>=90) {
//			System.out.println(a + "A등급");
//		} else if (a>=80) {
//			System.out.println(a + "B등급");
//		} else if (a>=70) {
//			System.out.println(a + "C등급");
//		} else if (a>=60) {
//			System.out.println(a + "D등급");
//		} else {
//			System.out.println(a + "F등급");
//		}
	}
}
