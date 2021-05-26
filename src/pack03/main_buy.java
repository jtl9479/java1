package pack03;

public class main_buy {

	public static void main(String[] args) {

		// TODO Auto-generated constructor stub

		Buyer b = new Buyer();
//		Tv t1 = new Tv();
//		b.buy(t1);//buyer클래스의 buy메소드가 실행된다
		// Product t1 = new Tv(); 를하지 않는 이유는
		// void buy(Product p)를 Tv t1을 대체 한것이다 Product를 사용해도된다
		Product t1 = new Tv();
		// b.buy(t1);

		Computer C = new Computer();
		// Product p 는 b.buy안에 있다. 그래서 객체선언할때 Product를 사용하지 않고
		// Computer를 사용해도되는것이다

		// b.buy(C);

		// Product p = new Audio() 라는 것이다.
		// 출력하는 3가지 방법 나중에는 b.buy(new Audio()); 을 사용한다

		b.mem_id = "member01";
		b.name = "홍길동";
		// b.buy(a);

		b.buy(new Audio());//50
		b.buy(new Tv());//100
		b.buy(new Audio());//50
		b.buy(new Tv());//100
		b.buy(new Tv());//100
		b.buy(new Tv());//100
		b.buy(new Computer());//150
		b.buy(new Computer());//150
		b.buy(new Computer());//150
		b.buy(new Computer());//150 
		b.buy(new Computer());//150 
	

		System.out.println("보유 금액 :" + b.money);
		System.out.println("보유 보너스 :" + b.bonusPoint);

		int sum = 0;
		double bonus = 0;
		String buy_print = "";
		for (int i = 0; i < b.i; i++) {

			sum = sum + b.cart[i].price;
			bonus = bonus + b.cart[i].bounsPoint;
			buy_print = buy_print + b.cart[i].pro_name + " ";
		}
		System.out.println("구매목록 : " + buy_print);
		System.out.println("총구매금액: " + sum);
		System.out.println("총보너스포인트 : " + bonus);
	}
}
