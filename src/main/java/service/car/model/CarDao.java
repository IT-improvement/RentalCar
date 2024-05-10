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
			String sql = "SELECT c1.carnumber, c1.type, c1.oil, c1.info, c1.name, c2.carImageindex, c2.imageUrl FROM car c1, carimage c2 WHERE c1.carnumber = c2.carnumber and imageUrl like '%_1%'\r\n"
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

	public List<Car> carList() {
		List<Car> carList = new Vector<Car>();
		try {
			String sql = "SELECT c1.carnumber, c1.type, c1.oil, c1.info, c1.name, c2.carImageindex, c2.imageUrl FROM car c1, carimage c2 WHERE c1.carnumber = c2.carnumber  and c2.imageUrl like '%_1.png';";
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
			System.out.println("자동차 리스트 오류");
		}
		return carList;
	}

	public Car carinfo(String carnumber) {
		Car car = new Car();
		try {
			String sql = "SELECT * FROM car WHERE carnumber=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, carnumber);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				car.setCarnumber(rs.getString("carnumber"));
				car.setType(rs.getString("type"));
				car.setName(rs.getString("name"));
				car.setOil(rs.getString("oil"));
				car.setInfo(rs.getString("info"));
				car.setPrice(rs.getInt("price"));
				car.setImages(carimages(carnumber));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("자동차 정보 오류");
		}
		return car;
	}

	private String[] carimages(String carnumber) {
		int count = imagesCount(carnumber);
		String[] images = new String[count];
		try {
			String sql = "SELECT imageUrl FROM carimage WHERE carnumber=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, carnumber);
			rs = pstmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				images[i++] = rs.getString("imageUrl");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("사진로드 오류");
		}
		return images;
	}

	private int imagesCount(String carnumber) {
		int count = 0;
		try {
			String sql = "SELECT count(*) FROM carimage WHERE carnumber=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, carnumber);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("사진카운트 오류");
		}
		return count;
	}

}
