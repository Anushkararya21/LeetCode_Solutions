class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ar = {-1,-1};
        long max = Long.MIN_VALUE;
        for(int i =0; i < nums.length;i++){
            for(int j = 0; j < nums.length; j++){
                if(i==j) continue;
                if(nums[i] + nums[j] == target && nums[i] > nums[j]){
                    long l = (long)(nums[i]*nums[j]);
                    if(l > max ){
                        max = l;
                        ar = new int[]{i,j};
                    }
                }
            }
        }
        return ar;
    }
}