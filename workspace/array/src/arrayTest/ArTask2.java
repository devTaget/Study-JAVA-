package arrayTest;

import java.util.Scanner;

public class ArTask2 {

	public static void main(String[] args) {
//		각 버튼을 눌렀을 때 , 이동하는 페이지는 다음과 같다.
		
//		"btn1" : 회원가입 페이지
//		"btn2" : 로그인 페이지
//		"btn3" : 마이 페이지
		
//		회원가입 -> 로그인 -> 마이페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를경우, 이전 단계에 대한 메세지를 출력해준다.
//		예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
		
//		알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//		예) 회원가입 클릭 시, 회원가입 성공
//			마이페이지 클릭 시, 본인 이름과 나이 출력.
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1","btn2","btn3"};
		int[] arData = null;
		int num = 0;
		String msg ="1.회원가입\n2.로그인\n3.마이페이지\n0.나가기";
		String[] error = {"회원가입을 진행해주세요","로그인 후 이용가능합니다","번호를 다시 확인해주세요"};
		String[] join = {"이름과 나이 입력해주세요"};
		String[] login = {"로그인 성공"};
		String[] mypage = new String[2];
		String[] info = {"이름 : ","나이 : "};
		int[] check = new int[3];
		
//		System.out.println(msg);
//		num = sc.nextInt();
		while(true) {
			System.out.println(msg);
			num = sc.nextInt();
			if(num == 1) {
				check[0] = 1;
				System.out.println(join[0]);
				mypage[0] = sc.next();
				mypage[1] = sc.next();
				System.out.println("회원가입 성공");
			}else if(num == 2) {
				if(check[0] != 1) {
					System.out.println(error[0]);
					continue;
				}
				check[1] = 2;
				System.out.println(login[0]);
			}else if(num == 3) {
				if(check[1] != 2) {
					System.out.println(error[1]);
					continue;
				}
				System.out.printf(info[0] + mypage[0]+"\n");
				System.out.printf(info[1] + mypage[1]+"\n");
			}else if(num == 0) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println(error[2]);
			}
				
		}
				

	}

}
