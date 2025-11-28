import java.util.LinkedHashMap;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Character res = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("Character is " + res);
    }
}
