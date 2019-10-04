package ex;

import java.util.Scanner;

public class MemberExample {
	static Member[] MemberArray = new Member[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			
			System.out.println("------------------------------------------");
			System.out.println("1.회원등록|2.회원번호조회|3.등록그룹별 리스트|4.종료");
			System.out.println("------------------------------------------");
			int menu = 0;
			try {
				menu = sc.nextInt(); // error 발생 시
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
				sc.nextLine();
			}
			if (menu == 1) {
				MemberCreate();
			} else if (menu == 2) {
				Memberid();
			} else if (menu == 3) {
				MemberList();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램종료.");

	}

	private static void MemberCreate() { // 회원등록
		System.out.println("id : ");
		int Memberid = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 : ");
		String Membername = sc.nextLine();
		System.out.println("등록과정 : ");
		String Membersub = sc.nextLine();
		Member m = new Member(Memberid, Membername, Membersub);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = m;
				break;
			}
		}
	}

	private static void Memberid() { // 회원번호 조회
		System.out.println("조회할 id : ");
		int Memberid = sc.nextInt();
		sc.nextLine();
		for (Member idnum : MemberArray) {
			if (idnum != null && idnum.getId() == Memberid)
				System.out.println(
						"회원번호 : " + idnum.getId() + ", 이름 : " + idnum.getName() + ", 등록과정 : " + idnum.getSubject());
		}
	}

	private static void MemberList() { // 등록그룹별 리스트
		for (Member sub : MemberArray) {
			if (sub != null )
				System.out.println(
						"회원번호 : " + sub.getId() + ", 이름 : " + sub.getName() + ", 등록과정 : " + sub.getSubject());
		}
	}
}
