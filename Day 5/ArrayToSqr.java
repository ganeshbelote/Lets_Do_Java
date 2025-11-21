import java.util.Arrays;
import java.util.List;

public class ArrayToSqr {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        List<Integer> list = Arrays.asList(arr);

        List<Integer> newlist = list.stream().map(el ->(el * el)).toList();

        System.out.println(list);
        System.out.println(newlist);
    }
}
