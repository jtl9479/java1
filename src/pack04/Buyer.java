package pack04;

public class Buyer {

	String mem_id;
	String mem_pwd;
	String name;
	int money = 2000;
	double bonus = 0;
	int count=0; //몇대 구매했는지 알수있다
	
	Product[] cart = new Product[10];
	
	void Buy(Product p) {//객체 선언
		if(money<p.price) {
			System.out.println("돈이 부족합니다 충전하세요");
			return;
		}
		
		money -= p.price; //제품 구매할때마다 돈이 깎인다
		bonus += p.bonus; //제품 구매할때 마다 마일리지가 쌓인다.
		
		cart[count++] = p; // 구매가 될떄마다 i가 증가한다 i가 증가하면 cart의 배열값도 증가한다.
		System.out.println(p.pro_name+" 구매되었습니다");
	}
	
}
