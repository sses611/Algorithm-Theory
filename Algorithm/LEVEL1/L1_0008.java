import jdk.jshell.spi.SPIResolutionException;

/*

���� ���� : �̻��� ���� �����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

IN 
"try hello world"

OUT
"TrY HeLlO WoRlD"

String�� �и��ϴ� �� a = s.split("")
Array�� �и��ϴ� �� a[] = s.toCharArray();

*/

public class L1_0008{
	
  public static String solution(String s) {
	  String answer = "";
      
      String str[] = s.split("");
      String space = " "; //������ ū����ǥ
      int cnt = 0;
      
      for(int i = 0; i < str.length; i++){
          if(str[i].equals(space)){ // ����� ������ü�� ���Ѵ�
             cnt = 0; // ����������� �����ϴ� �ſ��� 
          }else{
             if(cnt % 2 == 0){
                cnt++;
                str[i] = str[i].toUpperCase();
             }else{
                 cnt++;
                 str[i] = str[i].toLowerCase();
             }
          }
          answer += str[i];
      }
      
      System.out.println(answer);
      
      return answer;
  }
  
  public static void main(String[] args) {
	  solution("try hello world");
  }
 }
