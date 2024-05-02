package service.user.model;

import org.mindrot.jbcrypt.BCrypt;

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
			System.out.println("회원가입 실패");
		}
		return null;
	}

	public UserResponseDto findByIdAndPassword(String targetId, String targetPassword) {
		UserResponseDto dto = null;
		try {
			String sql = "select * from user where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, targetId);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("password"));
				if (!PasswordCrypto.decrypto(targetPassword, rs.getString("password"))) {
					System.out.println("비밀번호 오류");
					return null;
				}
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phonenumber = rs.getString("phonenumber");
				String email = rs.getString("email");
				String birthday = rs.getString("birthday");
				String gender = rs.getString("gender");
				dto = new UserResponseDto(id, password, name, phonenumber, email, birthday, gender);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("로그인 로직 실패");
		}
		return dto;
	}
}
