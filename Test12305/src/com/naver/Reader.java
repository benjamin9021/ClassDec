package com.naver;

public class Reader extends Thread{
	
	Board board;
	
	public Reader() {}

	public Reader(Board board) {
		super();
		this.board = board;
	}

	@Override
	public void run() {
		String article = board.getArticle();
		System.out.println(article);

	}
	
}
