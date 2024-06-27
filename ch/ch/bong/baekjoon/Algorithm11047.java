package ch.ch.bong.baekjoon;

/*
백준 11047
동전 0
 */

import java.util.Scanner;

public class Algorithm11047 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String[] temp = first.split(" ");
        int len = Integer.parseInt(temp[0]);
        int price = Integer.parseInt(temp[1]);
        int result = 0;
        int chk = 0;
        int[] arr = new int[len];
        for(int i = 0; i < len ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = len-1; i >= 0; i-- ){

            result += price / arr[i];
            chk = price / arr[i];
         price -= arr[i] * chk;
        if(price == 0 || price < 0) break;



        }

        System.out.println(result);



    }
}
