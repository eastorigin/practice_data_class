package practice_data_class;

public class MarketPlace {

	public static void main(String[] args) {
		
		AnswerSeller shoeMarker = new AnswerSeller(100, 150_000, 1_000);
		Buyer me = new Buyer(1_000_000);
		
		int orderCount = 2;
		if(orderCount * shoeMarker.PRICE <= me.getMoney()) {
			int orderQuantity = shoeMarker.sell(orderCount);
			
			me.buy(orderQuantity, orderQuantity * shoeMarker.PRICE);
		}
		
		shoeMarker.printSellerInfo();
		me.printBuyerInfo();
	}
}
