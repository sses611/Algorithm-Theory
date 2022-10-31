import java.util.*;

public class CodeUp_1014{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char  A, B;
		A = scan.next().charAt(0);
		B = scan.next().charAt(0);
		
		scan.close(); // scan을 끝내는 구문을 추가해야 에러X
		
		System.out.println(B + " " + A);	
	}
}
