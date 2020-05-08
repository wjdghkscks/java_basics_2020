class Ex09{
	public static void main(String[] args){

	// 산술연산자: + , - , * , / , %
	// char, 정수형, 실수형 사용 가능
	
		int s1 = 9;
		int s2 = 4;
		int res = 0;	// res는 답을 저장하는 공간으로, 초기값 0을 지정
		
		res = s1 + s2;
		System.out.println("결과 : " + res);

		res = s1 - s2;
		System.out.println("결과 : " + res);

		res = s1 * s2;
		System.out.println("결과 : " + res);

	// 정수형으로 만들어서 몫만 나오는 방법
		
		res = s1 / s2;
		System.out.println("결과 : " + res);

	// 실수형으로 만들어서 실수값이 나오는 방법
		
		double result1 = s1 / s2;
		System.out.println("결과 : " + result1);	// 정수 / 정수 = 정수 . 즉, 실수값이 정확하게 나오지 않음.

		double result2 = (double)(s1) / s2;
		System.out.println("결과 : " + result2);

		res = s1 % s2;
		System.out.println("결과 : " + res);
	}
}
