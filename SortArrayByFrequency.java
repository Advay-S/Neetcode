package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class SortArrayByFrequency {

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int xy : nums){
            freq.put(xy , freq.getOrDefault(xy, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int i = 0 ; i <= nums.length; i++){
            buckets[i] = new ArrayList<>(); // here the index is the freq.
        }
        int[] result = new int[nums.length];
        for(int fq : freq.keySet()){
            buckets[freq.get(fq)].add(fq); // .get returns the value ...so the value is the index buckets[value].add(key)
        }
        int size = 0;
       for(int z = 0; z < nums.length ; z++){
           for(int dd : buckets[z]){
               for (int ww = 0 ; ww < freq.get(dd); ww++){
                   result[size++]  = dd;
               }
           }
       }
        System.out.println(Arrays.toString(result));
        return result;
        }


    public static void main(String[] args) {
        int[] a = {4 , 3 ,2 ,4 , 4, 5 ,6 , 5 ,5 ,4 , 4,4,4,3,3,2,3,2,6,7};
        SortArrayByFrequency SABF = new SortArrayByFrequency();
        SABF.frequencySort(a);
    }
}
