class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = 5;
        int actualSum  = 0;
        int ExepectedSum =  (n* (n + 1)) / 2;
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }
        System.out.println(arr.length + 1);
        System.out.println(ExepectedSum - actualSum);

        
        }
    }
