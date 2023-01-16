package starbucks;

public class Starbucks {


	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		form.sell("아메리카노");
	}


	
	
	
	
	
	
}
