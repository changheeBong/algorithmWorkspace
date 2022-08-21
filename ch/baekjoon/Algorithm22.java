package ch.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/*
백준 14425
 */
public class Algorithm22 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());


        String[] arr = new String[n];
        String[] dup = new String[m];
        for(int i = 0 ; i < n; i ++){
            arr[i] = br.readLine();

        }

        for(int i = 0 ; i < m; i ++){

                dup[i] =  br.readLine();

        }

        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < m; j++){
                if(arr[i].equals(dup[j])){
                    result++;
                }
            }
            

        }


        System.out.println(result);

    }
}
