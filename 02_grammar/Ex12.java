class Ex12{
	public static void main(String[] args){

	// 3989 �ʴ� ��ð�, ���, �������� ���Ͻÿ�.

	int time = 3989;
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0;	// res �� �������� �ǹ���.

	h = time / 3600;

	res = time % 3600;

	m = res / 60;
	
	s = res % 60;

	System.out.println(time + "�ʴ� " + h + "�ð� " + m + "�� " + s + "�� �̴�." );

	}
}