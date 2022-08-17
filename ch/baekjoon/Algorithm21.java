package ch.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/*
백준 2869 달팽이는 올라가고 싶다
 */
public class Algorithm21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int result = (int)Math.ceil((length - down) / (up - down));
        if((length-down) % (up-down) != 0){
            result++;
        }



        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();







    }
}
