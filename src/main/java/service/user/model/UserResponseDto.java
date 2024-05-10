package service.user.model;

public class UserResponseDto {
	public String id;
	public String password;
	public String name;
	public String phonenumber;
	public String email;
	public String birthday;
	public String gender;

	public UserResponseDto(String id, String password, String name, String phonenumber, String email, String birthday,
			String gender) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
	}

	public UserResponseDto(UserRequestDto user) {
		this.id = user.getId();
		this.password = user.getPassword();
		this.name = user.getName();
		this.phonenumber = user.getPhonenumber();
		this.email = user.getEmail();
		this.birthday = user.getBrithday();
		this.gender = user.getGender();
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
