package com.ict.edu;

public class Ex10 {
	
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
	public int s_sum(int kor, int eng, int math) {
		return sum = kor + eng + math;
	}
	
	// 평균 구하기	
	public double s_avg() {
		return avg = (int)(sum / 3.0 * 10)/10.0;
	}
	
	// 학점 구하기	
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
