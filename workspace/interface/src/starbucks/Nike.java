package starbucks;

public class Nike {

	public void nickregister(NickForm nickForm) {
		String[] menu = nickForm.getNick();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}if(nickForm instanceof NickForm) {
			System.out.println("무료나눔 매장");
		}
		
		nickForm.sell("에어포스");
	}
	
}
