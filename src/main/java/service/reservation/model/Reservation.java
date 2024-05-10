package service.reservation.model;

import java.sql.Timestamp;

public class Reservation {
	private String id;
	private String carnumber;
	private Timestamp reservation_datetime;
	private Timestamp return_datetime;
	private String pay_type;
	private String pay;
	private boolean cancle;
	private boolean returncar;
	
	public Reservation() {
		
	}
	public Reservation(String id, String carnumber, Timestamp reservation_datetime, Timestamp return_datetime,
			String pay_type, String pay, boolean cancle, boolean returncar) {
		super();
		this.id = id;
		this.carnumber = carnumber;
		this.reservation_datetime = reservation_datetime;
		this.return_datetime = return_datetime;
		this.pay_type = pay_type;
		this.pay = pay;
		this.cancle = cancle;
		this.returncar = returncar;
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
	public Timestamp getReservation_datetime() {
		return reservation_datetime;
	}
	public void setReservation_datetime(Timestamp reservation_datetime) {
		this.reservation_datetime = reservation_datetime;
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
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public boolean isCancle() {
		return cancle;
	}
	public void setCancle(boolean cancle) {
		this.cancle = cancle;
	}
	public boolean isReturncar() {
		return returncar;
	}
	public void setReturncar(boolean returncar) {
		this.returncar = returncar;
	}
	
}
