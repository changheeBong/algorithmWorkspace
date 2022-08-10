package ch.programmers;

public class Algorithm7 {

    public class Algorithm {

/*
    프로그래머스
    코딩테스트 연습
    2021 카카오 채용연계형 인턴십
    숫자 문자열과 영단어
 */
        class Solution {
            public int solution(String s) {

                String chk[] = {"zero", "one", "two", "three","four","five","six","seven","eight","nine"};
                for(int i = 0; i < chk.length; i++) {
                    if (s.contains(chk[i])){
                        s = s.replaceAll(chk[i], (i+""));

                    }
                }
                int result = Integer.parseInt(s);


                return result;
            }
        }


    }
}
