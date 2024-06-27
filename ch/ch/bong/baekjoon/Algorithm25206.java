package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Algorithm25206 {
    public static void main(String[] args) throws IOException {

        System.out.println(chkScore());
    }

    public static String chkScore() throws IOException {
        Double sumScore = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> scoreMap = new HashMap<>();
        Double score = 0.0;
        scoreMap.put("A+", 4.5);
        scoreMap.put("A0", 4.0);
        scoreMap.put("B+", 3.5);
        scoreMap.put("B0", 3.0);
        scoreMap.put("C+", 2.5);
        scoreMap.put("C0", 2.0);
        scoreMap.put("D+", 1.5);
        scoreMap.put("D0", 1.0);
        scoreMap.put("F", 0.0);
        for(int i = 0 ; i < 20; i ++){
            String[] str = br.readLine().split(" ");

            if(!str[2].equals("P")) {
                score += Double.parseDouble(str[1]) * scoreMap.get(str[2]);
                sumScore += Double.parseDouble(str[1]);
            }
        }
        return String.format("%.6f",score / sumScore);

    }
}
