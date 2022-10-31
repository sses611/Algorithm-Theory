import java.util.*;

public class CodeUp_1020{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String code = scan.nextLine();
		scan.close();
		
		String[] codeArr = code.split("-");
		
		for(int a = 0; a < codeArr.length; a++) {
			System.out.print(codeArr[a]);
		}				
	}
}
