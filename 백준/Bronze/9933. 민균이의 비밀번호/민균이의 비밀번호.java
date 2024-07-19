import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String,String> map = new HashMap<>();

        for(int i = 0; i< n; i ++){
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            char[] charArray = s.toCharArray();
            for(int j = charArray.length-1 ; j > -1 ; j-- ){
                sb.append(charArray[j]);
            }
            String result =  s.length() + " " + s.charAt((s.length()-1 )/2);
            if(!map.isEmpty() && map.containsKey(s) || s.equals(sb.toString())){
                System.out.println(result);
                break;
            }else {
                map.put(sb.toString(), result);
            }
        }
    }
}
