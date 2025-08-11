import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Node[] arr = new Node[N];
        Long[] resultArr = new Long[N];
        st = new StringTokenizer(br.readLine());
        Deque<Node> deque = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            arr[i] = new Node(i+1, Integer.parseInt(st.nextToken()));
        }


        for(int i = 0; i< N; i++){
//            덱의 마지막에 now보다 큰값 제거하기
            Node now =  arr[i];
            while(!deque.isEmpty()) {
                Node last = deque.peekLast();
                if(now.getV() <= last.getV()){
                    deque.pollLast();
                }else{
                    break;
                }
            }
//                    덱의 마지막 위치에 now값 저장하기
            deque.addLast(now);
//                    덱의 1번째ㅐ 위치에서부터 L의 범위를 벗어난 값 을 덱에서 제거하기
            int idx = i - M + 1;
            Node first = deque.peekFirst();
           if(first.getIdx() <= idx) deque.pollFirst();
//                    덱의 1번째 데이터 출력하기
            sb.append(deque.peekFirst().getV() + " ");
        }
        System.out.println(sb.toString());

    }

    public static class Node{
        long idx;
        long v;

        public Node(long idx, long v) {
            this.idx = idx;
            this.v = v;
        }

        public long getIdx() {
            return idx;
        }

        public void setIdx(long idx) {
            this.idx = idx;
        }

        public long getV() {
            return v;
        }

        public void setV(long v) {
            this.v = v;
        }
    }
}
