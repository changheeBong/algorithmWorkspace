package ch.programmers;
/*
프로그래머스 Summer/Winter Coding(2019) 멀쩡한 사각형
 */
public class Algorithm18 {
    class Solution {
        public long solution(int w, int h) {
            long answer;

            long a = (long)Math.max(w,h);
            long b = (long)Math.min(w,h);

            while(b != 0){
                long r = a%b;
                a = b;
                b = r;
            }
            long gcd = a;
            answer = ((long)w*h) - (long)(((w / gcd) + (h / gcd) - 1) * gcd);
            return answer;
        }
    }
}

