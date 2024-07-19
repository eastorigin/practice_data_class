package practice_data_class;

public class Purchaser {
	private int purchaserGoodsNumber;
	private int purchaserBudget;
	
	public Purchaser (int purchaserGoodsNumber, int purchaserBudget) {
		this.purchaserGoodsNumber = purchaserGoodsNumber;
		this.purchaserBudget = purchaserBudget;
	}
	
	public int getPurchaserGoodsNumber() {
		return purchaserGoodsNumber;
	}
	
	public int getPurchaserBudget() {
		return purchaserBudget;
	}
	
	public void increasePurchaserGoodsNumber(int number) {
		purchaserGoodsNumber += number;
	}
	
	public void decreasePurchaserBudget (int allPrice) {
		purchaserBudget -= allPrice;
	}
}
