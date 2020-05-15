package com.ict.edu;

public class Ex12 {
	
	// 전역변수 지정
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank;
	
	// 생성자
	
	public Ex12() { }		// 임시 클래스 생성을 위해 오버로딩
							// 기본 생성자는 오류 방지를 위해 항상 생성해주는 것이 좋음
	
	public Ex12(String name, int sum, double avg, String hak, int rank) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
		this.hak = hak;
		this.rank = rank;
	}
	
	// getter / setter
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
}
