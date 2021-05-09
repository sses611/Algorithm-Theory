/*
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.


IN 
2 5

OUT
[2,4,6,8,10]

발견 오류 : java.util.NoSuchElementException 
생성 이유 : 존재하지 않는 것을 가져오려고 할 때 발생

발견 오류 : exception in thread main
생성 이유
ex) 

int[] arr = {0,1,2,3,4};
arr[5] = 4;
*/

public class L1_0002{
	public static long[] solution(int x, int n) {
    	  long[] answer = new long[n];
          long xx = x;
          
          System.out.print(x);
//          
//          for (int i = 0; i < n; i++){
//              answer[i] = xx * (i+1);
//          }
//          System.out.println(answer);
            return answer;
        
       }

   public void main() {
    	solution(2,5);
    }
}

