import java.util.*;

class LeftRotateArrayByOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        rotateArray(arr);
        System.out.println("The Left Rotate Array By one" + Arrays.toString(arr));
    }

    static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1]; 
        }
        arr[arr.length -1] = temp;
    }

}