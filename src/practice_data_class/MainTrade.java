package practice_data_class;

public class MainTrade {
	public static void main (String[] args) {
		
		Seller seller = new Seller(5, 1000, 100000);
		Purchaser purchaser = new Purchaser(0, 8000);
		
		Trade trade = new Trade(seller, purchaser);
		
		System.out.println("정상적으로 거래가 이루어지는 경우");
		trade.purchase(4);
		System.out.println("");
		
		System.out.println("재고보다 많은 상품을 구매하려 할 경우");
		trade.purchase(7);
		System.out.println("");
		
		System.out.println("예산이 부족한 경우");
		seller = new Seller(6, 3000, 100000);
		purchaser = new Purchaser(0, 8000);
		trade = new Trade(seller, purchaser);
		trade.purchase(3);
		
	}
}
