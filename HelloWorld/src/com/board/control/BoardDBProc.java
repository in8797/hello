package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.Board;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;
import com.board.model.Employee;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		login_Check();
		while (true) {
			int menu = 0;

			System.out.println("1.게시글작성 2.게시글리스트 3.한건조회 4.삭제 5.변경 9.종료");
			menu = sc.nextInt();sc.nextLine();
			if (menu == 1) {
				System.out.println("1번을 선택했습니다.");
				writeBoard();
			} else if (menu == 2) {
				System.out.println("2번을 선택했습니다.");
			} else if (menu == 3) {
				System.out.println("3번을 선택했습니다.");
			} else if (menu == 4) {
				System.out.println("4번을 선택했습니다.");
			} else if (menu == 5) {
				System.out.println("5번을 선택했습니다.");
			}
		}
	}

	public void login_Check() {
		while (true) {
			System.out.println("id 입력: ");
			String id = sc.nextLine();
			System.out.println("passwd 입력: ");
			String passwd = sc.nextLine();
			String name = service.login_Check(id, passwd);

			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			} else {
				System.out.println("id, passwd 다시 입력");
			}
		}
	}
	public void writeBoard() {
		System.out.println("제목: ");
		String title = sc.nextLine();
		System.out.println("내용: ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);
	}
	public void getBoardList(){
		System.out.println("게시글 전체 조회");
		List<Board> Boards = service.getBoardList();
//		for (BoardDB board : Boards) {
//			System.out.println(board);
//		}
	}
}
