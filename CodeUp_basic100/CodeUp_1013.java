import java.util.*;

public class CodeUp_1013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int  A, B;
		A = scan.nextInt();
		B = scan.nextInt();
		
		scan.close(); // scan을 끝내는 구문을 추가해야 에러X
		
		System.out.println(A + " " + B);	
	}
}
