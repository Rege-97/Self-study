import java.util.Arrays;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i] = i +1; // 1~10의 숫자를 순서대로 배열
		}
		
		for(int i=0;i<iArr2.length;i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		
		// 배열에 저장된 값들을 출력한다.
		for(int i=0;i<iArr1.length;i++) {
			System.out.print(iArr1[i]+", ");
			
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		
		
	}

}
