import java.util.Arrays;

/*
문제 설명

IN 
[1,2,3,4]

OUT
[2.5]
스트림이란 : Arrays.stream(array).average().orElse(0);
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
        // Array스트림의 평균을 구함, 평균값이 정해지지 않을 경우? 0으로 표기
	} 
	
	public static void main(String[] args) {
        int x[] = {1,2,3,4};
        L1_0004 getMean = new L1_0004();
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}