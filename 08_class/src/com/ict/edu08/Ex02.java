package com.ict.edu08;

public class Ex02 {
	public static void main(String[] args) {

		// 객체 생성 없이 호출 가능 		>>> interface 내 데이터는 static
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.SU3);
		System.out.println(Ex01.SU4);

		// 값 변경 불가능					>>> interface 내 데이터는 final
		// System.out.println(Ex01.su1++);
		// System.out.println(Ex01.su2++);
		// System.out.println(Ex01.SU3++);
		// System.out.println(Ex01.SU4++);

	}
}
