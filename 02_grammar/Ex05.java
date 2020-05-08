class Ex05{
	public static void main(String[] args){

	// 실수: 소수점이 있음
	// float < double
	// 실수의 기본은 double

	// float는 숫자 뒤에 반드시 F나 f 를 붙여야 함 (생략 시 double로 인식하여 오류 발생할 수 있음)
	// 24는 정수 float는 실수
		float su1 = 24;
		System.out.println(su1);

	// 실수 31.4 뒤에 F나 f를 붙여야 오류 발생 X
		float su2 = 31.4F;
		System.out.println(su2);

	// char c1 는 float 에 저장할 수 있음
		char c1 = 97;
		System.out.println(c1);

		float su3 = c1;
		System.out.println(su3);


	// double은 byte, short, char, int, long, float 모두 받아서 저장할 수 있음
		double su4 = 3.14;
		System.out.println(su4);

		double su5 = su3;		// su3 은 float
		System.out.println(su5);


		double su6 = c1;		// c1 은 char
		System.out.println(su6);
	}
}
