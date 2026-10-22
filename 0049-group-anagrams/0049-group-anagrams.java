

class Solution {

    public List<List<String>> groupAnagrams( String[] strs ) {

        Map<String , List<String>> map = new HashMap<>() ;

        for ( int i = 0 ; i < strs.length ; i++ ) {

            String s = strs[i] ;
            char[] arr = s.toCharArray() ;
            Arrays.sort( arr ) ;
            String key = new String( arr ) ;

            if ( map.containsKey( key ) == false ) {
                map.put( key , new ArrayList<>() ) ;
            }

            map.get( key ).add( s ) ;
        }

        List<List<String>> ans = new ArrayList<>( map.values() ) ;

        return ans ;
    }
}