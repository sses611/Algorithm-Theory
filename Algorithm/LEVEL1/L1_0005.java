/*
���� ����
���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

IN 
"1234"

OUT
1234
����ȯ�̶� 

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
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
    	L1_0005 strToInt = new L1_0005();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}