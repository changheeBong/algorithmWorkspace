package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm1316 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0 ; i < n ; i ++){
            if(chkGroupStr(br.readLine())) result++;
        }

        System.out.println(result);
        br.close();
    }

    public static Boolean chkGroupStr(String str){
        boolean[] chkGroup = new boolean[26];
        int before = 0;
        for(int i = 0; i < str.length(); i ++){
            int now = str.charAt(i);
            if(before != now) {
                if (!chkGroup[now - 'a']) {
                    chkGroup[now - 'a'] = true;
                    before = now;
                } else {
                    return false;
                }
            }

        }
        return true;
    }


}
