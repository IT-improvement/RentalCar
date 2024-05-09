package service.board.model;

import java.sql.Timestamp;

public class Board {
	private int boardIndex;
	private int number;
	private String id;
	private String title;
	private String content;
	private Timestamp date;
	
	public Board(int boardIndex, int number, String id, String title, String content, Timestamp date) {
		super();
		this.boardIndex = boardIndex;
		this.number = number;
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public int getBoardIndex() {
		return boardIndex;
	}

	public void setBoardIndex(int boardIndex) {
		this.boardIndex = boardIndex;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}
