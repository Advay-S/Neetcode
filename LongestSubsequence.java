package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.math.*;


public class LongestSubsequence {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0 ;
            int maxm = 1;

        int final_count = 1 ;

        HashSet<Integer> hs = new HashSet<>(); // removes duplicate
        Arrays.stream(nums).forEach(hs :: add);
        Integer[] newArr =hs.toArray(new Integer[0]);
        Arrays.sort(newArr); // sorts the array

        for(int i = 0 ; i < newArr.length - 1 ; i++){
            if(newArr[i + 1] == newArr[i] + 1){
                final_count ++;
                maxm = Math.max(maxm, final_count);
            }
            else final_count =1 ;


        }
return maxm;
    }

}
