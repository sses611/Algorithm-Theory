import java.util.*;

public class CodeUp_1023{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float num = scan.nextFloat();
		String s_num;
		while(0 > num || num >10000) {
			System.out.println("입력범위를 초과하였습니다.");
			num = scan.nextFloat();
		}
		scan.close();
		
		s_num = String.valueOf(num); // 형변환 Casting 참고 : https://coding-factory.tistory.com/130
		
		String numList[] = s_num.split("[.]");
		
		for(int a = 0; a < numList.length; a++) {
			System.out.println(numList[a]);
		}
	}
}
