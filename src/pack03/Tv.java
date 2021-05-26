package pack03;

public class Tv extends Product{
	
//	int price;
//	int bounsPoint;
	
	Tv(){
		
		//super(100,100/0.1); //로해도된다
		super.pro_name="OLEDTV";
		super.price = 100; 
		//product의 price를 상속 받아서 int를 안써도된다
		//super 조상변수를 가르킨다
		super.bounsPoint = price/10;
		
	}
	
}
