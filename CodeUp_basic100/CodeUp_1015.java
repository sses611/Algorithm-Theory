import java.util.*;

public class CodeUp_1015{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float A = scan.nextFloat();
		scan.close(); // scan을 끝내는 구문을 추가해야 에러X
		
		System.out.println(String.format("%.2f", A));//%2.f 잊지말기
	}
}
