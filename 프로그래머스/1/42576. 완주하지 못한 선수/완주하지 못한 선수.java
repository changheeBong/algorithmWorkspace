import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
       String answer = "";
        int index = 0;

        Arrays.sort(participant);
        Arrays.sort(completion);

        while(true){
            if(index == participant.length-1){
                answer = participant[index];
                break;
            }
            else if (participant[index].equals(completion[index])){
                index++;
            }
            else{
                answer = participant[index];
                break;
            }
        }
        return answer;
    }
}