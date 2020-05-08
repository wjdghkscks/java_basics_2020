class Ex15{
	public static void main(String[] args){

	// 논리 연산자: &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정))
	// 논리 연산자의 대상(들어오는 정보): boolean형, 비교연산, 논리연산
	// 논리 연산의 결과는 boolean형으로 도출. 즉, 조건식에서 사용.

	// && (AND, 논리곱): 주어진 조건이 모두 true일 때만 결과가 true
	//		     주어진 조건들 중 false를 만나면 결과는 false
	//		     false를 만나면 이후 조건들의 연산은 하지 않음.
	//		     'a >= 10 && a <= 20' 는 '10 <= a <= 20' 라는 범위를 의미

		int su1 = 10;
		int su2 = 7;
		boolean result = false;	// result를 초기화

		result = (su1 >= 7) && (su2 >= 5);	// true = true && true
		System.out.println("결과 : " + result);

		result = (su1 >= 7) && (su2 <= 5); 	// false = true && false
		System.out.println("결과 : " + result);

		result = (su1 <= 7) && (su2 >= 5);	// false = false && true
		System.out.println("결과 : " + result);

		result = (su1 <= 7) && (su2 <= 5);	// false = false && false
		System.out.println("결과 : " + result);

	 	System.out.println("========================================");

		result = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));

		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);

	 	System.out.println("========================================");

		// AND 는 false 인 조건을 만나면 결과는 false 가 되고, 이후 조건은 연산하지 않음.
		result = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));

		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);

	 	System.out.println("========================================");

		su1 = 34;

		result = (su1 >= 20) && (su1 <= 30);		// 20 ≤ su1 ≤ 30 인가?  
		System.out.println("결과 : " + result);

	 	System.out.println("========================================");

		// char c1 은 소문자인가?
		
		char c1 = 'G';

		result = (c1 >= 97) && (c1 <= 122);
		System.out.println("결과 : " + result);

		result = (c1 >= 'a') && (c1 <= 'z');		// char 는 숫자로 저장되므로 다음과 같이 사용 가능
		System.out.println("결과 : " + result);
	}
}
