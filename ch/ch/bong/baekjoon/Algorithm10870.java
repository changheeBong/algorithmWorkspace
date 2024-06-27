package ch.ch.bong.baekjoon;

import java.util.Scanner;

/*
백준 10870 피보나치 수 5
 */
public class Algorithm10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num+1];
        for(int i = 0; i<=num; i++){
            if( i < 2){
                arr[i] = i;
            }else{
                arr[i] = arr[i-2] + arr[i-1];
            }
        }

            System.out.println(arr[num]);


    }



}
