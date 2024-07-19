package practice_data_class;

/**
 * 자판기에서 판매하는 상품
 */
public class Beverage {

	private String name;
	private int price;
	private int stock;
	
	public Beverage (String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	
	public void decraeseGetStock(int number) {
		this.stock -= number;
	}
	
	public void increaseGetStock(int stockNumber) {
		this.stock += stockNumber;
	}
}
