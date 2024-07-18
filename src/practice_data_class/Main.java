package practice_data_class;

public class Main {

	public static void main (String [] args) {
		Beverage bacchus = new Beverage("박카스", 900, 15);
		Beverage monster = new Beverage("몬스터", 1500, 20);
		Beverage hotsix = new Beverage("핫식스", 1300, 10);
		Beverage milkiss = new Beverage("밀키스", 1400, 5);
		
		BeverageMachine beverageMachine = new BeverageMachine(bacchus, monster, hotsix, milkiss);
		
		beverageMachine.outPutStock();
		
		Beverage myBeverage = beverageMachine.orderBeverage("스타벅스", 5);
		System.out.println(myBeverage);
		// System.out.println(myBeverage.name); // 현재 myBeverage가 null이기 때문에 오류가 남
		
		Beverage mySecondBeverage = beverageMachine.orderBeverage("밀키스", 3);
		// mySecondBeverage ==> Reference Type ==> 메모리 묶음 ==> 무엇을 출력할지 모른다
		// 객체의 메모리 정보를 출력한다
		// @44f75083 ==> Hash Data ==> 객체가 가지고 있는 데이터를 숫자로 바꾼 값
		System.out.println(mySecondBeverage); // practice_data_class.Beverage@44f75083
		System.out.println("구매한 상품의 이름: " + mySecondBeverage.name);
		System.out.println("구매한 상품의 총 가격: " + mySecondBeverage.price);
		System.out.println("구매한 상품의 개수: " + mySecondBeverage.stock);
		
		beverageMachine.outPutStock();
		
		beverageMachine.stockBeverage("몬스터", 10);
		beverageMachine.outPutStock();
	}
}
