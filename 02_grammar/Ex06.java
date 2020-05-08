class Ex06{
	public static void main(String[] args){

	
	// 숫자들의 크기에 다른 저장 원리
	// byte < short < char < int < long < float < double

	// 1. 자동형변환, 프로모션:  자기보다 큰 자료형으로는 자유롭게 저장할 수 있음
		
		int s1 = 'A';
		System.out.println(s1);

		long s2 = 241;
		System.out.println(s2);

		float s3 = s2;
		System.out.println(s3);

		double s4 = s3;
		System.out.println(s4);
		
	// 자기보다 작은 자료형으로 저장할 때는 오류가 발생함

	// 2. 강제 형변환, 디모션, casting: 강제로 자료형을 변경하여 오류를 방지
	// 				    강제 형변환을 하면 데이터가 변경될 수도 있음
	// 강제로 형변환하는 방법: = 을 기준으로 무조건 왼쪽 자료형에 맞춰야 함
	//			  자료형 이름 = (왼쪽자료형)(데이터);

		byte b1 = (byte)(129);
		System.out.println(b1);

		int b2 = 110;
		byte b3 = (byte)(b2);
		System.out.println(b3);

		float b4 = (float)(34.125);
		System.out.println(b4);


		int b5 = (int)(87.12);
		System.out.println(b5);

	// 3. char 형변환

		char c1 = 'a' + 2;
		System.out.println(c1);

		char c2 = 97 + 2;
		System.out.println(c2);

		int b6 = c2;
		System.out.println(b6);
	}
}
