import java.util.*;

public class CodeUp_1033{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int  num = scan.nextInt();
		scan.close();
		
		String Hex = Integer.toHexString(num);
 		
		System.out.println(Hex.toUpperCase()); 	
 	}
}
