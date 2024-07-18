package practice_data_class;

public class MainTrade {
	public static void main (String[] args) {
		
		Seller seller = new Seller(2, 230, 100000);
		Purchaser purchaser = new Purchaser(0, 8000);
		
		Trade trade = new Trade(seller, purchaser);
		
		trade.purchase(5);
		trade.purchase(100);
	}
}
