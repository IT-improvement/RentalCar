package service.car.model;

import java.util.List;
import java.util.Vector;

import service.util.DBConnection;

public class CarDao extends DBConnection {

	private CarDao() {

	}

	private static CarDao instance = new CarDao();

	public static CarDao getInstance() {
		return instance;
	}

	public List<Car> top7CarList() {
		List<Car> carList = new Vector<Car>();
		try {
			String sql = "select c1.carnumber, c1.type, c1.oil, c1.info, c1.name, c2.carImageindex, c2.imageUrl from car c1, carimage c2 where c1.carnumber = c2.carnumber and imageUrl like '%_1%'\r\n"
					+ "order by viewcount desc limit 0,7";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Car car = new Car();
				car.setCarnumber(rs.getString("carnumber"));
				car.setType(rs.getString("type"));
				car.setName(rs.getString("name"));
				car.setOil(rs.getString("oil"));
				car.setInfo(rs.getString("info"));
				String url[] = new String[1];
				url[0] = rs.getString("imageUrl");
				car.setImages(url);
				carList.add(car);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("상위7개 리스트 오류");
		}
		return carList;
	}
	
	public List<Car> carList(){
		List<Car> carList = new Vector<Car>();
		try {
			String sql = "select c1.carnumber, c1.type, c1.oil, c1.info, c1.name, c2.carImageindex, c2.imageUrl from car c1, carimage c2 where c1.carnumber = c2.carnumber  and c2.imageUrl like '%_1.png';";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Car car = new Car();
				car.setCarnumber(rs.getString("carnumber"));
				car.setType(rs.getString("type"));
				car.setName(rs.getString("name"));
				car.setOil(rs.getString("oil"));
				car.setInfo(rs.getString("info"));
				String url[] = new String[1];
				url[0] = rs.getString("imageUrl");
				car.setImages(url);
				carList.add(car);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("자동차 리스트 오류");
		}
		return carList;
	}
}
