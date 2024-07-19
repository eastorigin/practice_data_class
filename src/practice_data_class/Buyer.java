package practice_data_class;

/**
 * 구매자
 */
public class Buyer {

	private int itemCount; // 인스턴스 멤버변수는 기본값을 가지고 있다 (숫자 => 0, 불린 => false, char => 0) / 매개변수는 불가능
	private int money;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	/**
	 * 구매자가 구매를 한다
	 * @param quantity 구매할 수량
	 * @param price 구매할 수량 * 판매 상품의 단가
	 */
	public void buy(int quantity, int price) {
		
		if(this.money >= price) {
			this.money -= price;
			this.itemCount += quantity;
		}
	}
	
	public void printBuyerInfo() {
		System.out.println("구매자의 상품 수: " + this.itemCount + "개");
		System.out.println("구매자의 지갑 현황: " + this.money + "원");
	}
}
