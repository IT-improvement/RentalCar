package service.user.model;

import service.util.DBConnection;
import service.util.PasswordCrypto;

public class UserDao extends DBConnection {
	
	private UserDao() {
		
	}
	
	private static UserDao instance = new UserDao();

	// 3. 단일 인스턴스에 대한 getter
	public static UserDao getInstance() {
		return instance;
	}
	
	public UserResponseDto createUser(UserRequestDto dto) {
		try {
			String sql = "INSERT INTO user(id, password, name, phonenumber, email, birthday, gender) VALUES(?, ?, ?, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, PasswordCrypto.encrypto(dto.getPassword()));
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getPhonenumber());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getBrithday());
			String gender = Integer.parseInt(dto.getGender()) % 2 == 1 ? "M" : "F";
			System.out.println(gender);
			pstmt.setString(7, gender);
			
			pstmt.execute();
			
			UserResponseDto userResponseDto = new UserResponseDto(dto);
			return userResponseDto;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
