import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals(".")) break;
            System.out.println(Solution(line));
        }
    }
    public static String Solution(String str) {
        Stack<Character> st = new Stack<>();
       for(int i= 0; i < str.length(); i++){
           char ch = str.charAt(i);
           if(ch == '(' || ch == '['){
               st.push(ch);
           }

           else if(ch == ')'){
               if(st.isEmpty() || st.peek() != '('){
                   return "no";
               }else st.pop();
           }
           else if(ch ==']'){
               if(st.isEmpty() || st.peek() != '['){
                   return "no";
               }else st.pop();
           }
       }
        if(st.isEmpty()) return "yes";
        else return "no";
    }

}
