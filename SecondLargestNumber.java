import java.util.*;
class SecondLargestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The second Largest Element is:" + findSecondLargest(arr));
        sc.close();
    }

    static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i: arr){
            if(i > largest){
                second = largest;
                largest = i;
            }
            else if(i < largest && i > second){
                second = i;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No second largest element found.");
            return -1;
        }
        return second;
    }
}

// Time complexity:  O(N) (Linear Time)

