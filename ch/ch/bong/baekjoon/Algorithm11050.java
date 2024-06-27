package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 11050 이항 계수 1
 */
public class Algorithm11050 {

    public static void main(String[] args) throws IOException {
//        n! / (n-k)! * k!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = fac(n,n) / (fac(n-m,n-m) * fac(m,m));

        System.out.println(result);

    }

    public static int fac(int n , int m){
        if(m == 1){
            return n;
        }else if(m == 0){
            return 1;
        }
        else{
            return fac(n*(m-1) , m-1);
        }
    }

}
