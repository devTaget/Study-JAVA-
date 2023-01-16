package collectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {

	ArrayList<User> users = DBConnecter.users;
	public static int KEY = 3;
	String num = "";

	// 아이디 중복검사
	public User idCheck(String id) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id)) {
				return users.get(i);
			}
		}
		return null;
	}

	// 회원가입
	public boolean join(String id, String password, String phoneNumber) {
		if (idCheck(id) == null) {
			User user = new User();
			user.setId(id);
			user.setPassword(en(password));
			user.setPhoneNumber(phoneNumber);
			users.add(user);
			System.out.println("가입완료");
			return true;
		}
		System.out.println("가입실패");
		return false;
	}
	   public void join1(User user) {
		      user.setPassword(user.getPassword());
		      users.add(user);
		   }

	
	
	// 로그인
	public void login(String id, String password) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id) && users.get(i).getPassword().equals(en(password))) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		}

	}

	// 암호화
	public String en(String password) {
		String result = "";
		for (int i = 0; i < password.length(); i++) {
			result += (char) password.charAt(i) * KEY;
		}
		return result;
	}

	// 비밀번호 변경(비밀번호 찾기)
	public void changePassword(String id, String password, String phoneNumber, String number) {
		User user = new User();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id) && users.get(i).getPhoneNumber().equals(phoneNumber)) {
				if (num.equals(number)) {
					idCheck(id).setPassword(en(password));
					System.out.println("변경됨");
				}

			}
		}

	}

	// 인증번호
	public String noseBottomNumber(String phoneNumber) {
		Random random = new Random();

		num = "" + random.nextInt(899999) + 100000;

//		String api_key = "NCSUGBU3ODWJWU1K";
//	       String api_secret = "JHJGLGTGAIP7HFSSMFLJPI1U7VVCDLTI";
//	       Message coolsms = new Message(api_key, api_secret);
//
//	       // 4 params(to, from, type, text) are mandatory. must be filled
//	       HashMap<String, String> params = new HashMap<String, String>();
//	       
//	       params.put("to", phoneNumber);
//	       params.put("from", "01041219495");
//	       params.put("type", "SMS");
//	       params.put("text","1234");
//	       params.put("app_version", "test app 1.2"); // application name and version
//
//	       try {
//	         JSONObject obj = (JSONObject) coolsms.send(params);
//	         System.out.println(obj.toString());
//	       } catch (CoolsmsException e) {
//	         System.out.println(e.getMessage());
//	         System.out.println(e.getCode());
//	       }

		return num;

	}

}
