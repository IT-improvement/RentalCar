package service.board.model;

import java.sql.Timestamp;

public class BoardResponseDto {
	private int boardIndex;
	private String id;
	private String title;
	private String content;
	private Timestamp write_date;
	private Timestamp modify_date;
	
	public BoardResponseDto(int boardIndex, String id, String title, String content, Timestamp write_date) {
		super();
		this.boardIndex = boardIndex;
		this.id = id;
		this.title = title;
		this.content = content;
		this.write_date = write_date;
	}
	
	public BoardResponseDto(int boardIndex, String id, String title, String content, Timestamp write_date,
			Timestamp modify_date) {
		super();
		this.boardIndex = boardIndex;
		this.id = id;
		this.title = title;
		this.content = content;
		this.write_date = write_date;
		this.modify_date = modify_date;
	}

	public int getBoardIndex() {
		return boardIndex;
	}

	public void setBoardIndex(int boardIndex) {
		this.boardIndex = boardIndex;
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

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public Timestamp getModify_date() {
		return modify_date;
	}

	public void setModify_date(Timestamp modify_date) {
		this.modify_date = modify_date;
	}
	
	
}
