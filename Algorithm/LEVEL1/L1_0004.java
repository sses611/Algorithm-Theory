import java.util.Arrays;

/*
���� ����

IN 
[1,2,3,4]

OUT
[2.5]
��Ʈ���̶� : Arrays.stream(array).average().orElse(0);
*/

//public class L1_0004 {
//	public static double solution(int[] arr) {
//		 double answer = 0;
//	      for(int i =0; i<arr.length;i++){
//	          answer += arr[i];
//	      }
//	      return answer/arr.length;
//	} 
//	
//	public static void main(String[] args) {
//		int[] parr = {1,2,3,4};
//		solution(parr);
//	}
//}

public class L1_0004 {
	public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
        // Array��Ʈ���� ����� ����, ��հ��� �������� ���� ���? 0���� ǥ��
	} 
	
	public static void main(String[] args) {
        int x[] = {1,2,3,4};
        L1_0004 getMean = new L1_0004();
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}