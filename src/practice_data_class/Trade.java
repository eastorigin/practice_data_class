package practice_data_class;

public class Trade {

	private Purchaser purchaser;
	private Seller seller;
	
	public Trade (Seller seller, Purchaser purchaser) {
		this.seller = seller;
		this.purchaser = purchaser;
	}
	
	public void purchase (int tradeGoodsNumber) {
		
		if(tradeGoodsNumber > this.seller.getSellerGoodsNumber()) {
			tradeGoodsNumber = this.seller.getSellerGoodsNumber();
		}
		
		int allPrice = this.seller.getGoodsPrice() * tradeGoodsNumber;
		
		if(this.purchaser.getPurchaserBudget() < this.seller.getGoodsPrice() * tradeGoodsNumber) {
			System.out.println("거래가 성립되지 않아 아무런 변화가 없다");
			resultTrade();
			return;
		}
		
//		this.purchaser.purchaserGoodsNumber += tradeGoodsNumber;
		purchaser.increasePurchaserGoodsNumber(tradeGoodsNumber);
//		this.seller.sellerGoodsNumber -= tradeGoodsNumber;
		seller.decreaseSellerGoodsNumber(tradeGoodsNumber);
//		this.purchaser.purchaserBudget -= this.seller.goodsPrice * tradeGoodsNumber;
		purchaser.decreasePurchaserBudget(allPrice);
//		this.seller.sellerMoney += this.seller.goodsPrice * tradeGoodsNumber;
		seller.increaseSellerMoney(allPrice);
			
		resultTrade();
	}
	
	public void resultTrade() {
		System.out.println("구매자의 상품 수: " + this.purchaser.getPurchaserGoodsNumber() + "개");
		System.out.println("구매자의 지갑 현황: " + this.purchaser.getPurchaserBudget() + "원");
		System.out.println("");
		System.out.println("판매자의 상품 수: " + this.seller.getSellerGoodsNumber() + "개");
		System.out.println("판매자의 상품 가격: " + this.seller.getGoodsPrice() + "원");
		System.out.println("판매자의 금고 현황: " + this.seller.getSellerMoney() + "원");
	}
}
