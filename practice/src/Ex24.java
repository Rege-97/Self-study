import java.util.Arrays;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"����","����","��"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<10;i++) {
			int tmp =(int)(Math.random()*3);
			
			System.out.println(strArr[tmp]);
		}
	}

}
