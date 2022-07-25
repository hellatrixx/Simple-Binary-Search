import java.util.Arrays;

public class BinarySearch {
    public static int[] nums = {-1,0,3,5,9,12};
    public static int target = 9;

    public static void main(String[] args) {
        System.out.println("Target: " + target);
        System.out.println( Arrays.toString(nums));
        System.out.println("position: " + search(nums, target));
    }


    public static int search(int nums[], int target){
        int pivot, left = 0, right = nums.length - 1;

        while(left <= right) {
            pivot = left + (right - left) / 2;      //pivot always starts in the middle
            if (nums[pivot] == target) return pivot;        // if pivot equals the target just return pivot
            if (nums[pivot] > target) right = pivot - 1;        // if pivot is larger than the target, reduce the right and search left
            else left = pivot + 1;      // else if pivot is smaller than target increase the left and search in the right;
        } return -1;        // return -1 if the target doesn't exist in the array
    }
}
