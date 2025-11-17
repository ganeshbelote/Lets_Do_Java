import java.util.Arrays;

class ArrayToString{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String[] strArray = new String[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            strArray[i] = Integer.toString(arr[i]);
        }

        System.out.println(Arrays.toString(strArray));
    }
}