class Solution {
    public List<Boolean> kidsWithCandies(int[] arr , int k ) {
        List< Boolean > list = new ArrayList<>() ;
        int max = 0 ;
        for ( int i = 0 ; i < arr.length ; i++ ){
            max = Math.max( max , arr[i] ) ;
        }
        for ( int i = 0 ; i < arr.length ; i++ ){
           if ( arr[i] + k >= max ) list.add( true ) ;
           else list.add( false ) ;
        }
        return list ;
    } 
}