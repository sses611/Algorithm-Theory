import java.util.Scanner;
/*
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

IN 
5 3

OUT

*****
*****
*****

발견 오류 : java.lang.ArrayIndexOutOfBoundsException 
생성 이유 : 배열의 크기보다 크거나 음수 인덱스에 대한 요청이 있을경우
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
          System.out.print('\n'); //println과 print 차이
       }
       
    }
}