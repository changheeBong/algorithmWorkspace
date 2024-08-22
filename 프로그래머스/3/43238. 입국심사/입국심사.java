class Solution {
    public long solution(int n, int[] times) {
       long answer = 0;
            long sum = 0;
            long start = 0;
            long end = (long)n * 1000000000;
            for (int time : times) {
                sum += time;
            }

            while(start <= end){
                long half = (start+end) / 2;
                long temp = 0;
                for (int time : times) {
                    if(time != 0) temp += half / time;
                }
                if(temp < n){
                    start = half + 1;
                }else{
                    end = half - 1;
                }
            }
            return start;
    }
}