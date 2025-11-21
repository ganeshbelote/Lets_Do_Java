//Count the vowels in a string
// Input: "education"

import java.util.HashMap;

public class CountVowels {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String word = "giaaeeprooo";

        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(map);
    }
}
