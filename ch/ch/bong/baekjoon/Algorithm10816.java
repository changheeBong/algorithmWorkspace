package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
백준 10816 숫자 카드 2
 */
public class Algorithm10816 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
       while(st.hasMoreTokens()) {
           int temp = Integer.valueOf(String.valueOf(st.nextToken()));
           if (map.containsKey(temp)) {
               map.replace(temp, map.get(temp) + 1);
           } else {
               map.put(temp, 1);
           }

       }

        int compare = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            int check = Integer.valueOf(String.valueOf(st.nextToken()));

                if(map.containsKey(check)){
                    sb.append(map.get(check) + " ") ;
                }else {
                    sb.append("0 ");
                }

        }

        System.out.println(sb);

    }
}
