package com.ict.edu08;

import java.io.Serializable;

public class VO implements Serializable {

	private String name;
	private int kor;		// 생성자를 활용한 방법
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;
	
	// 생성자
	public VO() {}

	public VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		sum = kor + eng + math;
		avg = (int)(sum / 3.0 * 10)/10.0;
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
	
	/*
	// 메소드를 활용한 방식
	public void s_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
		
		s_avg();
	}
	
	public void s_avg() {
		avg = (int)(sum / 3.0 * 10)/10.0;
		
		s_hak();
	}
	
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
	*/
	
}
