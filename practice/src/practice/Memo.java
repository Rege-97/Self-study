package practice;

import java.io.*;
import java.util.*;
;

public class Memo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		StringTokenizer st= new StringTokenizer(br.readLine(),"%");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
	
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
