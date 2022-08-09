package ch.programmers;

public class Algorithm5 {
    /*

    코딩테스트 연습
    2021 Dev-Matching: 웹 백엔드 개발자(상반기)
    로또의 최고 순위와 최저 순위

     */
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {

            int[]  number = new int[6];
            int chk = 0;
            int zero = 0;
            for(int i =0; i<6 ; i++){
                if(lottos[i] != 0){
                    number[chk] = lottos[i];
                    chk++;
                }else{
                    zero++;
                }
            }
            int sol = 0;
            for(int i=0; i<chk ;i++){
                for(int j=0;  j<6; j++){
                    if(number[i] == win_nums[j]){
                        sol++;
                    }
                }
            }
            int min = 0;
            int max = 0;
            if(zero == 0){
                max = 7 - sol;
                if(sol == 0){
                    min = 6;
                    max = 6;
                }else{
                    min = 7 - sol;
                }

            }else{
                if(zero == 6){
                    min = 6;
                }else{
                    min = 7-sol;
                }
                if(zero + sol >= 6){
                    max = 1;
                }else{
                    max = 7 - (zero+sol);
                }
            }









            int[] answer = {max, min};
            return answer;
        }
    }
}
