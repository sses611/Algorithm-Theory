/*
���� ���� : \
���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

IN 
12

OUT
28

��� : 12�� ����� 1,2,3,4,6,12


*/

public class L1_0006{
  public static void main(String args[]) {
	  int answer = 0;
	  int n = 12;
	  
	  for(int i=1; i<=n; i++){
          if(n%i == 0){
              answer += i;               
              System.out.println(i+"��°���� "+n+ "����Դϴ�.");
          }
	  }
  	}
 }
