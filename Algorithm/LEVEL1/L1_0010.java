import java.util.ArrayList;

/*

���� ���� : ���� ���ڴ� �Ⱦ�

�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

IN&OUT
arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.

*/

public class L1_0010{
  public static int[] solution(int[] arr) { //int[] arr �迭�� �Ѱܹ޴´�
	  ArrayList<Integer> list = new ArrayList<Integer>(); // ����Ʈ ������ <�� �빮��>
	   
      int arrCnt = 10;
      
      for(int i=0; i<arr.length; i++){
          if(arr[i] != arrCnt){
              list.add(arr[i]); //����Ʈ �߰����
              arrCnt = arr[i];
          }
      }
      
      int[] answer = new int[list.size()];
      for(int i = 0; i<list.size(); i++){ //����Ʈ ������ ����
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
