package service.reservation.model;

import java.sql.Timestamp;

import service.util.DBConnection;

public class ReservationDao extends DBConnection {

	private ReservationDao() {

	}

	private static ReservationDao instance = new ReservationDao();

	public static ReservationDao getInstance() {
		return instance;
	}

	public ReservationResponseDto reservation(ReservationRequestDto dto) {
		ReservationResponseDto reservationResponseDto = null;
		try {
			String sql = "INSERT INTO reservation(id, carnumber, retal_datetime, return_datetime, pay_type, pay) "
					+ "VALUES(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			String id = dto.getId();
			String carnumber = dto.getCarnumber();
			Timestamp retal_datetime = dto.getRetal_datetime();
			Timestamp return_datetime = dto.getReturn_datetime();
			String pay_type =  dto.getPay_type();
			int pay = dto.getPay();
			
			pstmt.setString(1, id);
			pstmt.setString(2, carnumber);
			pstmt.setTimestamp(3, retal_datetime);
			pstmt.setTimestamp(4, return_datetime);
			pstmt.setString(5, pay_type);
			pstmt.setInt(6, pay);

			pstmt.execute();
			
			Timestamp time = new Timestamp(System.currentTimeMillis());
			reservationResponseDto = new ReservationResponseDto(id, carnumber, return_datetime, time, return_datetime, pay_type, pay);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예약 오류");
		}
		return reservationResponseDto;
	}
	
}
