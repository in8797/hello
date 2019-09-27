package com.board.impl;

import com.board.model.Board;
import com.board.model.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public void writeBoard(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	@Override
	public Board getBoard(int boardNo, Board[] boards) {
		Board board = null;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				board = boards[i];
			}
		}
		return board;
	}

	@Override
	public Board[] getBoardList(Board[] boards) {
		Board[] boardAry = new Board[boards.length];
		for (int i = 0; i < boards.length; i++) {
			boardAry[i] = boards[i];
		}
		return boardAry;
	}

	@Override
	public void getBoardDelete(int boardNo, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == boardNo) {
				boards[i] = null;

			}
		}
		return ;
	}

	@Override
	public void updateBorad(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContents(board.getContents());
				boards[i].setTitle(board.getTitle());
				boards[i].setWriter(board.getWriter());
			}
		}
	}

}
