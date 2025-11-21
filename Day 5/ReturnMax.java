import java.util.HashMap;

public class ReturnMax {
    public static void main(String[] args) {
        Integer[] arr = {1,1,2,3,3,3,4};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer max = 0;
        Integer appearance = map.get(arr[0]);

        for(int i = 1; i < arr.length; i++){
            Integer num = arr[i];
            if(appearance < map.get(num)){
                max = map.get(num);
            }
        }

        System.out.println(max);
    }
}
