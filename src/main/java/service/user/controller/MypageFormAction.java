package service.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.reservation.model.ReservationResponseDto;
import service.user.model.UserDao;
import service.user.model.UserResponseDto;

public class MypageFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		UserResponseDto user = (UserResponseDto)session.getAttribute("user");
		String id = user.getId();
		UserDao dao = UserDao.getInstance();
		List<ReservationResponseDto> reservationList = dao.reservationLIst(id);
		request.setAttribute("reservationList", reservationList);
		
		List<ReservationResponseDto> cancleList = dao.cancleList(id);
		request.setAttribute("cancleList", cancleList);
		
		request.getRequestDispatcher("/myPage").forward(request, response);
	}

}
