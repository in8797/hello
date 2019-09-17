package hello;

public class Gugudan {
	public static void main(String[] args) {
		/*for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j + " * " + i + " = " + i*j +"		");
			}
			System.out.println();
		}*/
		int i=1;
		while (i<=9) {
			int j=2;
			while (j<=9) {
				System.out.print(j + " * " + i + " = " +  i*j + "	");
			j++;
			} System.out.println();
		i++;
		}
	}
}
