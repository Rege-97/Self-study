import java.io.*;

public class Ex33 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		int user = Integer.parseInt(br.readLine());
	
		int sum = 0;
		
		for (int i = 1; i <= user; i++) {
			if (i == 1) {
				System.out.print("1");
				sum += 1;
			} else if (i % 2 == 0) {
				System.out.print(" - " + i);
				sum -= i;
			} else {
				System.out.print(" + " + i);
				sum += i;
			}
		}
		
		System.out.println(" = " + sum);

	}

}
