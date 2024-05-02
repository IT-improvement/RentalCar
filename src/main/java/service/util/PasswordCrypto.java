package service.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordCrypto {

	public static String encrypto(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
	public static boolean decrypto(String password, String key) {
		return BCrypt.checkpw(password, key);
	}
}
