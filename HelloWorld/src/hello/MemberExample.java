package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("최인호");
		m1.setId("cih");
		m1.setPassword("23");
		m1.setAge(27);

		Member m2 = new Member("관리자", "admin");
		m2.setPassword("admin123");
		m2.setAge(0);

		Member m3 = new Member("사용자", "user1", "user123", 10);
		Member[] Memberary = { m1, m2, m3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 이름 입력");
		String name = sc.nextLine(); // 문자열을 받을때는 nextLine()

		for (Member m : Memberary) {
			if (m.getName().equals(name)) // equals는 문자열 이 동일하면.
				System.out.println("-->" + m.getName() + "," + m.getId() + "," + m.getPassword() + "," + m.getAge());
		}
	}
}
