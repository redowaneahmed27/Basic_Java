package important;

public class BinarySearch {
    public static void main(String[] args) {
int [] numbers = {10,20,30,40,50,60,70};
int index = binarySearch(numbers, 10);
        System.out.println(index);
    }

    public static int binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length - 1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (numbers[mid]== value){
                return mid;
            }
            if (value>numbers[mid]) {
                //right
                low=mid+1;

            }
            else{
                high= mid-1; // left

            }

        }
        return -1;

    }
}
