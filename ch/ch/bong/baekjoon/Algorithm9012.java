package ch.ch.bong.baekjoon;

import java.util.Scanner;
import java.util.Stack;

/*
백준 9012 괄호
 */
public class Algorithm9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n ; i ++) {
            System.out.println(solution(sc.next()));
        }

    }
    public static String solution(String str){
        String result = "NO";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == ')'){



                if(!stack.isEmpty()) {
                    stack.pop();
                    result = "YES";
                }else{
                    result = "NO";
                    break;
                }

            }
        if(!stack.isEmpty()){
            result = "NO";
        }

        }




        return result;
    }
}
