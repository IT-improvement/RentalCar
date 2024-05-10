package service.reservation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservationFormAction
 */
public class ReservationFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String carnumber = request.getParameter("carnumber");
		String retal_datetime = request.getParameter("start");
		String return_datetime = request.getParameter("end");
		String pay = request.getParameter("pay");
		System.out.println(carnumber);
		System.out.println(retal_datetime);
		System.out.println(return_datetime);
		System.out.println(pay);
	}

}
