class Ex31 {
	public static void main(String args[]) {
		Tv t;			// Tv 인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();	// Tv 인스턴스를 생성한다.
		t.channel=7;	// Tv 인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();	// Tv 인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 "+t.channel+" 입니다.");

	}
}

class Tv {
	
	// Tv의 속성(멤버 변수)
	String color;	// 색상
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널

	// Tv를 켜거나 끄는 기능을 하는 메소드
	void power() {
		power = !power;
	}
	
	// Tv의 채널을 높이는 기능을 하는 메소드
	void channelUp() {
		++channel;
	}
	// Tv의 채널을 낮추는 기능을 하는 메소드
	void channelDown() {
		--channel;
	}
}