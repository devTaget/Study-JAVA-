package classTest;

class Company {
	static int sequence;
	static int total;
	int id;
	String name;
	int income;
	
//	�ʱ�ȭ ��
//	������ ȣ��� ������ ����
	{
		this.id = ++sequence;
	}
	
}

public class Market {
	public static void main(String[] args) {
		Company �ѵ��� = new Company();
		Company ������ = new Company();
		Company ���¾� = new Company();
		Company ��� = new Company();
		
		System.out.println(�ѵ���.id);
		System.out.println(������.id);
		System.out.println(���¾�.id);
		System.out.println(���.id);
		
//		Company.total += �ѵ���.income += 300;
//		Company.total += ������.income += 1000;
//		Company.total += ���¾�.income += 2000;
//		Company.total += ���.income += 3000;
		
		�ѵ���.income += 300;
		�ѵ���.income += 700;
		������.income += 1000;
		���¾�.income += 2000;
		���.income += 3000;
		
		Company.total += �ѵ���.income;
		Company.total += ������.income;
		Company.total += ���¾�.income;
		Company.total += ���.income;
		
		System.out.println("ȸ�� ���� : " + Company.total + "����");
	}
}




















