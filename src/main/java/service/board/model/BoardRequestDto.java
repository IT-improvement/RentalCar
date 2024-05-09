package service.board.model;

public class BoardRequestDto {

	private int boardIndex;
	private String id;
	private String title;
	private String content;
	
	public BoardRequestDto(int boardIndex, String id, String title, String content) {
		super();
		this.boardIndex = boardIndex;
		this.id = id;
		this.title = title;
		this.content = content;
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

}
