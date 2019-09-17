package hello;

public class test {
	public static void main(String[] args) {
		
		int sum=0;
		/*for(int i=1;i<=10;i++) {
			if(i%2==1)
			sum =sum+i;
		}*/
		for(int i=0,j=100;  i<=50 && j>=50; i++,j--) {
			sum = sum+ (j+i);
		}
		System.out.println(sum);
	}

}
