package service.car.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.car.model.Car;
import service.car.model.CarDao;

public class CarMainFormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarDao dao = CarDao.getInstance();
		List<Car> carList = dao.top7CarList();
		System.out.println(carList);
		HttpSession session = request.getSession();
		session.setAttribute("carList", carList);
		response.sendRedirect("/main");
	}

}
