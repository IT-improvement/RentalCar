package service.reservation.model;

import java.sql.Timestamp;

public class ReservationRequestDto {
	private String id;
	private String carnumber;
	private Timestamp retal_datetime;
	private Timestamp return_datetime;
	private String pay_type;
	private int pay;
	
	public ReservationRequestDto(String id, String carnumber, Timestamp retal_datetime, Timestamp return_datetime,
			String pay_type, int pay) {
		super();
		this.id = id;
		this.carnumber = carnumber;
		this.retal_datetime = retal_datetime;
		this.return_datetime = return_datetime;
		this.pay_type = pay_type;
		this.pay = pay;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public Timestamp getRetal_datetime() {
		return retal_datetime;
	}

	public void setRetal_datetime(Timestamp retal_datetime) {
		this.retal_datetime = retal_datetime;
	}

	public Timestamp getReturn_datetime() {
		return return_datetime;
	}

	public void setReturn_datetime(Timestamp return_datetime) {
		this.return_datetime = return_datetime;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
