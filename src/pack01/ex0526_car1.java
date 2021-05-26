package pack01;


public class ex0526_car1 {

	public static void main(String[] args) {
		
	
	Car c = null;
	FireEngine f1 = new FireEngine(); //객체 생성
	FireEngine f2 = null;

	f1.water();
	
	
	c = f1; //f1객체 선언 - 저장공간이 만들어져있음
	//c.water(); //f1에서 c변경되면서 명령어는 car있는것만 사용함
	f2 = (FireEngine) c;
	f2.water();//car에서 가지고있는 water메소드주소를 보내준다. water메소드의 명령어가 있는 f2는 water메소드를 실행할수가 있다.

//	f2 =f1;
	
	
	
}
}