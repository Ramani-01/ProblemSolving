import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        

        System.out.println("Enter the target: ");
        int k = sc.nextInt();
        int n = arr.length;
        reverse(arr, 0, k -1);
        reverse(arr, k, n -1);
        reverse(arr, 0, n -1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void reverse(int[] arr, int start, int end){
       while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;  
        start ++;
        end--;
       }
    }
}
