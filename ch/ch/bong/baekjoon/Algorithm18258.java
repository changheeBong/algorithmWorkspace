package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
백준 18258 큐2
 */

public class Algorithm18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> qe = new LinkedList();

        int back = -1;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i ++){
            String str = br.readLine();
            int result  = -2;
            if(str.equals("front")){
                if(qe.isEmpty()){
                    result = -1;
                }else{
                    result = qe.element();
                }
            }else if(str.equals("back")){
                if(qe.isEmpty()){
                    result = -1;
                }else{
                    result = back;
                }
            }else if(str.equals("size")){
                result = qe.size();
            }else if(str.equals("pop")){
                if(qe.isEmpty()){
                    result = -1;
                }else{
                    result = qe.poll();
                }
            }else if(str.equals("empty")){
                if(qe.isEmpty()){
                    result = 1;
                }else{
                    result = 0;
                }
            }else{
                StringTokenizer st = new StringTokenizer(str);
                st.nextToken();

                back = Integer.valueOf(st.nextToken());

                qe.add(back);

            }

            if(result != -2){
                sb.append(result + "\n");

            }

        }
        System.out.println(sb);


    }




}
