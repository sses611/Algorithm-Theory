/*
���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.


IN 
2 5

OUT
[2,4,6,8,10]

�߰� ���� : java.util.NoSuchElementException 
���� ���� : �������� �ʴ� ���� ���������� �� �� �߻�

�߰� ���� : exception in thread main
���� ����
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

