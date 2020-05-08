class Ex13{
	public static void main(String[] args){

	// 2시간 40분 30초는 몇 초인지 구하시오.

	int h = 2;
	int m = 40;
	int s = 30;
	int time = 0;

	time = (3600 * h) + (60 * m) + s;

	System.out.println(h + "시간 " + m + "분 " + s + "초는 " + time + "초이다.");
	}
}
