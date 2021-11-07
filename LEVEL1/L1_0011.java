/*

���� ���� : ����� ����


����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.

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
