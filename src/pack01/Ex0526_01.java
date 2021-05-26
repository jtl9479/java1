package pack01;

public class Ex0526_01 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ctv = new CaptionTv();
		ctv.text="라라라라라라라라";
		
		
		//Tv t2 = new CaptionTv(); //다형성
		
		
		
		
		//참조변수는 이동을 할수가 있다
		Tv tt = null;//Tv에 있는 변수를 사용한다. 객체가 들어가있지않다. 아무것도 들어가있지가 않다.
		CaptionTv cctv = null;//CaptionTv에 있는 변수를 사용한다
		
		tt = cctv;//자손의 참조변수를 조상에 참조변수에 넣는다. 가능하다
		cctv = (CaptionTv) tt; //조상 -> 자손갈때 형변환 필수
		//객체가 들어가있지 않을때에는 조상에변수에서 자손의 변수로 이동이 가능하다
		// (CaptionTv)를 넣으면 가능하다
		
		
		
		
		//객체는 이동을 할수가 없다.
		//t= ctv; //다형성 조상 참조변수가지고 자손의 객체를 사용할수가 있다.
		//Tv t = new CaptionTv(); 와 같다
		//ctv = t;  ->반대로 자손의 참조변수가지고 조상의 객체를  이용하는것은 안된다.
		
		//참조변수는 이동을할수가 있다.
		//객체는 이동을 할수가 앖다
	}
}
