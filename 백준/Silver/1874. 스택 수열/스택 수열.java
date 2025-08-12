import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < N ; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int i = 0;

            while(i < N) {
                if ((stack.isEmpty() || stack.peek() < arr[i]) && arr[i] <= N) {
                    stack.push(++idx);
                    sb.append("+\n");
                } else if (stack.peek() == arr[i]) {
                    stack.pop();
                    sb.append("-\n");
                    i++;
                }
                else {
                    idx+=10;
                    break ;
                }
            }
        if(idx != N) System.out.println("NO");
        else {
            System.out.println(sb.toString());
        }
    }
}
