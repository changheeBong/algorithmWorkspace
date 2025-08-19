
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        Index[] arr = new Index[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Index(Integer.parseInt(br.readLine()),i);
        }
        Arrays.sort(arr);
        for(int i = 0; i < N; i++){
            if(arr[i].idx-i > max) max = Math.max(max, arr[i].idx-i);
        }
        System.out.println(max+1);

    }

    public static class Index implements Comparable<Index>{

        int value;
        int idx;

        public Index(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }


        @Override
        public int compareTo(Index o) {
            return this.value - o.value;
        }
    }
}
