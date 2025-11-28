import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String inp = "()[]{}";

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> list = new Stack<>();

        for (int i = 0; i < inp.length(); i++) {
            Character ch = inp.charAt(i);

            if (map.containsKey(ch)) {
                list.push(ch);
            } else {
                if (list.isEmpty()) {
                    System.out.println("Invalid string !");
                    return;
                }
                Character close = list.pop();
                if (ch != map.get(close)) {
                    System.out.println("Invalid string !");
                    return;
                }
            }
        }
        if (list.isEmpty()) {
            System.out.println("Valid string 👍");
            return;
        } else {
            System.out.println("Invalid string !");
            return;
        }
    }
}