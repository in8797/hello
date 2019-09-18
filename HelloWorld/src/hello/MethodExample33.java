package hello;

public class MethodExample33 {
	public static void main(String[] args) {
		printStar(4);
		int[] ary = showArray(1, 2, 3, 4, 5);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		// ==>> enhanced for
		for (int a : ary) {
			System.out.println(a);
		}
	}

	public static int[] showArray(int... arg) {
		
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}

	public static int[] showArray(int a, int b, int c, int d, int e) {
		int[] ary = { a * 2, b * 2, c * 2, d * 2, e * 2 };
		return ary;
	}

	public static void printStar(int a) {

		for (int i = 1; i <= a; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}