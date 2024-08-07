import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] list;
    static int[] visited;
    static boolean chk;
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        visited = new int[N+1];
        for(int i = 1; i<= N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i<= N-1; i++){
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < a; j++){
                list[i].add(Integer.parseInt(st.nextToken()));
            }
//            while(st.hasMoreTokens()){
//                list[i].add(Integer.parseInt(st.nextToken()));
//            }
        }



        BFS(1);
        if(chk) System.out.println("CYCLE");
            else System.out.println("NO CYCLE");


    }
    static void BFS(int x){
        if(visited[x] == -1) {
            chk = true;
            return;
        }
        visited[x] = -1;

        for (Integer i : list[x]) {
            if(visited[i] != 1) {
                BFS(i);
            }
        }
        visited[x] = 1;

    }
}


