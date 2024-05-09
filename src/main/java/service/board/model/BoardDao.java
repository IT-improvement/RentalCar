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
				System.out.println("등장");
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("게시판리스트 오류");
		}
		return boardList;
	}
}
