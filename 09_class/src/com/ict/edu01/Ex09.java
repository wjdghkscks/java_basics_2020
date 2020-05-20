package com.ict.edu01;

// 인터페이스
interface I {
	public void play();
}

class Bumper_Car implements I {
	@Override
	public void play() {
		System.out.println("범퍼카");
	}
}

class Baseball implements I {
	@Override
	public void play() {
		System.out.println("야구게임");
	}
}



class K_land {
	void autoPlay(I i) {
		i.play();
	}
}

public class Ex09 {
	public static void main(String[] args) {
		
		K_land k_land = new K_land();
		// I i = new I();						>> interface는 객체 생성 불가
		
		k_land.autoPlay( new I() {
			@Override
			public void play() {
				System.out.println("회전목마");
			}
		} );
		
		System.out.println("=========================");
		
		k_land.autoPlay(new Bumper_Car());
		
		k_land.autoPlay(new Baseball());
		
		
		System.out.println("=========================");
		
		int k = 1;
												// I는 인터페이스이기 때문에
		I i = null;								// I i = new I() 객체 생성 불가
		if (k == 1) {
			i = new Bumper_Car();
		} else if (k == 2) {
			i = new Baseball();					// 인터페이스를 활용한 이러한 형태를
		}										// * 호환이 가능하다 *라고 말함
		
		k_land.autoPlay(i);
		
		
		
	}
}
