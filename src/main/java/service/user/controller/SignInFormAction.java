	package service.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.user.model.UserDao;
import service.user.model.UserResponseDto;

public class SignInFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignInFormAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		System.out.println(id);
		System.out.println(password);
		
		UserDao dao = UserDao.getInstance();
		UserResponseDto dto = dao.findByIdAndPassword(id, password);
			
		if (dto == null) {
			System.out.println("로그인 실패");
			response.sendRedirect("/signIn");
		} else {
			HttpSession session = request.getSession();
			response.sendRedirect("/");
			session.setAttribute("user", dto);
		}
	}

}
