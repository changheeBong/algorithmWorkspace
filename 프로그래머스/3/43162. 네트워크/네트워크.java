import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue; 


class Solution{
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int answer;
        public int solution(int n, int[][] computers){
            answer = 0;
            visited = new boolean[n];
            list = new ArrayList[n];
            for(int i = 0; i < n; i ++){
                list[i] = new ArrayList<>();
            }

            for(int i = 0; i< n; i++) {
                for (int j = 0; j < n; j++) {
                    if(computers[i][j] == 1 && i != j)
                        list[i].add(j);
                }
            }

            for(int i = 0; i < n; i ++) {
                   BFS(i);
            }

            return answer;
        }


        static void BFS(int a){
            if(visited[a]) return;
            Queue<Integer> qe = new LinkedList<>();
            answer++;
            qe.offer(a);
            visited[a] = true;
            while(!qe.isEmpty()){
                Integer poll = qe.poll();
                for (Integer i : list[poll]) {
                    if(!visited[i]){
                        visited[i] = true;
                        qe.offer(i);
                    }
                }
            }

        }



        }