package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		login_Check();
		while (true) {
			int menu = 0;

			System.out.println("1.게시글작성 2.게시글리스트 3.한건조회 4.변경 5.삭제 9.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("1번을 선택했습니다.");
				writeBoard();
			} else if (menu == 2) {
				System.out.println("2번을 선택했습니다.");
				BoardList();
			} else if (menu == 3) {
				System.out.println("3번을 선택했습니다.");
				getboard();
			} else if (menu == 4) {
				System.out.println("4번을 선택했습니다.");
				updateBoard();
			} else if (menu == 5) {
				System.out.println("5번을 선택했습니다.");
				deleteBoard();
			}
		}
	}

	private void updateBoard() {
		System.out.println("변경할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목 변경 : ");
		String title = sc.nextLine();
		System.out.println("내용 변경 : ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);

		service.updateBoard(board);
	}

	private void getboard() {
		System.out.println("조회할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// 원본글
		System.out.println("------------[원본글]-----------");
		BoardDB board = service.getBoard(boardNo);
		if (board != null) {
			System.out.println("제목 : " + board.getTitle());
			System.out.println("내용 : " + board.getContent());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("작성일자: " + board.getCreationDate());
			// 댓글
			List<BoardDB> list = service.getReply(boardNo);
			if (list.size() > 0) {
				System.out.println("-------------[댓글]-------------");
				for (BoardDB bd : list) {
					System.out.println("->" + bd.getBoardNo() + " | " + bd.getContent() + " | " + bd.getCreationDate());
				}
				System.out.println("--------------------------------");
				System.out.println("1.댓글작성 2.이전메뉴");
				int subMenu = 0;
				sc.nextInt();
				sc.nextLine();
				if (subMenu == 1) {
					System.out.println("댓글 입력 : ");
					String reply = sc.nextLine();
					BoardDB board1 = new BoardDB();
					board1.setContent(reply);
					board1.setOrgin_No(board.getBoardNo());
					board1.setWriter(loginId);
					service.insertReply(board1);
				} else {
					return;
				}
				{

				}

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

	public void BoardList() {
		System.out.println("-----------------------[전체글]------------------------");
		System.out.println("=====================================================");
		System.out.println("|  글번호   |   제목     |    내용       |    작성자     |    날짜      |");
		System.out.println("=====================================================");

		List<BoardDB> bod = service.getBoardList();
		for (BoardDB board : bod) {
			System.out.println(board);
		}
	}

	public void deleteBoard() {

	}
}
