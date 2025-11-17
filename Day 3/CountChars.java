public class CountChars {
    public static void main(String[] args) {
        String str = "I am learning Java right now";
        int count = 0;

        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) != ' '){
                count += 1;
            }
        }

        System.out.println("Count of characters: " + count);
    }
}
