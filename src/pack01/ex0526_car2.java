package pack01;

public class ex0526_car2 {

	public static void main(String[] args) {
		
		Car c1 = null; //c1은 Car참조변수
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		FireEngine f3 = null;
		
		Ambulance a1 = new Ambulance();
		Ambulance a2 = null;
		Ambulance a3 = null;
		
		c1 = a1;
		if(c1 instanceof FireEngine) {
			f3 =(FireEngine)c1;
			System.out.println("FireEngine 참조변수에 복사했습니다");
		}else if(c1 instanceof Ambulance){
			a3 =(Ambulance)c1;
			System.out.println("Ambulance 참조변수에 복사했습니다");
		}
	}
}
