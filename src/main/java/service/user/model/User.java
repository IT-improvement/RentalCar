package service.user.model;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	public String id;
	public String password;
	public String name;
	public String phonenumber;
	public String email;
	public String brithday;
	public String gender;
	public Timestamp reg_date;
	public Timestamp edit_date;

	public User(String id, String password, String name, String phonenumber, String email, String brithday,
			String gender, Timestamp reg_date, Timestamp edit_date) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.brithday = brithday;
		this.gender = gender;
		this.reg_date = reg_date;
		this.edit_date = edit_date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBrithday() {
		return brithday;
	}

	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getReg_date() {
		return reg_date;
	}

	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	public Timestamp getEdit_date() {
		return edit_date;
	}

	public void setEdit_date(Timestamp edit_date) {
		this.edit_date = edit_date;
	}

}
