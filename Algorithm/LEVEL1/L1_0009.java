/*

���� ���� : �ڸ��� ���ϱ�
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

IN 
123

OUT
6

answer += n%10;
n = n/10;

*/

public class L1_0009{
  public static int solution(int n) {
	  int answer = 0;
      
      while(n>0){
          answer += n%10;
          n = n/10;
      }
      System.out.println(answer);
      return answer;
  }
  
  public static void main(String[] args) {
	  solution(123);
  }
 }
