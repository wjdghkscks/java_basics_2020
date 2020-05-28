package com.ict.edu09;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

// Serializable 이 아닌 또다른 객체의 직렬화 방법
//	>> Externalizable

// writeExternal()	>> 직렬화
// readExternal()	>> 역직렬화

// 특정 멤버를 제외시키는 방법
//	- Serializable 은 제외 시 transient를 사용
//	- writeExternal()과 readExternal() 안에 있는 제외할 멤버를 동시에 주석 처리

public class VO implements Externalizable {

	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	// 생성자
	public VO() {}
	
	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	@Override	// 역직렬화
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = (int) in.readObject();
		// weight = (double) in.readObject();	>> 제외
		gender = (boolean) in.readObject();
	}

	@Override	// 직렬화
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
		// out.writeObject(weight);				>> 한 쪽만 제외하면 오류 발생
		out.writeObject(gender);
	}
	
	// getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
