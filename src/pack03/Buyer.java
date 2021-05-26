package pack03;

public class Buyer {

	
	String mem_id;
	String mem_paw;
	String name;
	int money = 1000;//1000만원 적립금
	double bonusPoint = 0;
	int i=0;
	
	Product[] cart = new Product[10]; 
	//구매된것들이 cart[i++] = p; 통해 들어가져있다
	
	//구매목록 확인 배열
	//배열 10개를 만든다. 
	
	void buy(Product p) {//메소드로 객체 정의 
		if(money<p.price) {
			System.out.println("잔액이 부족합니다 충전하세요");
			return;
			//break;를 사용할수가 없어서 return으로 강제로 함수를 종료시킨다.
			//contiune는 for문을 사용해도 단 한번만 빠져나온다.
			//break는 switch문일때
		}
		
		money = money - p.price; //900만원 저장
		bonusPoint +=  p.bounsPoint; //10포인트 저장
		
		cart[i++] = p;//구매된것들이 들어가져있다.
		System.out.println(p.pro_name+ "가구매 되었습니다");
	}
	//메소드를 여러번 사용할 필요가 없다
	
	
	
//	void buy(Tv t) {//메소드로 객체 정의 
//		money = money - t.price; //900만원 저장
//		bonusPoint +=  t.bounsPoint; //10포인트 저장
//		System.out.println("OLED가 구매 되었습니다");
//	}
//	
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bounsPoint;
//		System.out.println(c.pro_name+"이 구매되었습니다");
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bounsPoint;
//		System.out.println(a.pro_name+"이 구매되었습니다");
//	}
	
	
	
	
	
	
}
