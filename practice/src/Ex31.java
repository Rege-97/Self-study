class Ex31 {
	public static void main(String args[]) {
		Tv t;			// Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();	// Tv �ν��Ͻ��� �����Ѵ�.
		t.channel=7;	// Tv �ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown();	// Tv �ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� "+t.channel+" �Դϴ�.");

	}
}

class Tv {
	
	// Tv�� �Ӽ�(��� ����)
	String color;	// ����
	boolean power;	// ��������(on/off)
	int channel;	// ä��

	// Tv�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
	void power() {
		power = !power;
	}
	
	// Tv�� ä���� ���̴� ����� �ϴ� �޼ҵ�
	void channelUp() {
		++channel;
	}
	// Tv�� ä���� ���ߴ� ����� �ϴ� �޼ҵ�
	void channelDown() {
		--channel;
	}
}