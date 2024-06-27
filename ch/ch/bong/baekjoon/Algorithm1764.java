package ch.ch.bong.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
백준 1764 듣보잡
 */
public class Algorithm1764 {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<String> arrayList = new ArrayList<>();

        Map<String,String> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            String temp = br.readLine();
            map.put(temp, temp);
        }

        for(int i = 0; i < m ; i ++){
            String temp = br.readLine();
            if(map.containsKey(temp)){
                arrayList.add(map.get(temp));
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
