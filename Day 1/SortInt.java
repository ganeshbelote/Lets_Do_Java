import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortInt {
    public List<Integer> sort(Integer[] arr){
        List<Integer> newarr = Arrays.asList(arr);
        Collections.sort(newarr);
        return newarr;
    }
    public static void main(String[] args){
        SortInt obj = new SortInt();
        Integer[] arr = {11,-34,87,43,0};
        List<Integer> ans = obj.sort(arr);
        System.out.print(ans);
    }
}
