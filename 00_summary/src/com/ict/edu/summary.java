package com.ict.edu;

/*

[자료형]

- 데이터를 저장하고 출력하는 방법
	1) 선언
	- [자료형] [이름] ;
	- 선언은 처음 한 번만 진행
	2) 데이터 저장
	- [이름] = 데이터;
	3) 출력
	- System.out.print(): 그대로 출력
	- System.out.println(): 출력 후 줄바꿈
	
- 자료형의 종류
1) 논리형: boolean
2) 문자형: char
3) 정수형: byte < short < int < long
4) 실수형: float < double
	 >>> 크기: byte < short < char < int < long <float < double

- 형변환
1) 자동 형변환: 자기보다 크기가 큰 자료형으로 저장
2) 강제 형변환: 강제로 자료형을 변경하여 오류를 방지
		  [자료형] [이름] = ([자료형])([데이터]);
		  
-------------------------------------------------------------------------------------------------------

[연산자]

- 산술 연산자: +  -  *  /  % 
- 증감 연산자: i++  --i
- 비교 연산자: >  <  >=  <=  ==  !=										>>> 무조건 boolean형으로 도출
- 논리 연산자: &&(AND)  ||(OR)  !(NOT)		>							>>> 조건식에서 사용
- 대입 연산자: =  +=  -=  *=  /=  %=
- 삼항 연산자: [자료형] [이름] = [조건식] ? [참인경우] : [거짓인경우]	>>> 중첩하여 사용하기도 함

-------------------------------------------------------------------------------------------------------

[제어문]

- if(조건식) { }
- if(조건식) { } else { }
- if(조건식) { } else if(조건식) { } else { }
- switch(인자값) { case '인자': break; case '인자': break; }
- for(초기식; 조건식; 증감식) { }
- while(조건식) { 실행문장; 증감식; }
- while(true) { if(빠져나갈 조건) break; 조건식이 참일 때 실행 문장; 증감식; }
- do { 실행문; 증감식; } while(조건식);

- break: 현재 위치의 블록을 탈출할 때 사용하는 예약어
- continue: 이하에 있는 수행문을 포기하고, 다음 회차로 진행하는 예약어
- break와 continue는 사용 시 레이블 이름을 지정하여 특정 위치로 이동하는 것이 가능

-------------------------------------------------------------------------------------------------------

[배열]

- 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
- 배열 생성 시 크기를 지정하며, 배열 출력 시 보통 for문을 사용
- 선언( 자료형[] 이름; )	>	생성( 이름 = new 자료형[int] )	>	데이터 저장 ( 이름[int] = 값; )

- 다차원 배열: 배열이 여려 개 모인 것	>>> 자료형[][] 이름;
1) 고정 길이 배열: 1차원 배열 안에 존재하는 배열의 수가 일정한 배열
ex) int[][] count = new int[2][3];
2) 가변 길이 배열: 1차원 배열 안에 존재하는 배열의 수가 일정하지 않은 배열
ex) int[][] ch = {{1, 2}, {3, 4, 5, 6, }, {7, 8, 9}};

-------------------------------------------------------------------------------------------------------

[클래스]

- 객체를 만들기 위한 모든 정보를 가지고 있는 파일
- java.lang 이외의 패키지에 포함된 클래스 사용 시 import 필요 	>>> Ctrl + Space

*** 주요 클래스
1) Scanner 클래스
- Scanner sc = new Scanner(System.in);
- 키보드에서 정보를 입력 받아 처리하는 클래스

2) Random 클래스
- Random ran = new Random();
- (char와 String을 제외한) 각종 자료형을 난수로 발생
- ran.nextInt(int)			>> 0 ~ 범위 전까지의 정수 중에서 난수를 발생
- ran.nextDouble(doulbe)	>> 0 ~ 범위 전까지의 실수 중에서 난수를 발생 

3) Date 클래스
- Date date = new Date();
- 현재 사용하고 있는 컴퓨터의 시간을 기준으로 날짜값을 추출
- date.getYear(), date.getHour(), date.getDay() 등

4) Calendar 클래스
- Calendar now = Calendar.getInstance();
- Date 대신 현재 사용되고 있는 날짜 클래스
- new 예약어를 사용하지 않고 객체를 생성
- now.get(Calendar.YEAR), now.get(Calendar.Hour), now.get(Calendar.DAY_OF_WEEK) 등

-------------------------------------------------------------------------------------------------------

- 클래스의 구조 >>> [접근_제한자] [클래스_종류] class [클래스_이름] {멤버 필드 / 생성자 / 멤버 메소드}


1. 헤더
1) 접근 제한자: 외부에서 접근할 수 있는 권한의 단계
	- public: 누구나 다 접근 가능
	- protected: 같은 패키지 및 상속 관계는 접근 가능
	- default(생략): 같은 패키지 내에 있으면 접근 가능
	- private: 다른 클래스 접근 불가
2) 클래스 종류: 현재 클래스의 종류를 표시하며, final이나 abstract 등 특정 클래스에 해당하는 예약어를 사용
3) class: 클래스임을 나타내는 예약어
4) 클래스 이름: 클래스의 이름을 지정
				첫글자는 대문자, 나머지는 소문자로 작성
				두 단어 이상으로 구성되는 경우 단어의 첫글자는 대문자로 작성
				특수문자 및 공백 사용 X, 첫단어에 숫자 사용 불가
	
				
2. 멤버 필드: 데이터, 속성, 상태값, 특징
- 변수: 언제든지 변경이 가능한 데이터
		보통 소문자로 작성
		두 단어 이상일때는 두번째 단어부터 단어 첫글자를 대문자로 작성 >>> ex. int scoreLine
		
- 상수: 한 번 저장되면 변경할 수 없는 데이터 >>> final
		보통 대문자로 작성
		단어와 단어 사이에 _(underscore) 사용 가능 >>> static int SCORE_LINE
		
		
* 멤버 필드 / 멤버 메소드 공통 사항 *
1) instance
- 인스턴스 필드, 인스턴스 메소드: 객체 생성 시 함께 생성되는 필드 및 메소드
- 일반 클래스의 멤버 필드 및 멤버 메소드는 모두 인스턴스에 해당
- heap 메모리에 생성
- 호출 방법 >>> 객체_참조_변수.멤버_필드 / 객체_참조_변수.멤버_메소드	( ex. language.eng )

2) static
- 객체 생성과 상관없이 미리 생성된 멤버 필드 및 메소드
- static 선언은 반드시 필드 및 메소드 앞에 static이라고 표시를 해야 함
- 객체 생성과 상관없이 언제든지 호출하여 사용 가능 (private 제외)
- static 메모리에 생성
- 호출 방법: 클래스_이름.멤버_필드 / 클래스_이름.멤버_메소드			( ex. Person.name )
		
		
		
3. 멤버 메소드: 동작, 기능
				해당 메소드 호출 시, 메소드 내용을 실행
				메소드는 다른 메소드를 호출할 수 있음
				[접근_제한자] [메소드_종류] [반환형] 메소드_이름(인자, 매개변수) { 실행 내용 }
				
1) 접근 제한자
2) 메소드 종류: static 등 특정 메소드에 해당하는 예약어를 사용
3) 반환형: 해당 메소드를 호출한 위치로 되돌아 갈 때 반환하는 결과의 자료형
		   String, int 등 자료형을 사용하며, 결과를 가져가지 않을 시 void를 사용
4) 메소드 이름: 메소드의 이름을 지정
				소문자로 작성하며, 두 단어 이상일 때는 두번째 단어부터 첫글자를 대문자로 작성
5) 인자: 메소드가 실행될 때 필요한 외부 데이터
		 메소드의 이름이 같더라도, 인자가 다르다면 다른 메소드 >>> 오버로딩

* getter: 호출하는 입장에서 메소드를 이용하여 변수값을 추출할 때 사용하는 메소드
* setter: 호출하는 입장에서 메소드를 이용하여 변수값을 변경할 때 사용하는 메소드
		>>> getter와 setter는 private 클래스의 멤버 필드 데이터에 우회 접근할 때 사용
		
		
4. 생성자: 클래스를 객체로 만들 떄 단 한번 호출되어, 객체 생성 및 객체의 멤버 변수를 초기화
- 목적: 멤버 필드(변수와 상수)의 초기값을 지정
- 형식: 클래스와 생성자의 이름은 동일
- 클래스를 객체로 만드는 방법	>>>		ex) Scanner		sc		 = new Scanner(System.in);
										   [클래스] [참조변수]	   new		[생성자]
- 모든 클래스에는 인자가 없는 기본 생성자가 존재하지만, 보통 생략됨
- 생성자도 오버로딩이 가능하므로, 하나의 클래스 안에 여러 생성자가 존재할 수 있음
	
-------------------------------------------------------------------------------------------------------
		   
** this와 this()
1) this
- 객체 내부에서 객체 자신을 가리키는 예약어
- 지역 변수와 전역 변수(멤버 필드)의 이름이 같은 경우, [this.이름]으로 전역 변수 구분
		 
2) this()
- 객체의 생성자를 지칭하는 예약어로, 생성자에서 다른 생성자를 호출할 때 사용
- 사용하는 경우 반드시 생성자의 첫번째 줄에 위치
- 사용시 무한루프에 빠지지 않게 주의


*** String 클래스와 주요 메소드
01) .charAt() : char						
	>>> 위치 정보가 int값으로 들어오면, 배열에서 해당 위치의 글자를 반환
	
02) .concat() : String									
	>>> 인자로 들어온 문자열과 현재 문자열을 합침
	
03) .equals() : boolean									
	>>> 인자로 들어온 문자열과 현재 문자열이 같은지 boolean으로 판단
	
   .equalsIgnoreCase() : boolean						
	>>> 대소문자 구분은 무시하고 인자로 들어온 문자열과 현재 문자열이 같은지 boolean으로 판단
	
04) .format(String format, String) : static String		
	>>> 형식을 지정하고, 형식에 맞춰 생성
	
05) .getBytes() : byte[] : byte[]			
	>>> 해당 문자열을 byte[]로 변환
	
06) .indexOf(Char/String) : int				
	>>> 해당 문자열에서 인자로 들어온 char/String의 위치값을 알려줌 (없을 경우 -1)
	
    .indexOf(Char/String , int fromIndex)	
   	>>> 시작 위치 'int fromIndex'로부터 char/String의 위치값을 알려줌 (없을 경우 -1)
   	
07) .lastIndexOf(Char/String) : int			
	>>> 인자로 들어온 char/String의 마지막 위치값을 알려줌 (없을 경우 -1)
	
08) .length() : int							
	>>> 해당 문자열의 길이를 구함 (길이는 1부터 시작)
	
09) .replace(A, B) : String					
	>>> B에 들어온 char/String가 A를 치환
	
10) .contains(String) : Boolean
	>>> 인자로 들어온 String이 해당 문자열에 존재하는지를 boolean으로 판단
	
11) .toCharArray() : char[]
	>>> 해당 문자열을 char[]로 만듦
	
12) .isEmpty() : boolean
	>>> 해당 문자열이 비어있는지 boolean으로 판단
	
13) .split(String, int) : String[]
	>>> 해당 문자열을 String 기준으로 int만큼 나눔
	
14) .substring(int) : String
	>>> 해당 문자열의 int 위치부터 끝까지 문자열을 추출
	
15) .toLowerCase() : String
	>>> 해당 문자열의 모든 대문자를 소문자로 변환
	.toUpperCase() : String
	>>> 해당 문자열의 모든 소문자를 대문자로 변환

16) .trim() : String
	>>> 해당 문자열의 앞/뒤 공백을 제거
	
17) .valueOf(자료형) : static String
	>>> 인자로 들어온 자료형을 String으로 변환
	
18) Wrapper class
	- 각종 자료형을 포함한 문자열을 진짜 자료형으로 변경하는 방법
	- 다른 자료형과 달리 char형으로 변경하는 방법은 따로 없으며, charAt()을 대신 사용
	- .boolean.parseInt() , .Integer.parseInt() , .Double.parseInt() 등

19) Math 메소드
	- Math.random() : double
	>>> (Random클래스와 달리) 객체 생성 없이 실수 중에서 난수 호출 가능
	
	- Math.abs(int) : int
	>>> 인자로 들어온 int 값의 절대값을 추출
	
	- Math.ceil(double) : double
	>>> 인자로 들어온 double 값을 올림하여 추출
	
	- Math.round(double) : double
	>>> 인자로 들어온 double 값을 반올림하여 추출
	
	- Math.floor(double) : double
	>>> 인자로 들어온 double 값을 내림하여 추출
	
	- Math.max(a, b) : double
	>>> 인자로 들어온 두 double 값 중 큰 값을 출력
	
	- Math.min(a, b) : double
	>>> 인자로 들어온 두 double 값 중 작은 값을 출력
	
	- Math.pow(a, b) : double
	>>> 인자로 들어온 a 값의 b 제곱 값을 출력

-------------------------------------------------------------------------------------------------------

[상속 관계]

- 서브 클래스가 별도의 객체 생성 없이 수퍼 클래스의 멤버 필드와 멤버 메소드를 사용할 수 있는 클래스 간의 관계
- 자바에서는 다중 상속이 불가능
- 형식: public class [서브_클래스] extends [수퍼_클래스] { 

** super와 super()
1) super
- 부모 클래스의 멤버 필드를 지칭하는 예약어
- 부모 클래스의 멤버 필드와 자식 클래스의 전역 변수의 이름이 같을 때, 구분을 위해 super 사용

2) super(인자)
- 부모 클래스의 생성자를 지칭하는 예약어
- 부모 클래스의 생성자를 호출할 때 사용
	>> super(name, age)
	
** 오버로딩과 오버라이딩
1) 오버로딩
- 하나의 클래스 안에 인자의 자료형이나 갯수가 다른 같은 이름의 메소드가 여러개 존재
- 사용자의 편의성에 따라서 메소드를 다양하게 사용 가능

2) 오버라이딩
- 상속 관계에 있는 두 클래스의 메소드 이름이 같은 것
- 서브 클래스의 메소드는 그 내용을 서브 메소드에 맞게 변경하여 사용
- 캡슐화(은닉화): 수퍼 클래스의 내용이 숨겨짐
- 다형성: 같은 메소드를 호출하더라도 다른 내용을 실행 

-------------------------------------------------------------------------------------------------------

[추상 클래스]

- 실행 내용이 없는 추상 메소드를 가지고 있는 클래스
- 추상 클래스 및 메소드 선언 시, 반드시 abstract 란 예약어를 사용
- 추상 클래스를 상속받은 클래스는 추상 메소드의 실행 내용을 반드시 완성해야 함

-------------------------------------------------------------------------------------------------------

[인터페이스]

- 상수 및 추상 메소드로만 구성되어, 서비스를 제공하는 목록
- class가 아닌 interface 예약어를 사용
- 다중 상속이 가능하며, 인터페이스를 상속받는 클래스는 implements 예약어를 사용
- 상속을 받은 클래스는 반드시 오버라이딩하여 내용을 구현
- 인터페이스는 객체 생성 불가
	>>> class person implements body {

-------------------------------------------------------------------------------------------------------

[enum]

- 상수를 하나의 객체로 인식하여, 여러 상수 객체들을 한 곳에 모아둔 객체
- enum 선언 이후, 그 안에 있는 static final 들은 하나의 객체로 인식됨
	>>> public enum People { 
	
-------------------------------------------------------------------------------------------------------

[내부 클래스]

- 클래스 안에 다른 클래스가 정의되어 있는 클래스

1. Member
- 외부 클래스 { 멤버 필드, 생성자, 내부 클래스{ ··· }, 멤버 메소드 }
- 내부 클래스는 외부 클래스의 멤버들을 제약없이 사용 가능
- 상속과 달리 내부 클래스는 private 멤버에 접근 가능
- 단, 내부 클래스의 객체 생성 시 외부 클래스를 통해서만 가능
	>>> Outer.Inner name = out.new inner();

2. Local
- 외부 클래스 { 멤버 필드, 생성자, 외부 메소드(){ 내부 클래스 }, 멤버 메소드 }
- 외부 클래스의 메소드 내에 내부 클래스가 존재
- 따라서 외부 메소드의 지역 변수로 사용
- Local 내부 클래스의 객체 생성 방법
 1) 내부 클래스가 존재하는 메소드를 실행
 2) 내부 클래스와 외부 메소드 사이에 객체 생성	>>> 외부 메소드 실행 시 객체 생성

3. Static
- 외부 클래스 { 멤버 필드, 생성자, static 내부 클래스{ static ··· }, 멤버 메소드 }
- Member와 비슷하지만, static을 붙여서 사용

4. Anonymous
- 정의된 클래스의 이름이 없는 클래스
- 한 번 사용한 이후에는 다시 호출할 수 없음






*/

public class summary {

}
