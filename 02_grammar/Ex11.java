class Ex11{
	public static void main(String[] args){

	// 이름이 홍길동인 사람의 점수
	// 국어 90, 영어 80, 수학 80
	// 총점과 평균을 구하시오.
	// 출력은 이름, 총점, 평균만 출력 (단, 평균은 소수점 첫쩨자리까지 구함)

	// 1. 데이터 저장

		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;

	// 2. 데이터 처리 (비즈니스 로직) : 저장된 정보를 활용하여 원하는 정보를 구함

		int sum = kor + eng + math;
		double avg = sum / 3.0;			// double avg = (int)(sum / 3.0 * 10) / 10.0 

		int avg2 = (int)(avg * 10);
		double avg3 = avg2 / 10.0;

		System.out.println("이름 : " + name);		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg3);
		



	// 카페모카가 6,500원이다. 친구와 둘이서 15,000원을 내고 주문했다.
	// 잔돈은 얼마 남았는지 구하시오. (단, 부가세 10% 포함해서 계산하시오.)

		String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		int total = dan * su;
		int vat = (int)(total * 0.1);
		int output = input - (total + vat);

		System.out.println("잔돈 : " + output);
	}
}
