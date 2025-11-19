import java.util.Arrays;
import java.util.HashMap;

class CountFreq {
    public static void main(String[] args) {
        String sentence = "hello world hello java world java java";
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String[] list = sentence.split(" ");
        Arrays.asList(list).stream()
                .forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));

        System.out.println(map);
    }
}