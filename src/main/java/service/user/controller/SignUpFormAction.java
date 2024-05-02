package service.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.user.model.UserDao;
import service.user.model.UserRequestDto;
import service.user.model.UserResponseDto;

@WebServlet("/SignUpFormAction")
public class SignUpFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignUpFormAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phonenumber = request.getParameter("phonenumber");
		String birthday = request.getParameter("birthday");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		System.out.println("id"+id);
		System.out.println("pw"+password);
		System.out.println("name"+name);
		System.out.println("phone"+phonenumber);
		System.out.println("birth"+birthday);
		System.out.println("gender"+gender);
		System.out.println("email"+email);
		UserRequestDto dto = new UserRequestDto(id, password, name, phonenumber, email, birthday, gender);
		UserDao dao = UserDao.getInstance();
		UserResponseDto result = dao.createUser(dto);

		if (result == null) {
			response.sendRedirect("/signUp");
			System.out.println("회원가입실패");
		} else {
			System.out.println("회원가입성공");
		}
	}

}
