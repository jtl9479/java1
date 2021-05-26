package pack01;

public class ex0526_Product {

	public static void main(String[] args) {
		
		
		//Product
		//p1에서 c1으로 참조변수 복사
		//c1에서 p1으로 참조변수 복사
		//p1에서 c2으로 참조변수 복사
		//p1에서 s1으로 참조변수 복사
		//s1에서 p1으로 참조변수 복사
		//p1에서 s2으로 참조변수 복사
		//p1의 참조변수가 누구것인지 instanceof연산자를 사용해서 출력하시오
		
		Product p1 = null;
		
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		
		Computer c1 = new Computer();
		Computer c2 =  null;
		
		c1 = (Computer)p1;
		p1 = c1;
		c2 = (Computer) p1;
		s1 = (SmartPhone)p1;
		p1 = s1;
		s2 = (SmartPhone) p1;
		
		if(p1 instanceof Computer) {
			System.out.println("computer의 참조변수입니다");
		}else if(p1 instanceof SmartPhone){
			System.out.println("SmartPhone의 참조변수입니다");
		}
		
		
//		Product p1 = null; //
//		Product p2 = new Product(); //
//		Product p3 = null; //
//		
//		Computer c1 = new Computer();//cpuSpeed가 있다.
//		Computer c2 = null;
//		Computer c3 = null;
//		
//		SmartPhone s1 = new SmartPhone();
//		SmartPhone s2 = null;
//		SmartPhone s3 = null;
//		
//		//c1 -> p1, p1 -> c2
//		//s1 ->p3 p3 ->s2 s2 ->p1, p1 ->s3
//		
//		p1 = c1;
//		c2 = (Computer) p1;
//		
//		c2.cpuSpeed();
//		
//		p3 = s1;
//		s2 = (SmartPhone) p3;
//		p1 = s2;
//		s3 = (SmartPhone) p1;
//		
//		s3.cal();
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		p2.production_year();
//		//p1.production_year();//안된다.
//		
//		p1 = c1; //다형성 : 조상의 참조변수로 자손의 객체를 다루는것
//		c1.cpuSpeed();
//		//p1.cpuSpeed();//작동이안된다 명령어만을 가지고있지 공간을 가지고있지않는다
//		c1 = (Computer) p1;
//		c1.cpuSpeed();
//		
//		p1=c1;
//		c2 = (Computer) p1;
//		c2.cpuSpeed();
//		//c2는 명령어를 가지고있지만 null값으로 선언되어있어서 출력이 될수 없었지만
//		//p1이 주소 공간을 전달해줘서 사용할수가 있게 되었다.
//		
//		
//		
		
		
	}//main
}//class
