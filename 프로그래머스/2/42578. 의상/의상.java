import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
           int answer = 1;
            Map<String, Integer> map = new HashMap<>();
            for (String[] clothe : clothes) {
                if(!map.containsKey(clothe[1])) map.put(clothe[1], 1);
                else map.put(clothe[1], map.get(clothe[1]) + 1);
            }
            for (String s : map.keySet()) {
                answer *= map.get(s) + 1;
            }

            return answer-1;
    }
}