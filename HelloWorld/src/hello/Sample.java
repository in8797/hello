package hello;

public class Sample {
	public static void main(String[] args) {
		String[] strAry = { "Hello", "World", "Good", "Morning" };
		String[] copyAry = new String[strAry.length];
//		for(int i=0; i<strAry.length; i++) {
//			copyAry[0]=strAry[0]; //직접복사
//		}
		System.arraycopy(strAry, 0, copyAry, 0, strAry.length); 
		// array메소드로 카피
		for (String str : copyAry) {
			System.out.println(str);
		}
	}
}
