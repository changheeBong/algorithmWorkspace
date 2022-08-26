package ch.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Algorithm28 {

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {



            Queue<Integer> qe = new LinkedList();


            int answer = n-lost.length;
            int idx = 0;
            Arrays.sort(lost);
            Arrays.sort(reserve);


            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(reserve[j] == lost[i]){
                        reserve[j] = -1;
                        lost[i] = -1;
                        answer++;
                        break;
                    }
                }
            }


            for(int i = 0 ; i < lost.length;i++){
                qe.add(lost[i]);
            }

            while(!qe.isEmpty()){
                int temp = sol(qe.peek(),reserve[idx]);
                if(qe.peek() == -1){
                    qe.remove();
                }else if(reserve[idx] == -1){
                    idx++;
                }else{
                    if(temp == 1 ){
                        qe.remove();

                        answer++;
                        idx++;
                    }else{
                        if(qe.peek() > reserve[idx]){
                            idx++;
                        }else if(qe.peek() < reserve[idx] ){
                            qe.remove();
                        }
                    }



                }
                if(idx > reserve.length-1){
                    break;
                }
            }

            return answer;
        }

        public static int sol(int n, int m){

            if(n == m-1 || n == m+1 || n == m){
                return 1;
            }else{
                return 0;
            }
        }
    }


}
