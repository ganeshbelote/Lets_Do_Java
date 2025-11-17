import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,3,4,4,5}; // Dont use primitive type like int[] here as Arrays.asList does not support as Collections dont support primitives.
        List list = Arrays.asList(arr);
        Set set = new HashSet<Integer>(list);
        System.out.println(set);
    }
}
