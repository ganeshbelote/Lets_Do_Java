public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 3, 22, 22, 15, 7};
        int largest = arr[0];
        int secLargest = 0;

        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            }else if(num < largest && num > secLargest){
                secLargest = num;
            }
        }

        System.out.println("Second largest number is " + secLargest);
    }
}
