package service.car.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.car.model.Car;
import service.car.model.CarDao;

public class CarFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String carnumber = request.getParameter("carnumber");
		CarDao dao = CarDao.getInstance();
		Car car = dao.carinfo(carnumber);
		request.setAttribute("car", car);
		request.getRequestDispatcher("/car").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String carnumber = request.getParameter("carnumber");
		String retal_datetime = request.getParameter("start");
		String return_datetime = request.getParameter("end");
	}

}
