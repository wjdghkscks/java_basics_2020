package com.ict.edu;

public class Ex09 {
	
	// 전역변수 지정
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	
	// getter와 setter 만들기
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
	
	// 합계 구하기

	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	
	// 평균 구하기
	
	public void s_avg() {
		avg = (int)(sum / 3.0 * 10)/10.0;
	}
	
	// 학점 구하기
	
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
