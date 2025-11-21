import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveDuplicates{
    public static void main(String[] args) {
        Integer[] arr = {2,3,3,5,7,7,9}; // => {2,3,5,7,9}
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> set = new HashSet<Integer>(list);  
        System.out.println(set);
    }
}