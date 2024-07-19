package practice_data_class;

public class Seller {
	private int sellerGoodsNumber;
	private int goodsPrice;
	private int sellerMoney;
	
	public Seller (int sellerGoodsNumber, int goodsPrice, int sellerMoney) {
		this.sellerGoodsNumber = sellerGoodsNumber;
		this.goodsPrice = goodsPrice;
		this.sellerMoney = sellerMoney;
	}
	
	public int getSellerGoodsNumber() {
		return sellerGoodsNumber;
	}
	
	public int getGoodsPrice() {
		return goodsPrice;
	}
	
	public int getSellerMoney() {
		return sellerMoney;
	}
	
	public void decreaseSellerGoodsNumber(int number) {
		sellerGoodsNumber -= number;
	}
	
	public void increaseSellerMoney (int allPrice) {
		sellerMoney += allPrice;
	}

}
