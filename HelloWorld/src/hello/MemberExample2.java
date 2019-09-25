package hello;

import java.util.Scanner;

public class MemberExample2 {

	private static Member[] MemberArray = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.생성|2.전체리스트|3.조회|4.종료");
			System.out.println("---------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				MemberCreate();
			} else if (menu == 2) {
				MemberList();
			} else if (menu == 3) {
				MemberIdPd();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램종료.");
	}

	public static void MemberCreate() {
		System.out.println("이름 : ");
		String MemberName = sc.nextLine();
		System.out.println("ID : ");
		String MemberId = sc.nextLine();
		System.out.println("password : ");
		String MemberPwd = sc.nextLine();
		System.out.println("나이 : ");
		int MemberAge = sc.nextInt();
		Member mem = new Member(MemberName, MemberId, MemberPwd, MemberAge);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = mem;
				break;
			}
		}
	}

	public static void MemberList() {
		for (Member m : MemberArray) {
			if (m != null)
				System.out.println("이름 :" + m.getName() + ", ID :" + m.getId() + ", password :" + m.getPassword()
						+ ", 나이 :" + m.getAge());
		}
	}

	public static void MemberIdPd() {
		System.out.println("ID : ");
		String MemberId = sc.nextLine();
		System.out.println("password : ");
		String MemberPwd = sc.nextLine();
		boolean isId = false, isPw = false;
		// id, passwd 같으면 이름, 나이를 출력.
		// id 맞고 passwd가 다르면 비밀번호가 잘못됐습니다.
		// id(x), passwd(x) => 존재하지 않는 아이디입니다.
		String name = null;
		int age = 0;
		for (Member mm : MemberArray) {
			if (mm != null && mm.getId().equals(MemberId)) {
				if (mm.getPassword().equals(MemberPwd)) {// id(o),passwd(o)
					isId = true;
					isPw = true;
					name = mm.getName();
					age = mm.getAge(); // id,passwd 이름,나이랑 출력 함
					break;

				} else { // id(o), passwd(x)
					isId = true;
					isPw = false;
					break;
				}

			} else {
				isId = false;
				isPw = false;
			}
		}
		if (isId && isPw)
			System.out.println("이름은: " + name + ", 나이는: " + age);
		else if (isId == true && isPw == false)
			System.out.println("비번이 틀림");
		else if (isId == false && isPw == false)
			System.out.println("존재하지 않는 id 입니다.");
	}
}
