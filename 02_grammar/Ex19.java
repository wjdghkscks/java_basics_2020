
public class Ex19 {
	public static void main(String[] args) {
		// 삼항연산자 예제들
		// int k1 이 홀수인지 짝수인지 판별하시오.
		int k1 = 18;
		String res1 = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("결과 : " + res1);
		
		// int k2가 60 이상이면 합격, 아니면 불합격. 판별하시오.
		int k2 = 59;
		String res2 = (k2 >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + res2);
				
		//  char k3 이 대문자인지, 대문자가 아닌지 판별하시오.
		char k3 = 'h';
		String res3 = ((k3 >= 'A') && (k3 <= 'Z')) ? "대문자" : "대문자가 아님";
		System.out.println("결과 : " + res3);
		
		// 근무시간이 8시간까지는 시간당 8590원이고, 8시간을 초과한 시간만큼은 1.5배를 지급한다.
		// 현재 근무한 시간이 10시간이다. 총 얼마를 받아야 하는가?
		int time = 10;
		int dan = 8590;
		int pay = (time > 8) ? (int)((8*dan) + (time-8)*dan*1.5) : (time*dan);
		System.out.println("결과 : " + pay + "원");
	}
}
