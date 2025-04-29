import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] sum = new int[n+1][n+1];
        for(int i = 1; i <= n; i ++){
            st = new StringTokenizer(sc.nextLine());
            for(int j = 1; j <= n; j++){
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }
        for(int k = 0; k< m; k++) {
            st = new StringTokenizer(sc.nextLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(sum[x2][y2] - sum[x2][y-1] - sum[x-1][y2] + sum[x-1][y-1]);
        }

    }
}
