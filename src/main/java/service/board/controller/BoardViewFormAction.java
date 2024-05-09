package service.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.board.model.Board;
import service.board.model.BoardDao;

public class BoardViewFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int index = Integer.parseInt(req.getParameter("index"));
		BoardDao dao = BoardDao.getInstance();
		Board board = dao.findboard(index);
		req.setAttribute("board", board);
		req.getRequestDispatcher("/board").forward(req, resp);
	}
}
