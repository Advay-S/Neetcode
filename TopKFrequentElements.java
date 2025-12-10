import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> mapOfElements = new HashMap<>();


    for(int i : nums){
       mapOfElements.put(i , mapOfElements.getOrDefault(i , 0) + 1) ;
    }
    //Till here i was able to count the elements and their freqeuncies and put in a map, forming a table


        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
         for(Map.Entry<Integer, Integer> ent : mapOfElements.entrySet()){
            pq.add(ent);

            if(pq.size() > k){
                pq.poll();
            }
         }

         int[] result = new int[k];
         for(int z = 0; z < k ; z++){
             result[z] = pq.poll().getKey();
         }

        return result;
    }
}
