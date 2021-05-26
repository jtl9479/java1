package singleton;

import java.text.SimpleDateFormat;
import java.util.*;

public class ex0525_singleton {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM//dd hh:mm:ss");
		//Calendar cal = new Calendar(); --> 원래 이렇게 되야한다.
		Calendar cal = Calendar.getInstance(); //-->singleton과 객체를 공유한다.
		String today3 =sdf3.format(cal.getTime());
		//변수에 바로 접근할수 없기 떄문에 getTime을 사용한다
		System.out.println("Calender 객체 시간: " + today3);
		//-->객체가 1개 공통적인것은 이런방식으로 만든다 Calendar
		
		
		Date time = new Date(); //날짜 가져오기
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today = sdf1.format(time);
		System.out.println("Date 객체 시간 : " + today);
		//-> 각각 객체가 다르다 각기 다른 시간을 줘야할때는 date
		
		Date time2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today2 = sdf2.format(time2);
		System.out.println("Date 객체2 시간 : " + today2 );
		//-> 각각 객체가 다르다
	
		
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		//Singleton s = new Singleton(); 
		//객체 생성은 생성자를 이야기한다.
		//생성자에 private를 사용하면 객체 생성이 불가능하다
		
		s.setName("홍길동");
		
		System.out.println(s);//주소가 같다
		System.out.println(s1);//주소가 같다
		
		System.out.println("학번 : " + s.getStu_num());
		System.out.println("이름 : " + s.getName());
	}
}
