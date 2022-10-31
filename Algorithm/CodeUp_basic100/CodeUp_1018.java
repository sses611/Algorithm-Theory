import java.text.*;
import java.util.*;

public class CodeUp_1018{

	public static void main(String[] args) {

		
		SimpleDateFormat time_now_format = new SimpleDateFormat("YYYY.MM.DD");

		Date time = new Date(System.currentTimeMillis());
		String now = time_now_format.format(time);
		
		System.out.print(now);
		
	}
}
