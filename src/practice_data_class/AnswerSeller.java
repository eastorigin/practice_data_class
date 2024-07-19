package practice_data_class;

/**
 * 판매자
 */
public class AnswerSeller {

	/**
	 * 재고
	 */
	private int stock;
	
	/**
	 * 상품의 판매 금액
	 */
	
	public final int PRICE;
	
	/**
	 * 금고
	 */
	private int money;
	
	public AnswerSeller(int stock, int price, int money) {
		this.stock = stock;
		this.PRICE = price;
		this.money = money;
	}
	
	/**
	 * 판매자가 판매를 한다
	 * @param quantity 판매하려는 수량
	 * @return 판매할 수 있는 수량
	 */
	public int sell(int quantity) {
		if(this.stock >= quantity) {
			this.stock -= quantity;
			this.money += this.PRICE * quantity;
			return quantity;
		}
		quantity = this.stock;
		
		this.money = this.PRICE *this.stock;
		this.stock = 0;
		return quantity;
	}
	
	public void printSellerInfo() {
		System.out.println("판매자의 상품 수: " + this.stock + "개");
		System.out.println("판매자의 상품 가격: " + this.PRICE + "원");
		System.out.println("판매자의 금고 현황: " + this.money + "원");
	}
}
