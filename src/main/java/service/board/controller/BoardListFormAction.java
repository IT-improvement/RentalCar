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
import service.board.model.BoardRequestDto;
import service.user.model.UserRequestDto;
import service.user.model.UserResponseDto;

public class BoardListFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardListFormAction() {
        super();
    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");		
		BoardDao dao = BoardDao.getInstance();
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		HttpSession session = req.getSession();
		UserResponseDto user = (UserResponseDto)session.getAttribute("user");
		String id = user.getId();
		BoardRequestDto dto = new BoardRequestDto(id, title, content);
		dao.writeBoard(dto);
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		BoardDao dao = BoardDao.getInstance();
		List<Board> boardList = dao.getBoardList();
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		response.sendRedirect("/boardList");
	}
}
