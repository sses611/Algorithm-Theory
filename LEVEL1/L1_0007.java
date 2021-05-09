import jdk.jshell.spi.SPIResolutionException;

/*

문제 설명 : 이상한 문자 만들기
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

IN 
"try hello world"

OUT
"TrY HeLlO WoRlD"

String을 분리하는 건 a = s.split("")
Array를 분리하는 건 a[] = s.toCharArray();

*/

public class L1_0007{
	
  public static String solution(String s) {
	  String answer = "";
      
      String str[] = s.split("");
      String space = " ";
      int cnt = 0;
      
      for(int i = 0; i < str.length; i++){
          if(str[i].equals(space)){
             cnt = 0;
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
