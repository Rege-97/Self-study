package practice;

public class MyArrays {

	int arr[];
	int temp;

	public MyArrays(int size) {
		arr = new int[size];
		temp = 0;
	}

	public int[] randomArrays() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("1~10까지 " + arr.length + "개의 랜덤 값이 중복없이 입력되었습니다.");
		return arr;

	}

	public void printArrays() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
