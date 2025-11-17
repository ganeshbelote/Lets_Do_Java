public class SecondLargest {
    int[] arr;

    public SecondLargest(int[] inp){
        this.arr = inp;
    }

    public void findSecondLargest(){
        int largest = arr[0];
        int secondLargest = 0;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num < largest && num > secondLargest){ // condition because what if largest number initially get assigned to largest element then it just ignores condition(num > largest) for all further elements.
                secondLargest = num;
            }
        }
        System.out.println("Second largest element is :" + secondLargest);
    }

    public void printArray(){
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        SecondLargest a = new SecondLargest(new int[]{10,7,1,4,9,3});
        a.findSecondLargest();
    }
}
