class MaxConsecutiveNum{
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        
        System.out.println(findMaxConsecutiveOnes(nums));
       
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;

        for(int num: nums){
            count = (num == 1) ? count + 1  : 0;
            if(count > maxCount){
                maxCount = count;
            }
        }
            return maxCount;
    }
}