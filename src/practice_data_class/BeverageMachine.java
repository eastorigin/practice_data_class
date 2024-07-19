package practice_data_class;

/**
 * 자판기
 * 
 * 4개의 Beverage을 판매하는 자판기
 */
public class BeverageMachine {

	private Beverage bacchus;
	private Beverage monster;
	private Beverage hotsix;
	private Beverage milkiss;
	
	public BeverageMachine (Beverage bacchus, Beverage monster, Beverage hotsix, Beverage milkiss) {
		this.bacchus = bacchus;
		this.monster = monster;
		this.hotsix = hotsix;
		this.milkiss = milkiss;
	}
	
	public Beverage orderBeverage (String orderBeverageName, int orderNumber) {
		if(this.bacchus.getName().equals(orderBeverageName)) { // 항상 string 비교는 비교연산자가 아닌 .equals() 사용하는거 기억하기
			if(this.bacchus.getStock() <= 0 ) {
				System.out.println(this.bacchus.getName() + "이 품절되었습니다");
				return null; // 메모리에 할당된 데이터가 없는 상태
			}else {
				this.bacchus.decraeseGetStock(orderNumber);
				// 손님이 가져갈 상품의 정보
				Beverage newBacchus = new Beverage(this.bacchus.getName(), this.bacchus.getPrice() * orderNumber, orderNumber);
				return newBacchus;
			}
		}else if(this.monster.getName().equals(orderBeverageName)) {
			if(this.monster.getStock() <= 0) {
				System.out.println(this.monster.getName() + "이 품절되었습니다");
				return null;
			}else {
				
				//Beverage beverage = new Beverage("몬스터", 1500, 20);
				// this.monster.stock = this.monster.stock - orderNumber;
				// beverage.decraeseGetStock(monster, orderNumber);
				this.monster.decraeseGetStock(orderNumber);
				Beverage newMonster = new Beverage(this.monster.getName(), this.monster.getPrice() * orderNumber, orderNumber);
				return newMonster;
			}
		}else if(this.hotsix.getName().equals(orderBeverageName)) {
			if(this.hotsix.getStock() <= 0) {
				System.out.println(this.hotsix.getName() + "이 품절되었습니다");
				return null;
			}else {
				// Beverage beverage = new Beverage("핫식스", 1300, 10);
				// this.hotsix.stock = this.hotsix.stock - orderNumber;
				// beverage.decraeseGetStock(hotsix, orderNumber);
				this.hotsix.decraeseGetStock(orderNumber);
				Beverage newHotsix = new Beverage(this.hotsix.getName(), this.hotsix.getPrice() * orderNumber, orderNumber);
				return newHotsix;
			}
		}else if(this.milkiss.getName().equals(orderBeverageName)) {
			if(this.milkiss.getStock() <= 0) {
				System.out.println(this.milkiss.getName() + "이 품절되었습니다");
				return null;
			}else {
				// Beverage beverage = new Beverage("밀키스", 1400, 5);
				// this.milkiss.stock = this.milkiss.stock - orderNumber;
				// beverage.decraeseGetStock(milkiss, orderNumber);
				this.monster.decraeseGetStock(orderNumber);
				Beverage newMilkiss = new Beverage(this.milkiss.getName(), this.milkiss.getPrice() * orderNumber, orderNumber);
				return newMilkiss;
			}
		}else {
			System.out.println("그런 상품은 없습니다");
		}
		
		return null;
	}
	
	public void stockBeverage (String stockBeverageName, int stockNumber) {
		if(this.bacchus.getName().equals(stockBeverageName)) {
			// Beverage beverage = new Beverage("박카스", 900, 15);
			// this.bacchus.stock = this.bacchus.stock + stockNumber;
			// this.bacchus.stock += stockNumber;
			// beverage.increaseGetStock(bacchus, stockNumber);
			this.bacchus.increaseGetStock(stockNumber);
			
		}else if(this.monster.getName().equals(stockBeverageName)) {
			// Beverage beverage = new Beverage("몬스터", 1500, 20);
			// this.monster.stock = this.monster.stock + stockNumber;
			// beverage.increaseGetStock(monster, stockNumber);
			this.monster.increaseGetStock(stockNumber);
		}else if(this.hotsix.getName().equals(stockBeverageName)) {
			// Beverage beverage = new Beverage("핫식스", 1300, 10);
			// this.hotsix.stock = this.hotsix.stock + stockNumber;
			// beverage.increaseGetStock(hotsix, stockNumber);
			this.hotsix.increaseGetStock(stockNumber);
		}else if(this.milkiss.getName().equals(stockBeverageName)) {
			// Beverage beverage = new Beverage("밀키스", 1400, 5);
			// this.milkiss.stock = this.milkiss.stock + stockNumber;
			// beverage.increaseGetStock(milkiss, stockNumber);
			this.milkiss.increaseGetStock(stockNumber);
		}else {
			System.out.println("그런 상품은 판매하지 않습니다");
		}
	}
	
	public void outPutStock() {
		System.out.println("현재 " + this.bacchus.getName() + " 재고 수량: " + this.bacchus.getStock() + "개");
		System.out.println("현재 " + this.monster.getName() + " 재고 수량: " + this.monster.getStock() + "개");
		System.out.println("현재 " + this.hotsix.getName() + " 재고 수량: " + this.hotsix.getStock() + "개");
		System.out.println("현재 " + this.milkiss.getName() + " 재고 수량: " + this.milkiss.getStock() + "개");
	}
}
