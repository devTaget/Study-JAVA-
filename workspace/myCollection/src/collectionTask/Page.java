package collectionTask;

import java.util.ArrayList;

public class Page {

	public static void main(String[] args) {
		UserField field = new UserField();
		
		
		//ȸ������
		field.join("bnm0612", "kkkqqq1","01041219495");
		
		//���̵� �ߺ��˻�
		field.idCheck("bnm0612");
		
		//�α���
		field.login("bnm0612", "kkkqqq1");
		
		//������ȣ �ޱ�
		field.noseBottomNumber("01041219495");
		
		//��й�ȣ ����
		field.changePassword("bnm0612", "kkkqqq12", "01041219495", field.num);
		
		//����� ��й�ȣ �α���
		field.login("bnm0612", "kkkqqq12");
		
		
	}
}
