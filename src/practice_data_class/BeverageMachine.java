package practice_data_class;

/**
 * 자판기
 * 
 * 4개의 Beverage을 판매하는 자판기
 */
public class BeverageMachine {

	Beverage bacchus;
	Beverage monster;
	Beverage hotsix;
	Beverage milkiss;
	
	public BeverageMachine (Beverage bacchus, Beverage monster, Beverage hotsix, Beverage milkiss) {
		this.bacchus = bacchus;
		this.monster = monster;
		this.hotsix = hotsix;
		this.milkiss = milkiss;
	}
	
	public Beverage orderBeverage (String orderBeverageName, int orderNumber) {
		if(this.bacchus.name.equals(orderBeverageName)) { // 항상 string 비교는 비교연산자가 아닌 .equals() 사용하는거 기억하기
			if(this.bacchus.stock <= 0 ) {
				System.out.println(this.bacchus.name + "이 품절되었습니다");
				return null; // 메모리에 할당된 데이터가 없는 상태
			}else {
				// this.bacchus.stock = this.bacchus.stock - orderNumber;
				this.bacchus.stock -= orderNumber;
				
				// 손님이 가져갈 상품의 정보
				Beverage newBacchus = new Beverage(this.bacchus.name, this.bacchus.price * orderNumber, orderNumber);
				return newBacchus;
			}
		}else if(this.monster.name.equals(orderBeverageName)) {
			if(this.monster.stock <= 0) {
				System.out.println(this.monster.name + "이 품절되었습니다");
				return null;
			}else {
				this.monster.stock = this.monster.stock - orderNumber;
				Beverage newMonster = new Beverage(this.monster.name, this.monster.price * orderNumber, orderNumber);
				return newMonster;
			}
		}else if(this.hotsix.name.equals(orderBeverageName)) {
			if(this.hotsix.stock <= 0) {
				System.out.println(this.hotsix.name + "이 품절되었습니다");
				return null;
			}else {
				this.hotsix.stock = this.hotsix.stock - orderNumber;
				Beverage newHotsix = new Beverage(this.hotsix.name, this.hotsix.price * orderNumber, orderNumber);
				return newHotsix;
			}
		}else if(this.milkiss.name.equals(orderBeverageName)) {
			if(this.milkiss.stock <= 0) {
				System.out.println(this.milkiss.name + "이 품절되었습니다");
				return null;
			}else {
				this.milkiss.stock = this.milkiss.stock - orderNumber;
				Beverage newMilkiss = new Beverage(this.milkiss.name, this.milkiss.price * orderNumber, orderNumber);
				return newMilkiss;
			}
		}else {
			System.out.println("그런 상품은 없습니다");
		}
		
		return null;
	}
	
	public void stockBeverage (String stockBeverageName, int stockNumber) {
		if(this.bacchus.name.equals(stockBeverageName)) {
			// this.bacchus.stock = this.bacchus.stock + stockNumber;
			this.bacchus.stock += stockNumber;
		}else if(this.monster.name.equals(stockBeverageName)) {
			this.monster.stock = this.monster.stock + stockNumber;
		}else if(this.hotsix.name.equals(stockBeverageName)) {
			this.hotsix.stock = this.hotsix.stock + stockNumber;
		}else if(this.milkiss.name.equals(stockBeverageName)) {
			this.milkiss.stock = this.milkiss.stock + stockNumber;
		}else {
			System.out.println("그런 상품은 판매하지 않습니다");
		}
	}
	
	public void outPutStock() {
		System.out.println("현재 " + this.bacchus.name + " 재고 수량: " + this.bacchus.stock + "개");
		System.out.println("현재 " + this.monster.name + " 재고 수량: " + this.monster.stock + "개");
		System.out.println("현재 " + this.hotsix.name + " 재고 수량: " + this.hotsix.stock + "개");
		System.out.println("현재 " + this.milkiss.name + " 재고 수량: " + this.milkiss.stock + "개");
	}
}
