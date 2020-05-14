package com.ict.test;

import com.ict.edu.Ex05;					//	import

public class Ex05_main {
	public static void main(String[] args) {
		
		System.out.println(Ex05.k1);		// 	패키지가 다르더라도 
	//	System.out.println(Ex05.k2);			public은 사용 가능
	//	System.out.println(Ex05.k3);		
	//	System.out.println(Ex05.k4);		
		
		Ex05 e5 = new Ex05();
		
		System.out.println(e5.s1);			
	//	System.out.println(e5.s2);			>>	패키지가 다르기 때문에
	//	System.out.println(e5.s3);				public을 제외하고 모두 오류 발생
	//	System.out.println(e5.s4);					
		
	}
}
