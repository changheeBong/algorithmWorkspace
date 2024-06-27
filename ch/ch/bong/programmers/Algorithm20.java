package ch.ch.bong.programmers;

import java.util.*;

/*
프로그래머스
같은 숫자는 싫어
 */
public class Algorithm20 {



    public class Solution {
        public int[] solution(int []arr) {




            return noSame(arr);
        }

        public int[] noSame(int []sameArr){

            Stack st = new Stack();
            int temp = sameArr[0];

            st.push(temp);


            for(int i = 1 ; i < sameArr.length; i ++){

                if(sameArr[i] == (int)st.peek()){

                }else{
                    st.push(sameArr[i]);


                }
            }
            int[] arr = new int[st.size()];
            for(int i = st.size()-1; i > -1; i --){
                arr[i] = (int)st.pop();

            }

            return arr;


        }
    }
}
