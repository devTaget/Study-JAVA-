package methodTest;

import java.util.Scanner;

public class MethodTask {
// 1~10 ���� println()���� ����ϴ� �޼ҵ�
	void ten(){
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}
	
//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void user(int a) {
		for (int i = 0; i <a; i++) {
			System.out.println("ȫ����~");
		}
	}
//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void name(String name, int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(name);
		}
	}
	
//	�� ������ ������ ���ִ� �޼ҵ�
	int minus(int a,int b,int c) {
		int result = 0;
		result = a - b - c; 
		System.out.println("�� ������ ���� �� : " + result);
		return result;
	}
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
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
//	1~n ������ ���� �����ִ� �޼ҵ�
	int total(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result += i;
		}
		System.out.println(result);
		
		return result;
	}
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
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
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int[] number(int[] num) {
		int num1 = 0;
		int[] result = new int[5];
		for (int i = 0; i < result.length; i++) {
			result[i] = num1; 
		}
		
		return result;
	}
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	String eng(String name) {
		String result = "";
		String hangle = "�����̻�����ĥ��";
		for (int i = 0; i < name.length(); i++) {
			result += hangle.charAt(i);
		}
			System.out.println(result);
	
		return result;
	}
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask methodTask = new MethodTask();
		
//		methodTask.ten();
//		methodTask.user(5);
//		methodTask.name("rlwjdvy", 3);
//		methodTask.minus(1, 5, 2);
		
//		System.out.println("������ : " + methodTask.div(3, 4)[0]);
//		System.out.println("�� : " + methodTask.div(3, 4)[1]);
		
		
//		methodTask.total(5);
//		methodTask.Change(3);
//		System.out.println(methodTask.number(1)[1]);
		
		methodTask.eng("�ϰ��̻�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

private char[][] number(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
