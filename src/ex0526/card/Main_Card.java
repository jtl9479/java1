package ex0526.card;

import java.util.Scanner;

public class Main_Card {

	//메인
	//1장 입력받기 . 5장 출력하기, 52장 출력하기, 섞기 ,7장씩 2번 출력하기
	//프로 그램 종료
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//메소드를 사용하기 위해 메소드 객체 선언
		Deck d = new Deck();
		
		
		loop : while(true) {
			
			d.print_main();
			int number = scan.nextInt();
			
			switch (number) {
			
			case 1://1장뽑기
				d.print_1card();
				break;
			
			case 2:
				d.print_5card();
				break;
			case 3:
				d.print_52card();
				break;
			case 4:
				d.print_7card();
				break;
			case 5:
				d.random();
				break;
			case 0:
				System.out.println("프로그램 종료합니다");
				break loop;

			default:
				System.out.println("잘못입력했습니다");
				break;
			}//switch
			
			
		}//while
			
	}//main
}//class
