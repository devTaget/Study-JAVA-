package starbucks;

public class Nike {

	public void nickregister(NickForm nickForm) {
		String[] menu = nickForm.getNick();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}if(nickForm instanceof NickForm) {
			System.out.println("���ᳪ�� ����");
		}
		
		nickForm.sell("��������");
	}
	
}
