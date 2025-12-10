import java.util.HashSet;


class ContainsDuplicate{

 public boolean containsDuplicate(int[] nums) {

    HashSet hset = new HashSet<>();
    
    for(int i = 0 ; i < nums.length ; i++){
        hset.add(nums[i]);

        if(hset.contains(nums[i])){
            return true; 
        }
        else hset.add(nums[i]);
    }

   if(hset.size() != nums.length){
    }
    return false  ;
   }
   
}

