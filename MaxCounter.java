//only 77 %
import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int maxRes = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] <= N && A[i]>0){
                result[A[i]-1] = result[A[i]-1] +1;
                maxRes = Math.max(maxRes,result[A[i]-1]);
            }
            if(A[i]>N){
                //System.out.println(A[i] +" | max = "+maxRes);
                int[] T = new int[N];
                Arrays.fill(T,maxRes);
                result = T;
            }
            //System.out.println(Arrays.toString(result));
        }
        
        return result;
    }
}
