class Ex11{
	public static void main(String[] args){

	// �̸��� ȫ�浿�� ����� ����
	// ���� 90, ���� 80, ���� 80
	// ������ ����� ���Ͻÿ�.
	// ����� �̸�, ����, ��ո� ��� (��, ����� �Ҽ��� ù���ڸ����� ����)

	// 1. ������ ����

		String name = "ȫ�浿";
		int kor = 90;
		int eng = 80;
		int math = 80;

	// 2. ������ ó�� (����Ͻ� ����) : ����� ������ Ȱ���Ͽ� ���ϴ� ������ ����

		int sum = kor + eng + math;
		double avg = sum / 3.0;			// double avg = (int)(sum / 3.0 * 10) / 10.0 

		int avg2 = (int)(avg * 10);
		double avg3 = avg2 / 10.0;

		System.out.println("�̸� : " + name);		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg3);
		



	// ī���ī�� 6,500���̴�. ģ���� ���̼� 15,000���� ���� �ֹ��ߴ�.
	// �ܵ��� �� ���Ҵ��� ���Ͻÿ�. (��, �ΰ��� 10% �����ؼ� ����Ͻÿ�.)

		String coff = "ī���ī";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		int total = dan * su;
		int vat = (int)(total * 0.1);
		int output = input - (total + vat);

		System.out.println("�ܵ� : " + output);


	}
}