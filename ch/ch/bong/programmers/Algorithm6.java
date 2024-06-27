package ch.ch.bong.programmers;

public class Algorithm6 {
    /*
    프로그래머스
    코딩테스트 연습
    월간 코드 챌린지 시즌3
    없는 숫자 더하기
     */
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            int cnt;
            for(int i= 0 ; i < 10; i ++){
                cnt = 0;
                for(int j = 0; j < numbers.length; j ++){
                    if(numbers[j] == i){
                        cnt++;
                    }
                }
                if(cnt == 0){
                    answer += i;
                }

            }


            return answer;
        }
    }
}
