import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for(int i = N-1 ; i >= 0; i --){
            int index = Integer.parseInt(s[i]);
            list.add(index,i+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i + " ");
        }

        System.out.println(sb);

    }
}
