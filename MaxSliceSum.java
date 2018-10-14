import java.util.*;

class Solution {
    public int solution(int[] A) {
        int maxEnd = A[0];
        int maxTemp = A[0];
        for(int i=1;i<A.length;i++){
            maxEnd = Math.max(maxEnd+A[i], A[i] );
            maxTemp = Math.max(maxEnd, maxTemp);
        }
        return maxTemp;
    }
}
