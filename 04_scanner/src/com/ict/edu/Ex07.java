package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		// 자판기 만들기

		// 입금액
		// 메뉴 1.커피음료(3.5) 2.이온음료(2.5) 3.물(1.5) 4.과일주스(4.0)
		// 메뉴를 선택하세요. (단, 부가세 포함)
		//
		// 선택한 음료:
		// 입금액:
		// 잔돈:

		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			//정보 입력
			System.out.print("돈을 넣어주세요. ");
			int input = sc.nextInt();

			System.out.print("메뉴를 선택하세요.\n1. 커피음료(3500)\n2. 이온음료(2500)\n3. 물(1500)\n4. 과일주스(4000) ");
			int menu = sc.nextInt();

			// 정보 가공
			int price = 0;
			String name = "";

			if (menu == 1) {
				name = "커피음료";
				price = 3500;
			} else if (menu == 2) {
				name = "이온음료";
				price = 2500;
			} else if (menu == 3) {
				name = "물";
				price = 1500;
			} else if (menu == 4) {
				name = "과일주스";
				price = 4000;
			}

			int vat = (int) (0.1 * price);
			int all = price + vat;
			int change = input - all;

			// 정보 출력
			System.out.println("---------------------------");
			System.out.println("선택한 음료 : " + name);
			System.out.println("입금액 : " + input);
			System.out.println("잔돈 : " + change);
			
			// 반복문
			while (true) {
				System.out.print("\n결재하시겠습니까? (1.yes 2.no) ");
				int k1 = sc.nextInt();
				if (k1 == 2) {
					System.out.println();
					continue esc;
				} else if (k1 == 1) {
					break esc;
				} else {
					System.out.print("\n잘못 입력하셨습니다.\n");
					continue;
				}
			}
		}
		System.out.println("\n음료가 나왔습니다.");
	}
}
