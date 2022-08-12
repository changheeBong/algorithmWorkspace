package ch.programmers;
/*
코딩테스트 연습
월간 코드 챌린지 시즌2
약수의 개수와 덧셈
 */
public class Algorithm13 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            int chk;
            for(int i = left; i <= right; i ++){
                chk = 0;
                for(int j = 1 ; j <= i; j++){
                    if(i % j == 0){
                        chk++;
                    }
                }
                if(chk % 2 == 0){
                    answer += i;
                }else if(chk % 2 == 1){
                    answer -= i;
                }
            }
            return answer;
        }
    }
}
