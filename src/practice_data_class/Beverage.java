package practice_data_class;

/**
 * 자판기에서 판매하는 상품
 */
public class Beverage {

	String name;
	int price;
	int stock;
	
	public Beverage (String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
}
