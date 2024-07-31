import java.util.ArrayList;
import java.util.List;



class Solution {
    
    static ArrayList<Integer>[] strongLists;
    static ArrayList<Integer>[] weakLists;
    static boolean[] visited;
    static int count;
    
    public int solution(int n, int[][] results){
            int answer = 0;

            strongLists = new ArrayList[n+1];
            weakLists = new ArrayList[n+1];
            for(int i =1; i<=n; i ++){
                strongLists[i] = new ArrayList<>();
                weakLists[i] = new ArrayList<>();
            }

            for (int[] result : results) {
                strongLists[result[0]].add(result[1]);
                weakLists[result[1]].add(result[0]);
            }

            for(int i = 1; i<= n; i++) {
                visited = new boolean[n+1];
                count = 0;
                int strong = DFS(strongLists, i);
                count = 0;
                visited = new boolean[n+1];
                int weak = DFS(weakLists, i);
                if( strong + weak == n-1) answer++;
            }
            return answer;
        }
    
    static int DFS(List<Integer>[] edges, int i){

        visited[i] = true;

        for (Integer edge : edges[i]) {
            if(!visited[edge]){
                visited[edge] = true;
                DFS(edges,edge);
                count++;
            }
        }

        return count;
    }
    }

    
