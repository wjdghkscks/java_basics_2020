class Ex08{
	public static void main(String[] args){

	// 참조 자료형: 클래스를 자료형으로 사용
	// String 클래스: 문자열을 처리하는 기능을 가지고 있는 클래스
	// 		  자료형처럼 사용하기 위해서는 반드시 " " 를 사용해야 함

		String str = "hello";
		System.out.println(str);

	// String + 연산 : String 에서 + 는 덧셈이 아니라, 문자연결자로서 기능
	//		   + 연산을 하면, 결과는 무조건 String 이다.

		str = "10000";
		int su = 10000;
		System.out.println(str + 10);
		System.out.println(su + 10);		

		int su1 = 20;
		int su2 = 4;
		System.out.println(su1 + su2);
		System.out.println("결과 : " + su1 + su2);	// 앞의 문자열 때문에 숫자 또한 문자로 처리되어 결과값이 도출됨
		int su3 = su1 + su2;				// 숫자가 문자로 처리되지 않기 위하여 앞에서 값을 저장
		System.out.println("결과 : " + su3);
		
		System.out.println("=============");

	}
}
