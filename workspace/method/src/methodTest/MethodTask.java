package methodTest;

import java.util.Scanner;

public class MethodTask {
// 1~10 까지 println()으로 출력하는 메소드
	void ten(){
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}
	
//	"홍길동"을 n번 println()으로 출력하는 메소드
	void user(int a) {
		for (int i = 0; i <a; i++) {
			System.out.println("홍씨요~");
		}
	}
//	이름을 n번 println()으로 출력하는 메소드
	void name(String name, int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(name);
		}
	}
	
//	세 정수의 뺄셈을 해주는 메소드
	int minus(int a,int b,int c) {
		int result = 0;
		result = a - b - c; 
		System.out.println("세 정수의 뺄셈 값 : " + result);
		return result;
	}
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	int[] div(int a, int b) {
		int[] result = new int[2];
		int num = 0;
		int num1 = 0;
		if(b != 0) {
		 
		num = a % b;
		num1 = a / b;
		
		result[0] = num;
		result[1] = num1;
		
		
		}
		return result;
	}	
//	1~n 까지의 합을 구해주는 메소드
	int total(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i;
		}
		System.out.println(result);
		
		return result;
	}
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int Change(int num) {
		int result = 0;
		if(num % 2 == 0 ) {
			result = num + 1;
		}else if(num % 2 != 0){
			result = num - 1;
		}
		System.out.println(result);
		
		return result;
	}
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int[] number(int[] num) {
		int num1 = 0;
		int[] result = new int[5];
		for (int i = 0; i < result.length; i++) {
			result[i] = num1; 
		}
		
		return result;
	}
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	String eng(String name) {
		String result = "";
		String hangle = "공일이삼사오육칠팔";
		for (int i = 0; i < name.length(); i++) {
			result += hangle.charAt(i);
		}
			System.out.println(result);
	
		return result;
	}
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask methodTask = new MethodTask();
		
//		methodTask.ten();
//		methodTask.user(5);
//		methodTask.name("rlwjdvy", 3);
//		methodTask.minus(1, 5, 2);
		
//		System.out.println("나머지 : " + methodTask.div(3, 4)[0]);
//		System.out.println("몫 : " + methodTask.div(3, 4)[1]);
		
		
//		methodTask.total(5);
//		methodTask.Change(3);
//		System.out.println(methodTask.number(1)[1]);
		
		methodTask.eng("일공이사");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

private char[][] number(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
