import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int cnt = 0;
        arr = new boolean[N][M];
        for(int i = 0; i < N ; i ++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                if(str.charAt(j) == '1'){
                    arr[i][j] = true;
                }
            }
        }
        for(int i = N - 1; i >= 0 ; i --){
            for(int j = M - 1; j >= 0; j--){
                if(arr[i][j]) {
                    solution(i, j);
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);


    }
    static void solution(int x, int y){
        for(int i = 0; i <= x; i ++){
            for(int j = 0; j <= y; j++){
                arr[i][j] = !arr[i][j];
            }
        }
    }
}
