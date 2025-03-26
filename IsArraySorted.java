import java.util.*;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println(isSorted(arr));
        sc.close();
    }

    static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
        
    }
}
