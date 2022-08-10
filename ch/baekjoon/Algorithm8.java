package ch.baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algorithm8 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    StringTokenizer st = new StringTokenizer(s," ");
    int i = 0;
    int[] arr = new int[n];
    while(st.hasMoreTokens()){
        arr[i] = Integer.parseInt(st.nextToken());
        i++;
    }

        Arrays.sort(arr);
    int result = 0;
        for(i = 0; i < arr.length; i ++){
            for(int j = 0; j < i ; j++){
                result += arr[j];
            }
            result += arr[i];
        }
        System.out.println(result);
    }


}
