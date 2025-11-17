import java.util.HashMap;

class CountFreq {
    public HashMap<Character, Integer> countFreq(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);

            if (map.containsKey(ch)) {
                Integer count = map.get(ch);
                map.put(ch, (count + 1));
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String Example = "madam";
        CountFreq obj = new CountFreq();
        HashMap<Character, Integer> ans = obj.countFreq(Example);
        System.out.println(ans);
    }
}