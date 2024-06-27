package ch.ch.bong.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 2559 수열
 */
public class Algorithm2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[day];
        int[] sumArr = new int[day - n + 1];
        int result = 0;
        int idx = 0;
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx ++;
        }

        for(int i = 0 ; i <= day-n; i++){

           sumArr[i] = arr[i];
            for(int j = 1;  j <= n - 1 ; j++){
                sumArr[i] += arr[i+j];
            }
            if(i == 0){
                result = sumArr[i];
            }else if(result < sumArr[i]){
                result = sumArr[i];
            }
        }

        System.out.println(result);




    }
}
