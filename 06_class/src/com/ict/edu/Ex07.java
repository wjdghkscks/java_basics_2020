package com.ict.edu;

public class Ex07 {

	private String name = "커피우유";	// 전역변수
	private int su = 100;				// 전역변수
	private int price = 1100;			// 전역변수
	
	// 자동 생성: source > Generate Getter and Setter > Select All > Generate
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
										// 전역변수와 지역변수의 이름이 같을때
		this.name = name;				// 전역변수에 this.를 붙여 구분
	}									// 	(만약 전역변수와 지역변수의 이름이 같은 경우엔)
	public int getSu() {				// 	(무조건 우선순위는 지역변수이므로)
										// 	(지역변수만 사용하게 됨)
		return su;						// 지역변수는 해당 메소드를 호출할 때 생성됨
	}									
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
