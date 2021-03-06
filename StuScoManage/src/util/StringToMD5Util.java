package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class StringToMD5Util {
	public static String toMD5(String src){
		String target = "";
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] result = md5.digest(src.getBytes());
			target = Hex.encodeHexString(result);
			System.out.println("MD5加密成功");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("MD5加密失败");
			e.printStackTrace();
		}
		
		return target;
	}
}
