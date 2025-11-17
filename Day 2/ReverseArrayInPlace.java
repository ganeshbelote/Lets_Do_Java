public class ReverseArrayInPlace {
    int[] arr;

    public ReverseArrayInPlace(int[] inp){
        this.arr = inp;
    }

    public void reverseInPlace(){
        int start = 0;
        int end = this.arr.length - 1; // dont use this.arr else use direct arr as there is no variable shadowing here it means that no same name variable assigned to each other OR we don't have mention object here.

        while(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            end--;
            start++;
        }
    }

    public void printArray(){
        String res = "";

        System.out.println("Array : ");
        for(int i = 0; i < this.arr.length; i++){ // same here
            res = res + Integer.toString(arr[i]) + " ";
        }

        System.out.println(res);
    }

    public static void main(String[] args){
        ReverseArrayInPlace a = new ReverseArrayInPlace(new int[]{1, 2, 3, 4, 5});
        a.printArray();
        a.reverseInPlace();
        a.printArray();
    }
}
