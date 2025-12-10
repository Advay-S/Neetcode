import java.util.*;



public class KclosestPointsFromOrigin {

    private int distance(int[] p){
        return p[0] * p[0] + p[1] * p[1];
    }
    public int[][] kClosest(int[][] points, int k) {
int[][] result = new int[][];

//this is to decide which number goes in first ....if the result is negative , a is given priority and if it is positive , then b is given priority .......... this is a max heap bro , where the greater number bubbles to the top
PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> distance(b) - distance(a));

for (int[] xyz : points){
    maxHeap.add(xyz);

    if(maxHeap.size() > k){
        maxHeap.poll();
    }
}
 for(int w = 0 ; w < k ; k++){
     result[w] = maxHeap.poll();
 }

return result;
}

    }

