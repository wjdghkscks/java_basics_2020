package com.ict.edu01;

enum Type2 {
	
	// 상수("연결할 문자")
	WALK("워킹화", 270),
	RUN("러닝화", 250),
	TRACK("트래킹화", 260),
	HIK("등산화", 240);
	
	final private String name;
	final private int size;
	
	// 생성자 역할
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	// 문자를 받아오는 함수 (getter)
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		
		for (Type2 k : Type2.values()) {
			System.out.println(k.name() + ": " + k.getName() + " (" + k.getSize() + ")");
		}
		
	}	
}
