package ch.baekjoon;

import java.util.Scanner;

/*
백준
1541번
잃어버린 괄호
 */
public class Algorithm12 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("\\-");
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            String[] subString = arr[i].split("\\+");

            for(String s : subString){
                temp += Integer.parseInt(s);
            }
            if(i == 0){
                result += temp;
            }else{
                result -= temp;
            }

        }

        System.out.println(result);
    }
}
