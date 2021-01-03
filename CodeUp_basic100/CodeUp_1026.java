import java.text.*;
import java.util.*;

public class CodeUp_1026{

	public static void main(String[] args) {
		
		SimpleDateFormat time_now_format = new SimpleDateFormat("HH:mm:ss");
		
		Date time = new Date(System.currentTimeMillis());
		String now = time_now_format.format(time);
		
		System.out.print(now.substring(3,5));
 	}
}
