import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroToEnd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(nums));
        moveZeroes(nums);

        // Displaying the result
        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));

        sc.close();
      }
        static void moveZeroes(int[] nums) {
            int j = 0, i = -1, len = nums.length;
            
            while (j < len) {
                if (nums[j] != 0) {
                    i++;
                    nums[i] = nums[j];
                }
                j++;
            }
            for (int index = i + 1; index < len; index++) {
                nums[index] = 0;
            }
        }
  }

