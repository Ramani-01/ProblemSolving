import java.util.*;

public class SingleNumberHashMap {
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

    static Long singleNumber(int[] nums){
        HashMap<Long, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int value = map.getOrDefault(nums[index], 0);
            map.put((long) nums[index], value + 1);
        }

        for(Long key:map.keySet()){
            if(map.get(key)== 1){
                return key;
            }
        }
        return Long.MAX_VALUE;
    }
}
    


