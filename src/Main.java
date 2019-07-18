import java.util.Scanner;

public class Main extends Menu implements Billing, Ordering {
	static Scanner read;
	static int noOfItems;
	
	enum Actions {
		Order, Bill, Stop, Menu;
	}
	
	
	public Main() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	public void getOrder() {
		// to store order in a String ArrayList
		read = new Scanner(System.in);
		
		orderList.add(read.nextLine());
		noOfItems = orderList.size();
	}
	
	
	
	public int calculateBill() {
		// to store order in an Integer ArrayList and calculate the sum of the order
		int cnt = 0; // counter variable
		int totalAmount = 0; // total bill
		
		
		if (orderList.isEmpty()) {
			totalAmount = 0;
		}
		else {
			try {
				
				
				// adding the cost of the ordered items in the arraylist
				while (cnt < noOfItems) {
					billingList.add(menu.get(orderList.get(cnt++)));
				}
				
				// computing the total amount of the ordered items 
				for (Integer i : billingList) {
					totalAmount += i;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			billingList.clear();
			orderList.clear();
		}
		
		return totalAmount;
	}
	
	
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		
		read = new Scanner(System.in);
		
		Actions action = null;
		
		while (action != Actions.Stop) {
			System.out.print("||||||||||||||||||||\n---> Order\n---> Bill\n---> Menu\n---> Stop\n||||||||||||||||||||\n\nWhat do you want to do? ");
			String choice = read.nextLine();
			action = Actions.valueOf(choice);
			System.out.println();
			
			switch (action) {
			case Order: 
				mainObj.getOrder();
				break;

			case Bill:
				int billAmount = mainObj.calculateBill();
				System.out.println("\nTotal bill is: " + billAmount + "\n");
				break;
				
			case Menu:
				System.out.println("********************\n" + menu + "\n********************\n");
				break;

			case Stop:
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice.");
			}
		}
	}
}
