import java.util.Scanner;

public class CodeUp_1031{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int num = scan.nextInt();
		scan.close();
		
		String Oct = Integer.toOctalString(num);
		
		System.out.println(Oct);
		
 	}
}
