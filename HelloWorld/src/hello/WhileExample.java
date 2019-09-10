package hello;

public class WhileExample {
	public static void main(String[] args) {
		int i=1;
		int a=4;
		while(true) {
			System.out.println(i);
			if(i++ < 5)
			continue;
			System.out.println(a+" * "+i+" = "+(a*i));
			if(i==8)
			break;
//			i++;
		}
	}
}
