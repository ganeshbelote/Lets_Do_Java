import java.util.Arrays;
import java.util.List;

public class ChnageTypeOfList {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(ints); //Arrays.asList() : List --> Array

        List<Double> res = list.stream().map(el -> el.doubleValue()).toList();
        System.out.print(res);
    }
}
