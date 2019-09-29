package api;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location =subject.indexOf("프로그래밍"); //if( 문자열.indexOf("찾는문자열") != -1)
		System.out.println(location);
		
		if(subject.indexOf("자바")!= -1) {//if( 문자열.indexOf("찾는문자열") != -1)
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
