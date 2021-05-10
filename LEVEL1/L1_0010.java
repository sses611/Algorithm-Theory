import java.util.ArrayList;

/*

문제 설명 : 같은 숫자는 싫어

배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

IN&OUT
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.

*/

public class L1_0010{
  public static int[] solution(int[] arr) { //int[] arr 배열을 넘겨받는다
	  ArrayList<Integer> list = new ArrayList<Integer>(); // 리스트 선언방법 <앞 대문자>
	   
      int arrCnt = 10;
      
      for(int i=0; i<arr.length; i++){
          if(arr[i] != arrCnt){
              list.add(arr[i]); //리스트 추가방법
              arrCnt = arr[i];
          }
      }
      
      int[] answer = new int[list.size()];
      for(int i = 0; i<list.size(); i++){ //리스트 사이즈 길이
        answer[i] = list.get(i);   
      } 
      System.out.println(list);
      return answer;
  }

  
  public static void main(String[] args) {
	  int x[] = {1,1,3,3,0,1,1};
	  L1_0010.solution(x);
  }
 }
