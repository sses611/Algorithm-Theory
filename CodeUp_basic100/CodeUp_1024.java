import java.util.*;

public class CodeUp_1024{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String wordList[] = word.split("");
		
		scan.close();
		
		for(int a = 0; a<wordList.length; a++) {
			System.out.println(wordList[a]);
		}
			
 	}
}
