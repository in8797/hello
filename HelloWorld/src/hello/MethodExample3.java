package hello;

public class MethodExample3 {
	public static void main(String[] args) {
		printStar(5);
	}
	public static void printStar(int a) {
		int num=1;
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}