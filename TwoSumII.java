package ArraysAndHashing;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
int left = 0   ;
int right = numbers.length - 1 ;

int[] a = new int[2];

while(left < right){
    while(left < right && numbers[right] > target){
        right --;
    }
     while (left < right && numbers[left] + numbers[right] > target ){
         left++;
     }

     if(numbers[left] + numbers[right] == target){
         a[0] = left +1 ;
         a[1] = right + 1 ;
         return a;
     }
}
return a ;

    }
}
