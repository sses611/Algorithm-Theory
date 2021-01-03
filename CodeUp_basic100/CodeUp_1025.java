import java.util.*;

public class CodeUp_1025{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		scan.close();
		
		int ans[] = new int[num.length()];
		
		
		for(int a = 0; a<num.length(); a++) {
			ans[a] = num.charAt(a)-'0';
		}
		
		System.out.println("["+ans[0]*10000+"]");
		System.out.println("["+ans[1]*1000+"]");
		System.out.println("["+ans[2]*100+"]");
		System.out.println("["+ans[3]*10+"]");
		System.out.println("["+ans[4]+"]");			
 	}
}
