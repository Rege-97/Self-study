package practice;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열의 사이즈를 입력하세요 : ");
		int size= Integer.parseInt(br.readLine());	// 만들 배열 사이즈 입력
		
		MyArrays ma= new MyArrays(size);	// 입력된 size만큼의 배열로 초기화하여 객체 생성
		
		int arr[]=ma.randomArrays(); // 배열에 랜덤 값이 중복으로 담기는 기능으로 arr에 저장
		ma.printArrays();	// 출력 기능
		
	}
}
