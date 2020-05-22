package test;

import java.util.Calendar;

public class test01 {	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.print(now.get(Calendar.YEAR) + "년 ");
		System.out.print(now.get((int)(Calendar.MONTH)) + 1 + "월 ");
		System.out.print(now.get(Calendar.DATE) + "일 ");
		
		int res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 0:System.out.print("일요일 "); break;
		case 1:System.out.print("월요일 "); break;
		case 2:System.out.print("화요일 "); break;
		case 3:System.out.print("수요일 "); break;
		case 4:System.out.print("목요일 "); break;
		case 5:System.out.print("금요일 "); break;
		case 6:System.out.print("토요일 "); break;
		}
		
		System.out.print(now.get(Calendar.HOUR_OF_DAY) + "시 ");
		System.out.print(now.get(Calendar.MINUTE) + "분 ");
		
		System.out.println();
		
	}
}	


/*
1-1. 자바에서 사용하는 기본자료형를 쓰시오

- 논리형: boolean
- 문자형: char
- 정수형: byte, short, int, long
- 실수형: float, double


1-2. 정수값 10을 su라는 변수에 넣고 변수 su에 데이터가 들어갔는지 확인하는 자바 형식을 쓰시오.

package test;

public class test01 {	
	public static void main(String[] args) {
		
		int su = 10;
		System.out.println(su);
		
	}
}	


1-3. a++ 과 ++a 의 차이점을 쓰시오.

++a는 해당 라인에 진입한 시점에 증감 연산을 시행하지만,
a++는 해당 라인이 끝난 이후 다음 라인에 진입할 때 증감 연산을 시행한다.


1-4. 논리연산자 AND와 OR에 대해서 쓰시오.

AND는 두 조건을 동시에 만족할 때만 참인 경우이며, && 으로 표기한다.
OR은 두 조건 중 하나만 만족해도 참인 경우이며, || 으로 표기한다.



1-5. int su = 24 일때 삼항연산자를 활용해서 홀수인지,짝수인지 판별할 수 있는 코딩을 쓰시오.

package test;

public class test01 {	
	public static void main(String[] args) {
		
		int su = 24;
		String res = (su % 2 == 0) ? "짝수" : "홀수";
		System.out.println(res);
		
	}
}	


------------------------------------------------------------------
2-1. Random 클래스를 활용해서 정수 1-10 사이의 난 수를 구하시오.

package test;

import java.util.Random;

public class test01 {	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println(ran.nextInt(11));
		
	}
}	


2-2. Math클래스에서 올림, 반올림, 버림을 실행하는 각 각 메소드를 쓰시오.

올림: Math.ceil();

반올림: Math.round();

버림: Math.floor();



2-3. String 클래스에서 substring()에 대해서 쓰시오.

substring() 은 문자열 중 일부를 추출할 때 사용되는 메소드이며, 반환형은 String 이다.
substring(int beginindex) 는 beginindex에 해당되는 주소값부터 끝까지 문자열을 추출한다.
substring(int beginindex, int endindex) 는 beginindex에 해당되는 주소값부터 endindex 직전 주소값까지 문자열을 추출한다.


2-4. String 클래스에서 valueOf()에 대해서 쓰시오.

valueOf() 는 인자로 어떤 값이 들어오던지 자료형을 String으로 변환시켜주는 메소드이다.


2-5. 제네닉과 컬렉션에 대해서 쓰시오.


------------------------------------------------------------------
3-1. 클래스는 무엇들로 이루어 졌는가? (3가지 쓰시오)

멤버 필드, 생성자, 멤버 메소드




3-2. 클래스를 객체로 생성할 때 초기화를 목적으로 반드시 호출하는 것을 무엇인가?

생성자


3-3. 어떤 클래스에서 같은 이름의 메소드가 여러개 존재하는 것으로 반드시 매개변수는 달라야 하는것을 무엇이라 하는가?

오버로딩


3-4. 상속관계에서 부모클래스의 메소드를 자식클래스가 가져와서 자식클래스 상황에 맞게 변경하는 것을 무엇이라 하는가?

오버라이딩


3-5. 추상클래스와 인터페이스에 대해서 쓰시오

추상 클래스는 실행 내용이 없는 추상 메소드를 포함하고 있는 메소드를 말하며, 반드시 abstract를 이름 앞에 붙여야만 한다.

인터페이스는 서비스를 제공하는 목록을 말하며, 상수와 추상 메소드로만 구성된다.


------------------------------------------------------------------
4. 근무시간이 8시간까지는 시간당 8590이고 
 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
현재 근무한 시간이 10이다. 
얼마를 받아야 하는가? ( IF~else을 사용하시오)

package test;

public class test01 {	
	public static void main(String[] args) {
		
		// time: 노동시간
		// pay: 시급
		// overpay: 초과근무시 적용되는 시급
		// sum: 최종 수령액
		
		int time = 10;
		int pay = 8590;
		int overpay = (int)(((pay * 1.5 * (time - 8)) * 10) / 10.0);
		int sum = 0;
		
		if (time > 8) {
			sum = (pay * 8) + overpay;
		} else {
			sum = time * pay;
		}
		
		System.out.println(sum);
		
	}
}	


------------------------------------------------------------------
5. 5명의 이름, 국어, 영어, 수학을 입력받아서 
이름, 총점, 평균, 학점, 순위를 구하고 정렬하자

(순위와 정렬은  main에서 구함 )
main()함수를 가지고 있는 클래스 : Sungjuk
정보를 가지고 있는 클래스 : Person
public class Person{
    private String name ;
    private int sum ;
    private double avg ;
    private String hak ;
    private int rank = 1 ;

    나머지는 채우세요
}


package test;

public class Person {

    private String name ;
    private int sum ;
    private double avg ;
    private String hak ;
    private int rank = 1 ;

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	// 총점
	public int s_sum(int kor, int eng, int math) {
		
		return sum = kor + eng + math;
		
	}
    
	// 평균
	public double s_avg() {
		
		return avg = (int)(sum / 3.0 * 10)/10.0;
		
	}
			
	// 학점
	public String s_hak() {
		
		if (avg >= 90) {
			return hak = "A 학점";
		} else if (avg >= 80) {
			return hak = "B 학점";
		} else if (avg >= 70) {
			return hak = "C 학점";
		} else {
			return hak = "F 학점";
		}
		
	}
}

------------------------------------------------------------------
package test;

import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person[] arr = new Person[5];
		
		// 정보 입력 받기
		for (int i = 0; i < arr.length; i++) {
			
			Person student = new Person();
			
			System.out.print("이름 : ");
			student.setName(sc.next());
			System.out.print("국어 성적: ");
			int kor = sc.nextInt();
			System.out.print("영어 성적: ");
			int eng = sc.nextInt();
			System.out.print("수학 성적: ");
			int math = sc.nextInt();
			
			int sum = student.s_sum(kor, eng, math);
			student.setSum(sum);
			
			double avg = student.s_avg();
			student.setAvg(avg);
			
			String hak = student.s_hak();
			student.setHak(hak);
			
			arr[i] = student;
			
			System.out.println("----------------");
			
		}
		
		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		// 정렬하기
		Person tmp = new Person(); 
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력하기
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		System.out.println("========================================");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.print(arr[i].getRank() + "\t");
			System.out.println();
			
			}
	}
}


------------------------------------------------------------------
6. Calendar를 활용해서 오늘날짜, 시간, 분, 요일을 구하시오

package test;

import java.util.Calendar;

public class test01 {	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.print(now.get(Calendar.YEAR) + "년 ");
		System.out.print(now.get((int)(Calendar.MONTH)) + 1 + "월 ");
		System.out.print(now.get(Calendar.DATE) + "일 ");
		
		int res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 0:System.out.print("일요일 "); break;
		case 1:System.out.print("월요일 "); break;
		case 2:System.out.print("화요일 "); break;
		case 3:System.out.print("수요일 "); break;
		case 4:System.out.print("목요일 "); break;
		case 5:System.out.print("금요일 "); break;
		case 6:System.out.print("토요일 "); break;
		}
		
		System.out.print(now.get(Calendar.HOUR_OF_DAY) + "시 ");
		System.out.print(now.get(Calendar.MINUTE) + "분 ");
		
		System.out.println();
		
	}
}	
*/