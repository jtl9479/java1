package ex0526.card;

import java.util.Scanner;

public class Deck {
	// 메소드

	static Scanner scan = new Scanner(System.in);

	// 변수 받아오기 ->카드 52장의 저장주소 만들기
	// String 값 설정
	// 1개 입력받아 출력하기 ,5장 출력하기 52개 출력하기 7장 2번출력하기, 섞기,

	Card[] c = new Card[52]; // 주소 52개 생성

	String[] kind = { "스페이드", "다이아", "클로버", "하트" };
	String[] number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	Deck() {
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < number.length; j++) {
				c[13 * i + j] = new Card(kind[i], number[j]);
			}
		}
	}// 기본 생성자에서 값을 넣는다. 시작하면 바로 실행되게
		// 안그러면 일일히 값을 넣어주면서 시작해야한다.

	// 메인
	void print_main() {
		System.out.println("=====================");
		System.out.println("카드 뽑기");
		System.out.println("1.1장 뽑기");
		System.out.println("2.5장 뽑기");
		System.out.println("3.52장 뽑기");
		System.out.println("4.7장 2번 뽑기");
		System.out.println("5.섞기");
		System.out.println("0.프로그램 종료");
		System.out.println("원하는 번호를 선택하세요");
		System.out.println("=====================");
	}
	// 메인

	// 1장을 입력받아 출력하기
	void print_1card() {
		System.out.println("원하는 숫자를 입력해주세요");
		int num = scan.nextInt();
		if (num < 52 && num > 0) {
			System.out.println(c[num].getKind()+ c[num].getNumber());
		} else {
			System.out.println("숫자를 잘못입력하셨습니다");
		}
	}
	//1장뽑기
	
	//5장뽑기
	void print_5card() {
		//for문 사용
		int count =0;
		for(int i=0; i<c.length; i++) {
			if(count != 5) {
			System.out.println(c[i].getKind()+ c[i].getNumber());
			count++;
			}
			else {
				break;
			}
		}
	}
	//5장뽑기
	
	//52장뽑기
	void print_52card() {
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].getKind()+c[i].getNumber());
		}
	}
	//52장뽑기
	
	
	
	void print_7card() {
		int count=0;
		int i ;
		System.out.println("나의 카드");
		for(i=0; i<14; i++) {
			if(count <7) {
			System.out.println(c[i].getKind()+c[i].getNumber());
			count++;
			}
		}
		System.out.println("컴퓨터의 카드");
		for(i=7; i<14; i++) {
			System.out.println(c[i].getKind()+c[i].getNumber());
		}
		
	}
	
	
	//섞기
	void random() {
		
		 for(int i=0; i<100; i++) {
			 int random = (int)(Math.random()*52);
			 	Card temp = c[0];
			 	c[0] = c[random];
			 	c[random] = temp;
		 }
	}
//섞기	
}// class
