import java.awt.image.AbstractMultiResolutionImage;
import java.util.Iterator;
/*
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

IN 
01033334444

OUT
[01033334444]

char[] ch = phone_number.toCharArray();
String.valuefOf() //파라미터가 null이면 문자열  null을 만들어서 담는다. -> String으로 변환


*/

public class L1_0003 {
	public static String solution(String phone_number) {
		char[] ch =phone_number.toCharArray();
		
		for (int i = 0; i < ch.length-4; i++) {
			ch[i] = '*';
		}
		return String.valueOf(ch);
	} 
	
	public static void main(String[] args) {
		solution("01012345678");
	}
}