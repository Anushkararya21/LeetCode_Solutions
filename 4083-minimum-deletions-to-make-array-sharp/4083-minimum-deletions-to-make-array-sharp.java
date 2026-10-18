class Solution {
    public int minDeletions(int[] nums) {
        if (nums.length == 1 ) return 0 ;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int count = 0 ;
        for ( int i = 0 ; i  <  list.size() - 1 ; i++ ){
            if ( list.get(i).equals(list.get(i + 1)) ){
                list.remove(i) ;
                i-- ;
                count++ ;
            }
        }
        return count ;
    }
}