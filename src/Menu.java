import java.util.HashMap;

public abstract class Menu {
	
	public static HashMap<String, Integer> menu;
	
	public Menu() {
		// TODO Auto-generated constructor stub
		menu = new HashMap<String, Integer>();
		
		setMenu();
	}

	public static void setMenu() {
		menu.put("Idly", 10);
		menu.put("Vada", 15);
		menu.put("Plain Dosa", 20);
		menu.put("Masala Dosa", 30);
		menu.put("Tea", 5);
		menu.put("Coffee", 7);
	}
}
