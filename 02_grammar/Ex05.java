class Ex05{
	public static void main(String[] args){

	// �Ǽ�: �Ҽ����� ����
	// float < double
	// �Ǽ��� �⺻�� double

	// float�� ���� �ڿ� �ݵ�� F�� f �� �ٿ��� �� (���� �� double�� �ν��Ͽ� ���� �߻��� �� ����)
	// 24�� ���� float�� �Ǽ�
		float su1 = 24;
		System.out.println(su1);

	// �Ǽ� 31.4 �ڿ� F�� f�� �ٿ��� ���� �߻� X
		float su2 = 31.4F;
		System.out.println(su2);

	// char c1 �� float �� ������ �� ����
		char c1 = 97;
		System.out.println(c1);

		float su3 = c1;
		System.out.println(su3);


	// double�� byte, short, char, int, long, float ��� �޾Ƽ� ������ �� ����
		double su4 = 3.14;
		System.out.println(su4);

		double su5 = su3;		// su3 �� float
		System.out.println(su5);


		double su6 = c1;		// c1 �� char
		System.out.println(su6);

	}
}