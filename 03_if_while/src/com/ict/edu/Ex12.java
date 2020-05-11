package com.ict.edu;

public class Ex12 {
	public static void main(String[] args) {
		
	// break label 과 continue label
	// break label: 레이블이 지정한 블록을 탈출
	// continue label: 레이블이 지정한 블록 수행문을 포기하고 다음 회차를 진행 
	// label 지정 방법: 레이블이름:
	// 					레이블의 뒤에는 반복문만 올 수 있음
	// 
		
	// 1 ~ 10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	// i 가 6일 때 break 사용하기
		for (int i = 1; i < 11; i++) {
			if(i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();

	// i 가 6일 때 break label 사용하기
		esc:for (int i = 1; i < 11; i++) {		// 레이블 이름 지정
				if(i == 6) break esc;			// break 시 레이블 이름을 붙여 사용
				System.out.print(i + " ");
			}
		System.out.println();
		
	// for문이 하나일 때는 break와 break label이 같은 결과를 낸다.
	// 따라서 for문이 하나일 때는 break label을 사용할 필요가 없다. (continue문도 마찬가지)
	
	// i 가 6일 때 continue 사용하기
		for (int i = 1; i < 11; i++) {
			if(i == 6) continue;
				System.out.print(i + " ");
			}
		System.out.println(); 
	
	// i 가 6일 때 continue label 사용하기
		esc2: for (int i = 1; i < 11; i++) {
				if(i == 6) continue esc2;
				System.out.print(i + " ");
			}
		System.out.println();
		
		System.out.println("====================================");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + " , j = " + j);
			}
		}
		
		System.out.println("====================================");
		
	// j = 3일 때 break 사용하기
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 3) break;
				System.out.println("i = " + i + " , j = " + j);
			}
		}
		
		System.out.println("====================================");

	// j = 3일 때 break label 사용하기
		esc3:for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 3) break esc3;
				System.out.println("i = " + i + " , j = " + j);
			}
		}

		System.out.println("====================================");
		
		// j = 3일 때 continue 사용하기
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j == 3) continue;
					System.out.println("i = " + i + " , j = " + j);
				}
			}
			
		System.out.println("====================================");
	
		// j = 3일 때 continue label 사용하기
			esc4:for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if(j == 3) continue esc4;
					System.out.println("i = " + i + " , j = " + j);
				}
			}	
		
	}
}
