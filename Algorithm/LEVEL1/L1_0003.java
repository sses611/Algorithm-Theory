import java.awt.image.AbstractMultiResolutionImage;
import java.util.Iterator;
/*
���� ����
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

IN 
01033334444

OUT
[01033334444]

char[] ch = phone_number.toCharArray();
String.valuefOf() //�Ķ���Ͱ� null�̸� ���ڿ�  null�� ���� ��´�. -> String���� ��ȯ


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