package practice;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�迭�� ����� �Է��ϼ��� : ");
		int size= Integer.parseInt(br.readLine());	// ���� �迭 ������ �Է�
		
		MyArrays ma= new MyArrays(size);	// �Էµ� size��ŭ�� �迭�� �ʱ�ȭ�Ͽ� ��ü ����
		
		int arr[]=ma.randomArrays(); // �迭�� ���� ���� �ߺ����� ���� ������� arr�� ����
		ma.printArrays();	// ��� ���
		
	}
}
