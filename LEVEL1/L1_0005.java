/*
문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

IN 
"1234"

OUT
1234
형변환이란 

*/

//class Solution {
//  public int solution(String s) {
//      int answer = 0;
//      answer = Integer.parseInt(s);
//      return answer;
//  }
//}


public class L1_0005 {
    public int getStrToInt(String str) {
    	int num=Integer.parseInt(str);
        return num;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
    	L1_0005 strToInt = new L1_0005();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}