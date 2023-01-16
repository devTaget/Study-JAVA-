package collectionTask;

import java.util.ArrayList;

public class Page {

	public static void main(String[] args) {
		UserField field = new UserField();
		
		
		//회원가입
		field.join("bnm0612", "kkkqqq1","01041219495");
		
		//아이디 중복검사
		field.idCheck("bnm0612");
		
		//로그인
		field.login("bnm0612", "kkkqqq1");
		
		//인증번호 받기
		field.noseBottomNumber("01041219495");
		
		//비밀번호 변경
		field.changePassword("bnm0612", "kkkqqq12", "01041219495", field.num);
		
		//변경된 비밀번호 로그인
		field.login("bnm0612", "kkkqqq12");
		
		
	}
}
