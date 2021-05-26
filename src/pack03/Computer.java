package pack03;

public class Computer extends Product{

	
	
//	Computer(String pro_name,int price){
//		super(pro_name,price,price/10);
//	}
// 가능하다
	
	Computer(){
		//조상객체의 변수개수와 맞아야한다.
		super("MACBOOK",150,150/10);

		// 와 같다
//		super.price = 150; 
//		//product의 price를 상속 받아서 int를 안써도된다
//		//super 조상변수를 가르킨다
//		super.bounsPoint = price/0.1;
	}
}
