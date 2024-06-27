package ch.ch.bong.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm1018 {
    static boolean[][] square;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        square = new boolean[n][m];
        for(int i = 0; i < n; i ++){
            String str = br.readLine();
            for(int j = 0; j < m ; j++){
                square[i][j] = str.charAt(j) == 'W' ? true :  false;
            }
        }
        int row = n-7;
        int col = m-7;

        for(int i = 0; i < row; i ++){
            for(int j = 0 ; j < col ; j++){
                findCount(i,j);
            }
        }

        System.out.println(min);
    }

    private static void findCount(int row, int col) {
        int cnt = 0;
        boolean check = square[row][col];
        for(int i = row ; i < 8+row; i++){
            for(int j = col ; j < 8+col ; j++){
                if(square[i][j] != check){
                    cnt++;
                }
                check = !check;
            }
            check = !check;
        }
        min = Math.min(min, Math.min(cnt, 64 - cnt));
    }


}
