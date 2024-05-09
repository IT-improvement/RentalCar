package service.board.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Vector;

import service.util.DBConnection;

public class BoardDao extends DBConnection {

	private BoardDao() {

	}

	private static BoardDao instance = new BoardDao();

	public static BoardDao getInstance() {
		return instance;
	}

	public List<Board> getBoardList() {
		List<Board> boardList = new Vector<Board>();
		try {
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int number = 1;
			while (rs.next()) {
				int index = rs.getInt("boardIndex");
				String id = rs.getString("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Timestamp write_date = rs.getTimestamp("write_datetime");
				Timestamp modify_date = rs.getTimestamp("modify_datetime");
				Timestamp date = null;
				date = modify_date == null ? write_date : modify_date;
				Board board = new Board(index, number, id, title, content, date);
				number++;
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시판리스트 오류");
		}
		return boardList;
	}

	public void writeBoard(BoardRequestDto dto) {
		try {
			String sql = "insert into board(id, title, content) values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getId());

			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시글 작성 오류");
		}
	}

	public Board findboard(int index) {
		Board board = new Board();
		try {
			String sql = "select * from board where boardIndex=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, index);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				board.setBoardIndex(index);
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				Timestamp write_date = rs.getTimestamp("write_datetime");
				Timestamp modify_date = rs.getTimestamp("modify_datetime");
				Timestamp date = null;
				date = modify_date == null ? write_date : modify_date;
				board.setDate(date);
				board.setId(rs.getString("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시간상세 오류");
		}
		return board;
	}
}
