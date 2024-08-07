import java.util.Arrays;
class Solution {
     static int[] parent;
     public int solution(int n, int[][] costs) {
            int answer = 0;
            parent = new int[n];
            for(int i = 0; i< n; i++){
                parent[i] = i;
            }

            Arrays.sort(costs,(x,y) -> Integer.compare(x[2],y[2]));

            for(int i = 0; i< costs.length; i++){
                if(find(costs[i][0]) != find(costs[i][1])){
                    union(costs[i][0],costs[i][1]);
                    answer += costs[i][2];
                }
            }

            return answer;
        }
    

    public static int find( int x){
        if(parent[x] == x){
            return x;
        }
        return find(parent[x]);
    }

    public static void union(int x, int y){
        int a = find(x);
        int b = find(y);
        parent[a] = b;
    }
    
}
