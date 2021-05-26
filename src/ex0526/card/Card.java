package ex0526.card;

public class Card {

	//변수선언
	//변수 종류 2가지 kind ,number String으로 받는다.
	private String kind;
	private String number;
	
	Card(){
		this("스페이드","1");
	}//기본 생성자
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	Card(String kind, String number){
		this.kind = kind;
		this.number = number;
	}


}
