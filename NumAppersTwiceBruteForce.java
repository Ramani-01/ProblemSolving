import java.util.Scanner;

public record NumAppersTwiceBruteForce() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter"+ size+" elements: " );
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The single element: "+ singleNumber(arr));
        sc.close();
    }

    static int singleNumber(int[] nums){
        for(int index = 0; index < nums.length; index++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[index] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[index];
            }
            
        }
        return -1;
    }
}
