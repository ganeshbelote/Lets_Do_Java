import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        String str1 = "silent";
        String str2 = "listen";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for (char ch : str1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        System.out.print(map1.equals(map2));
    }
}
