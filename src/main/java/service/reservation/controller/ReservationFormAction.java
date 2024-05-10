package service.reservation.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.reservation.model.ReservationDao;
import service.reservation.model.ReservationRequestDto;
import service.reservation.model.ReservationResponseDto;
import service.user.model.UserResponseDto;

public class ReservationFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String carnumber = request.getParameter("carnumber");
		Timestamp retal_datetime = Timestamp.valueOf(request.getParameter("start"));
		Timestamp return_datetime = Timestamp.valueOf(request.getParameter("end"));
		String pay = request.getParameter("pay");
		int price = Integer.parseInt(request.getParameter("price"));
		HttpSession session = request.getSession();
		UserResponseDto user = (UserResponseDto)session.getAttribute("user");
		String id =user.getId();
		
		double term =(return_datetime.getTime()-retal_datetime.getTime())/(1000*60*60*24);
		System.out.println(term);
		int result = (int) (price*term);
		System.out.println(result);
		ReservationRequestDto dto = new ReservationRequestDto(id, carnumber, retal_datetime, return_datetime, pay, result);
	
		ReservationDao dao = ReservationDao.getInstance();
		ReservationResponseDto reservationResponseDto = dao.reservation(dto);
		request.setAttribute("receipt", reservationResponseDto);
		request.getRequestDispatcher("/main").forward(request, response);
	}
	

}
