package ch.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
백준 11866
요세푸스 문제 0
 */
public class Algorithm17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st;
        Stack stack = new Stack();
        int n = Integer.parseInt(br.readLine());



        for(int i = 0; i < n ; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            String temp = st.nextToken();

            if(temp.equals("push")){
                stack.push(st.nextToken());
            }else {
                stack = solution(temp, stack);
            }


        }


    }

    public static Stack solution(String str, Stack st){
        int result = 0;


        if(str.equals("top")){
            if(st.isEmpty()){
                System.out.println(-1);
            }else {
                System.out.println(st.peek());
            }
        }else if(str.equals("pop")){
            if(st.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(st.pop());
            }
        }else if(str.equals("size")){
            System.out.println(st.size());
        }else if(str.equals("empty")){
            if(st.isEmpty()){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }


    return st;
    }
}
