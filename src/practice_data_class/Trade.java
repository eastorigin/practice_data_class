package practice_data_class;

public class Trade {

	Purchaser purchaser;
	Seller seller;
	
	public Trade (Seller seller, Purchaser purchaser) {
		this.seller = seller;
		this.purchaser = purchaser;
	}
	
	public void purchase (int tradeGoodsNumber) {
		if(this.purchaser.purchaserGoodsNumber > this.seller.sellerGoodsNumber) {
			this.seller.sellerMoney += this.seller.goodsPrice * this.seller.sellerGoodsNumber;
			this.purchaser.purchaserGoodsNumber += this.seller.sellerGoodsNumber;
			this.purchaser.purchaserBudget -= this.seller.goodsPrice * this.seller.sellerGoodsNumber;
			this.seller.sellerGoodsNumber = 0;
			System.out.println("구매자의 상품 수: " + this.purchaser.purchaserGoodsNumber);
			System.out.println("구매자의 지갑 현황: " + this.purchaser.purchaserBudget + "원");
			System.out.println("");
			System.out.println("판매자의 상품 수: " + this.seller.sellerGoodsNumber);
			System.out.println("판매자의 상품 가격: " + this.seller.goodsPrice + "원");
			System.out.println("판매자의 금고 현황: " + this.seller.sellerMoney + "원");
		}else if(this.purchaser.purchaserBudget < this.seller.goodsPrice * tradeGoodsNumber) {
			System.out.println("거래가 성립되지 않아 아무런 변화가 없다");
		}else {
			this.purchaser.purchaserGoodsNumber += tradeGoodsNumber;
			this.seller.sellerGoodsNumber -= tradeGoodsNumber;
			this.purchaser.purchaserBudget -= this.seller.goodsPrice * tradeGoodsNumber;
			this.seller.sellerMoney += this.seller.goodsPrice * tradeGoodsNumber;
			System.out.println("구매자의 상품 수: " + this.purchaser.purchaserGoodsNumber + "개");
			System.out.println("구매자의 지갑 현황: " + this.purchaser.purchaserBudget + "원");
			System.out.println("");
			System.out.println("판매자의 상품 수: " + this.seller.sellerGoodsNumber + "개");
			System.out.println("판매자의 상품 가격: " + this.seller.goodsPrice + "원");
			System.out.println("판매자의 금고 현황: " + this.seller.sellerMoney + "원");

		}
	}
}
