class Ex07{
	public static void main(String[] args){

	// ���� ���꿡 ���� �ڷ��� ��ȯ
	// ���� �� ������ ū �ڷ������� �����
	// ����) byte, short �� ������ �ϸ� ������ int �̻��� �ڷ������� �����

		byte su1 = 20; 
		short su2 = 25;
		int su3 = 30;
		long su4 = 35;

		float su5 = 34.1f;
		double su6 = 247.12;

	// byte (short) + byte = int

		int res1 = su1 + su1;
		System.out.println(res1);

	// byte (short) + short = int

		int res2 = su1 + su2;
		System.out.println(res2);

	// byte (short) + int = int

		int res3 = su1 + su3;
		System.out.println(res3);

	// byte (short) + long = long

		long res4 = su1 + su4;
		System.out.println(res4);

	// byte (short) + float = float

		float res5 = su1 + su5;
		System.out.println(res5);

	// byte (short) + double = double

	// int + int = int
	// int + long = long
	// int + float = float
	// int + double = double

	// long + long = long
	// long + float = float
	// long + double = double

	// float + float = float
	// float + double = double

	// double + double = double

// ==================================================================================================

	// �Ҽ��� ù°�ڸ����� ���ϱ�

		double num1 = 83.5555;
		int num2 = (int)(num1 * 10);	// double �� int�� ����� ���Ͽ� ���� ����ȯ (����, casting)
		double num3 = num2 / 10.0;	// int �� double�� ���Ǿ�� double�� �����Ƿ�, 10.0���� ����� ��
		System.out.println(num3);

	// ���� �ڸ� �����ϱ�

		int num4 = 12758;
		int num5 = num4 / 10;
		int num6 = num5 * 10;
		System.out.println(num6);


	}
}