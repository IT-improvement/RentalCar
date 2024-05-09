package service.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.board.model.Board;
import service.board.model.BoardDao;
import service.board.model.BoardRequestDto;

public class BoardUpdateFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int index = Integer.parseInt(req.getParameter("index"));
		BoardDao dao = BoardDao.getInstance();
		Board board = dao.findboard(index);
		req.setAttribute("board", board);
		req.getRequestDispatcher("/boardWrite").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int index = Integer.parseInt(request.getParameter("index"));
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		BoardRequestDto dto = new BoardRequestDto(id, title, content);
		BoardDao dao = BoardDao.getInstance();
		dao.updateBoard(index, dto);
		response.sendRedirect("/boardListFormAction");
	}

}
