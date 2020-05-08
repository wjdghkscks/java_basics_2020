class Ex12{
	public static void main(String[] args){

	// 3989 초는 몇시간, 몇분, 몇초인지 구하시오.

	int time = 3989;
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0;	// res 는 나머지를 의미함.

	h = time / 3600;

	res = time % 3600;

	m = res / 60;
	
	s = res % 60;

	System.out.println(time+"초는 "+h+"시간 "+m+"분 "+s+"초 이다." );
	}
}
