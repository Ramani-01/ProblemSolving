import java.util.Scanner;

public class SingleNumberXorr {
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

    static int singleNumber(int[] arr){
        int xorr = 0;   
        for(int index = 0; index < arr.length; index++){
            xorr = xorr ^ arr[index];
        }
        return xorr;
    }
}

