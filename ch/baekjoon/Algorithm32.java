package ch.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 2720 세탁소 사장 동혁
 */
public class Algorithm32 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n ; i ++){
            int a = Integer.parseInt(br.readLine());
            System.out.println(calcCoin(a));
        }


    }

    static String calcCoin(int money){
        String result = "";
        int temp = 0;
        int change[] = {25, 10, 5, 1};
        for(int i = 0 ; i < change.length; i ++){
            if(i == change.length-1){
                result += money / change[i];
            }else {
                result += money / change[i] + " ";
                money -=   money / change[i]  * change[i];
            }
        }


        return result;
    }

}
