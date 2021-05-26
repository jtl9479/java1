package pack01;

public class ex0526_car {

	public static void main(String[] args) {
		
		Car c1 = null; //객체 생성 없는 참조변수
		Car c2 = new Car();
		
		FireEngine f1 = null;
		FireEngine f2 = new FireEngine();
		
		Ambulance a1 = null;
		Ambulance a2 = new Ambulance();
		
		Car c3 = new FireEngine(); //다형성
		Car c4 = new Ambulance();
		
		//자손의 참조 변수로 조상의 객체를 다루는것은 불가능하다
		
		
		c1 = f1; //조상 객체가 선언되지 않은 참조변수 주소값만을 넣는다
		c1 = f2; //다형성 new FireEngine();를 넣는다 객체를 넣는다
		f1 = (FireEngine) c1;// 가능하지만 형변환을 해줘야한다. 주소가 들어간다
		//f1 = (FireEngine) c2;// 에러 객체선언되어있는 부모 참조변수는 변환 불가
		System.out.println("f1 : " + f1);
		
		c1 =a1;
		c1 =a2; //다형성 a2:객체선언되어 있음
		a1 = (Ambulance) c1;//형변환
		//a1 = (Ambulance) c2;//형변환 에러 부모객체선언되어있음
	
		c1 = f1; //car <- fireengine
		//a1 = (FireEngine)c1; //안된다
	
	}
}
