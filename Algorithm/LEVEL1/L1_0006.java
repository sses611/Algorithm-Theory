/*
문제 설명 : \
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

IN 
12

OUT
28

약수 : 12의 약수는 1,2,3,4,6,12


*/

public class L1_0006{
  public static void main(String args[]) {
	  int answer = 0;
	  int n = 12;
	  
	  for(int i=1; i<=n; i++){
          if(n%i == 0){
              answer += i;               
              System.out.println(i+"번째수는 "+n+ "약수입니다.");
          }
	  }
  	}
 }
