package ch.ch.bong.baekjoon;

import java.util.*;


public class Algorithm2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        Queue queue = new LinkedList();
        for(int i =1 ; i <= n ; i ++){
            queue.add(i);
        }

        while(!queue.isEmpty()){

            queue.remove();

            queue.offer(queue.peek());

            queue.remove();


            if(queue.size() == 1){
                result = (int) queue.peek();
            }

        }
        if(n == 1){
            result = 0;
        }
        System.out.println(result);

    }
}
