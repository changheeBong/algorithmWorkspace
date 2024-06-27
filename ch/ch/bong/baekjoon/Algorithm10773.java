package ch.ch.bong.baekjoon;

import java.util.Scanner;
import java.util.Stack;

/*
백준 10773 제로
 */
public class Algorithm10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num = 3;
        for(int i = 0; i < num ; i++){
            int temp = sc.nextInt();
            if(temp == 0){
                stack.pop();
            }else{
                stack.push(temp);
            }

        }
        int result = 0;
        while(!stack.empty()){
            result += stack.pop();
        }

        System.out.println(result);
    }


}
