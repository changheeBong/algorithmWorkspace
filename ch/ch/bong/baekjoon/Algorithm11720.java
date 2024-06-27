package ch.ch.bong.baekjoon;


import java.util.Scanner;

public class Algorithm11720 {
 /**
     2022-08-07
     문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
     입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
     출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
     예제 입력
     5
     54321
     출력
     15
  */
 public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);

     System.out.println("숫자 입력 ");
     int length = sc.nextInt();
     String temp = sc.next();

     int result = 0;
     for(int i = 0; i < length; i++){
         result += Character.getNumericValue(temp.charAt(i));
     }
     System.out.println(result);

 }
}
