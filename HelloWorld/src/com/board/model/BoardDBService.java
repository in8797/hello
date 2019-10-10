package com.board.model;

import java.util.List;

public interface BoardDBService {
	// 로그인 체크
	public String login_Check(String id, String passwd);

	// 게시글 작성
	public void insertBoard(BoardDB board);

	// 게시글 전체 조회
	public List<Board> getBoardList();

	// 게시글 한건 조회
	public BoardDB getBoard(int boardNo);

	// 댓글 조회
	public List<Board> getReply(int boardNo);

	// 댓글 추가
	public void insertReply(BoardDB board);

	// 수정
	public void updateBoard(BoardDB board);

	// 삭제
	public void deleteBoard(int boardNo);

}
