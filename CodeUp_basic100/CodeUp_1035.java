import java.util.*;

public class CodeUp_1035{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String num = scan.nextLine();
		
		int num_h = Integer.valueOf(num,16);
		
		scan.close();
	
		System.out.println(num_h);
		
		}
}
