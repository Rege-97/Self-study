
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 5;
//		while (i-- != 0) {
//			System.out.println(i + " - I can do it.");
//		}
		int sum = 0;
		int i = 0;

		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}

	}

}
