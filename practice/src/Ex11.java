
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		while (true) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
