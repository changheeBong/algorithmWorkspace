
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = 1;
        int sum = 0;
        int result = 1;
        while(start != n){
            if(sum == n){
                sum += end;
                result++;
                end++;
            }else if(sum < n){
                sum+=end;
                end++;
            }else if( sum > n){
                sum-=start;
                start++;
            }
        }
        System.out.println(result);
    }
}
