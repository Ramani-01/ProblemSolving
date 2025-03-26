import java.util.*;

class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        } 
        int newlength = removeDuplicates(arr);
        for(int i = 0; i < newlength; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    static int removeDuplicates(int[] arr){
        int i = 0;
        for(int j = 1; j <arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                
            }
            else if(arr[i] == arr[j]){
                j++;
            }
        }
        return i+1;
    }
}