import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = 'D', opt = '0';
		System.out.println("������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		System.out.printf("����� ������ %d�Դϴ�.%n", score);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98)
				opt = '+';
			else if (score < 94)
				opt = '-';
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88)
				opt = '+';
			else if (score < 84)
				opt = '-';
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78)
				opt = '+';
			else if (score < 74)
				opt = '-';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}

}
