class Ex14{
	public static void main(String[] args){

	// �� ������: > , < , >= , <= , == , !=
	// �� �����ڸ� ����� �� �ִ� �ڷ���: char��, ������, �Ǽ���
	// ���� ����� ������ boolean�� (true/false) ���� ����� �� ���ǽĿ��� ���

		int su1 = 90;
		int su2 = 80;

		char su3 = 'a';
		char su4 = 'A';

		double su5 = 97.0;
		double su6 = 78.0;

		boolean result = su1 > su2;			// ������ �� ���� �ϸ� ��
		System.out.println("��� : " + result);

		result = su3 > su4;
		System.out.println("��� : " + result);

		result = su5 > su6;
		System.out.println("��� : " + result);

		result = su1 > su3;				// char�� ���� �� ������ ����ǹǷ� �� ������ ������
		System.out.println("��� : " + result);

		result = su1 > su5;				// ������ �Ǽ��� ���������� �� ������ ������
		System.out.println("��� : " + result);

		result = su3 == su5;				// char��, ������, �Ǽ��� ������� �� ������ ����.
		System.out.println("��� : " + result);

	}
}