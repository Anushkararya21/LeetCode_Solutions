class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0 , l = nums.length ;
        int[] arr = new int[ 101 ] ;
        for ( int i = 0 ; i < l ; i++ ){
            arr [ nums [ i ] ] ++ ;
        }
        for ( int i = 0 ; i <= 100 ; i++ ){
            if ( arr[ i ] == 1 ) sum = sum + i ;
        }
        return sum ;
    }
}