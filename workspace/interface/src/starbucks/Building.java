package starbucks;

public class Building {
	
	public static void main(String[] args) {
//		Starbucks kangstarbucks =  new Starbucks();
//		Starbucks jamstarbucks =  new Starbucks();
//		
//		
//		kangstarbucks.register(new Form() {
//			
//			@Override
//			public String[] sell(String[] menu) {
//				String[] menus = getMenu();
//				for (int i = 0; i < menus.length; i++) {
//					if(menus[i].equals(menu)) {
//						System.out.println(menu+"�Ǹ�");
//					};
//				}
//			}
//			
//			@Override
//			public String[] getMenu() {
//				return new String[] {"ī���","�Ƹ޸�ī��","��","�ٴҶ��"};
//			}
//		});
		
		
		
		Nike kangnamNick = new Nike();
		Nike jamsilNick = new Nike();
			
		jamsilNick.nickregister(new NickForm() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getNick();
				for (int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menu + "�ǸŰ���");
					}
				}
			}
			
			@Override
			public String[] getNick() {
				return new String[] {"��������","����ž","�õ彺��"};
			}
		});
		
		kangnamNick.nickregister(new NickForm() {
			
			@Override
			public void sell(String menu) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String[] getNick() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	

}
