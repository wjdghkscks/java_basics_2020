class Ex14{
	public static void main(String[] args){

	// 비교 연산자: > , < , >= , <= , == , !=
	// 비교 연산자를 사용할 수 있는 자료형: char형, 정수형, 실수형
	// 연산 결과는 무조건 boolean형 (true/false) 으로 도출됨 → 조건식에서 사용

		int su1 = 90;
		int su2 = 80;

		char su3 = 'a';
		char su4 = 'A';

		double su5 = 97.0;
		double su6 = 78.0;

		boolean result = su1 > su2;			// 선언은 한 번만 하면 됨
		System.out.println("결과 : " + result);

		result = su3 > su4;
		System.out.println("결과 : " + result);

		result = su5 > su6;
		System.out.println("결과 : " + result);

		result = su1 > su3;				// char는 저장 시 정수로 저장되므로 비교 연산이 가능함
		System.out.println("결과 : " + result);

		result = su1 > su5;				// 정수와 실수의 연산이지만 비교 연산은 가능함
		System.out.println("결과 : " + result);

		result = su3 == su5;				// char형, 정수형, 실수형 상관없이 비교 연산은 가능.
		System.out.println("결과 : " + result);

	}
}