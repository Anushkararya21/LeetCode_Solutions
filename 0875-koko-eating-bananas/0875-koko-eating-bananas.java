class Solution {
    public int minEatingSpeed(int[] arr, int hours) {
        int l = 1;
        int h = 0;
        for(int n : arr){
            h = Math.max(h,n);
        }
        while(l <= h){
            int mid = l + (h-l)/2;
            long ho = 0;
            for(int n : arr){
                ho += (n + mid -1)/mid;
            }
            if(ho <= hours){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}