import java.util.*;

class SingleNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: " );
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The single element: "+ singleNumber(arr));
        sc.close();
    }

   static int singleNumber(int[] arr){
    int maxSize = arr[0];
    for(int index = 0; index < arr.length; index++){
        maxSize = Math.max(maxSize, arr[index]);
    }
    int[] hash = new int[maxSize + 1];
    for(int index = 0; index < arr.length; index++){
        hash[arr[index]]++;
    }
    for(int index = 0; index < arr.length; index++){
        if(hash[arr[index]] == 1){
            return arr[index];
        }
    }
    return -1;
   }

}