package pack04;

public class ex0526_01 {

	public static void main(String[] args) {
		//조상 : product ->완료
		//자손 : Refrigerator - "비스포크",300,30 X
		//자손 : Washer - "트럼",180,18 X
		//자손 : Conditioner -"무풍",230,23 X
		//자손 : Styler -"스타일러",130,13 X
		//초기 보유금액 - 2000
		//구매 물품 - 비스포크2대 트럼 3대 무풍 1대 스타일러 2대
		// 총구매금액 출력, 총구매 개수 출력, 총구매목록 출력
		
		
		Buyer b = new Buyer();
		
		b.Buy(new Refrigerator());//선언
		b.Buy(new Refrigerator());//선언
		b.Buy(new Washer());
		b.Buy(new Washer());
		b.Buy(new Washer());
		b.Buy(new Conditioner());
		b.Buy(new Styler());
		b.Buy(new Styler());

		
		int sum = 0;
		int bonus =0;
		String pro_name ="";
		for(int i=0; i<b.count; i++) {
			sum += b.cart[i].price;
			bonus += b.cart[i].bonus;
			pro_name += (i+1)+"."+b.cart[i].pro_name+ "\n";
		}
		System.out.println("보유 금엑 : " + b.money);
		System.out.println("총구매금액 : " + sum);
		System.out.println("총보너스 : " + bonus);
		System.out.println("구매 목록 : \n" + pro_name + " ");
	
	}
}
