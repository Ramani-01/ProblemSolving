import java.util.*;

class SecondSmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Second Smallest Number: "+ findSecondSmallest(arr));
    }

    static int findSecondSmallest(int[] arr){
        int ssmallest = -1;
        int smallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
}