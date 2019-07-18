import java.util.ArrayList;

public interface Billing {
	public static ArrayList<Integer> billingList = new ArrayList<Integer>();
	
	public abstract int calculateBill();
}
