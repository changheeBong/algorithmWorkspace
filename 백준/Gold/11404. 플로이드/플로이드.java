
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] distance = new int[N+1][N+1];
        for(int i = 1; i<= N; i++){
            for(int j = 1; j<= N ; j++){
                if(i == j ) distance[i][j] = 0;
                else distance[i][j] = Integer.MAX_VALUE / 2;
            }
        }

        for(int i = 0; i< M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(distance[a][b] > c) distance[a][b] = c;
        }

        for(int k = 1; k<= N; k++){
            for(int i =1; i<= N; i++){
                for(int j=1; j<= N; j++){
                    if(distance[i][j] > distance[i][k] + distance[k][j]){
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            for (int j = 1; j<= N; j++){
                if(distance[i][j] == Integer.MAX_VALUE / 2) sb.append(0 + " ");
                else sb.append(distance[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
