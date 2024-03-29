/*

문제 설명 : 행령의 덧셈


행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

IN&OUT

arr1			arr2			return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]		[[3],[4]]		[[4],[6]]
*/
public class L1_0011 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		System.out.println(arr1.length);
//		System.out.println(arr1[0].length);

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		/*
		 * System.out.println();
		 * 
		 * System.out.print(arr2[0][0]); System.out.println(arr2[0][1]);
		 * System.out.print(arr2[1][0]); System.out.println(arr2[1][1]);
		 */

		return answer;
	}

	public static void main(String[] args) {
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 2, 3 } };
		int[][] arr2 = new int[][] { { 3, 4 }, { 5, 6 } };

		solution(arr1, arr2);
	}
}
