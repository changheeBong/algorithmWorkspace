package ch.baekjoon;

import java.util.Scanner;

/*
백준
1541번
잃어버린 괄호
 */
public class Algorithm12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
        String word = "55-50+40";
        String[] string = new String[word.length()];
        int chk = 0;
        for(int i = 0; i < word.length(); i ++){
            String temp = word.charAt(i)+"";

            if(temp.equals("+") || temp.equals("-")){
                string[chk] = temp;
                chk++;
            }


        }
        for(String i : string)
        System.out.println("string[] = " + i);
    }
}
