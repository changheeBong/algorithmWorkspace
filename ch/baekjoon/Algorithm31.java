package ch.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 백준 2675 문자열 반복
 */
public class Algorithm31 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());


        for(int i = 0 ; i < n ; i++){
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            String str = st.nextToken();
            for(int j = 0 ; j < str.length(); j++){
                for(int k = 0; k < a; k++){
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb);
        }





    }

}
