package ch.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 11659 한수
 */
public class Algorithm25 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

           int arr[] = new int[n+1];

           arr[0] = 0;
           for(int i = 1; i<= n; i++){
               arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
           }

            for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int result = arr[end] - arr[start-1];
                System.out.println(result);


            }

        }






}

