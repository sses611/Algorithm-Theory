import java.util.Scanner;
/*
���� ����
�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

IN 
5 3

OUT

*****
*****
*****

�߰� ���� : java.lang.ArrayIndexOutOfBoundsException 
���� ���� : �迭�� ũ�⺸�� ũ�ų� ���� �ε����� ���� ��û�� �������
ex) 

int[] arr = {0,1,2,3,4};
arr[5] = 4;
*/

public class L1_0001{
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       for(int i = 1; i <= b; i++){
           for(int j = 1; j<=a; j++){
               System.out.print('*');
           }
          System.out.print('\n'); //println�� print ����
       }
       
    }
}