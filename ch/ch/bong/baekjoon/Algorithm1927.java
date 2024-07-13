package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.PriorityQueue;

public class Algorithm1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0 ){
                Integer poll = pq.poll();
                if(poll == null) System.out.println(0);
                else System.out.println(poll);
            }else{
                pq.offer(num);
            }
        }

    }


}