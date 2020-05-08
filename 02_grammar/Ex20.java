
public class Ex20 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자: 삼항 연산자가 중첩된 것\
		// char k1 의 대문자/소문자/기타문자 판별
		char k1 = 'p';
		String res1 = ((k1>='A')&&(k1<='Z')) ? "대문자" : (((k1>='a')&&(k1<='z'))?"소문자":"기타문자");
		System.out.println("결과 : " + res1);
		
		// int k2 가 90 이상이면 A학점, 80 이상이면 B학점, 나머지는 F학점
		int k2 = 94;
		String res2 = (k2 >= 90) ? "A학점" : ((k2 >= 80) ? "B학점" : "F학점");
		System.out.println("결과 : " + res2);
		
		// int k3 가 1 또는 3 이면 남자, 2 또는 4 면 여자, 나머지는 외국인
		int k3 = 1;
		String res3 = (k3==1 || k3==3) ? "남자" : ((k3 == 2 || k3 == 4) ? "여자" : "외국인");
		System.out.println("결과 : " + res3);

		// int k4 가 1 또는 3 이면 남자, 2 또는 4 면 여자, 나머지는 외국인
		// 1 또는 2 이면 1900년대생, 3 또는 4이면 2000년대생
		int k4 = 1;
		String res4 = (k4==1 || k4==3) ? ((k4==1)?"1900년대생 남자":"2000년대생 남자") : ((k4 == 2 || k4 == 4)?((k4==2)?"1900년대생 여자":"2000년대생 여자"):"외국인");
		System.out.println("결과 : " + res4);
		
		System.out.println("=============");
		
	}
}
