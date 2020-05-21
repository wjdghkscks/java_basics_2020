package com.ict.edu;

public class Ex04 {

	// 전역 변수
	private String name;	// 이름
	private	int sum;		// 총점
	private double avg;		// 평균
	private String hak;		// 학점
	private int rank = 1;	// 순위
	
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
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		
		s_avg();		// 평균 호출
	}
	
	// 평균
	public void s_avg() {
		avg = (int)(sum / 3.0 * 10)/10.0;
		
		s_hak();		// 학점 호출
	}
		
	// 학점
	public void s_hak() {
		if (avg >= 90) {
			hak = "A 학점";
		} else if (avg >= 80) {
			hak = "B 학점";
		} else if (avg >= 70) {
			hak = "C 학점";
		} else {
			hak = "F 학점";
		}
	}
	
}
