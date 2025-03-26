// DAY 3 

import java.util.*;
class LeftRotateByK {
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
        rotateLeft(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
    static void rotateLeft(int arr[], int k){
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];

        //store in the temp array to shift
        for(int index = 0; index < k; index++){
            temp[index] = arr[index];
        }

        // To shift the elements with in the array.
        for(int index = k; index < n; index++){
            arr[index - k] = arr[index];
        }

        // Copy back the elements from temp to the end of the arr
        for(int index = n - k; index < n;index++){
            arr[index] = temp[index -(n -k)];
        }
         
    }
   
    
}
