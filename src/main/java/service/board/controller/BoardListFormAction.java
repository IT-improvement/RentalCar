package service.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.board.model.Board;
import service.board.model.BoardDao;

public class BoardListFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardListFormAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = BoardDao.getInstance();
		List<Board> boardList = dao.getBoardList();
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		response.sendRedirect("/boardList");
	}
}
