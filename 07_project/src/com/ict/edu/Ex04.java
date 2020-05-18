package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		
	// 날짜 관련 클래스
	//	- 현재 사용하고 있는 컴퓨터의 시간을 기준으로 함
	
	// 1. Date 클래스
	//	- deprecate >>> 언제든지 지원을 끊을 수 있음
		
		Date date = new Date();
		System.out.println(date);
													// 3월: M <----> 분: m
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(date2.format(date));
		
		SimpleDateFormat date3 = new SimpleDateFormat("yy. M. dd. hh:mm:ss");
		System.out.println(date3.format(date));
		
		System.out.println("------------------------------");
		
		System.out.println(date.getYear()+1900 + "년");	// - 1900년으로 출력
		System.out.println(date.getMonth()+1 + "월");	// 1월이 0으로 출력
		System.out.println(date.getDate() + "일");
		
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		
		int k = date.getDay(); // 0 (일요일) ~ 6 (토요일)
		switch (k) {
		case 0:System.out.println("일요일"); break;
		case 1:System.out.println("월요일"); break;
		case 2:System.out.println("화요일"); break;
		case 3:System.out.println("수요일"); break;
		case 4:System.out.println("목요일"); break;
		case 5:System.out.println("금요일"); break;
		case 6:System.out.println("토요일"); break;		
		}
		
		System.out.println("==============================");
		
	// 2. Calendar 클래스
	//	- new 예약어를 사용하지 않고 객체 생성
	//	- get(참조변수.필드 or Calender.필드)
	//	- 현재 Date 클래스 대신 사용되는 클래스
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR) + "년");
		System.out.println(now.get(Calendar.MONTH) + 1 + "월");
		System.out.println(now.get(Calendar.DATE) + "일");
		
		System.out.println("------------------------------");
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println(now.get(Calendar.HOUR) + "시");			// 12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + "시");	// 24시간제
		
		System.out.println("------------------------------");
		
		// AM >> 0 , PM >> 1;
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("A.M. " + now.get(Calendar.HOUR) + "시");
		} else {
			System.out.println("P.M. " + now.get(Calendar.HOUR) + "시");
		}
		
		System.out.println(now.get(Calendar.MINUTE) + "분");
		System.out.println(now.get(Calendar.SECOND) + "초");
		
		System.out.println("------------------------------");
		
		// 요일 (0:일요일 ~ 6:토요일)
		res = now.get(Calendar.DAY_OF_WEEK);
		switch (k) {
		case 0:System.out.println("일요일"); break;
		case 1:System.out.println("월요일"); break;
		case 2:System.out.println("화요일"); break;
		case 3:System.out.println("수요일"); break;
		case 4:System.out.println("목요일"); break;
		case 5:System.out.println("금요일"); break;
		case 6:System.out.println("토요일"); break;		
		}
	}
}
