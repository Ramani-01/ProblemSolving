class findLargestNumber{
    public static void main(String[] args){
        int[] arr = {23, 67, 34, 99, 10};
        System.out.println(LargestNumber(arr));
    }
    static int LargestNumber(int[] arr){
        int largest = arr[0];

        for(int i: arr) {
            if(i > largest){
                largest = i;
            }  
        }
       return largest;
    }
}