import java.util.PriorityQueue;

public class p17_2 {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int len=heights.length;
        int maxBricksNeeded=0;
        for (int i=1;i<len;i++)
            if (heights[i]>heights[i-1])
                maxBricksNeeded+=heights[i]-heights[i-1];
        if (bricks>=maxBricksNeeded) return len-1;

        PriorityQueue<Integer> pq = new PriorityQueue<>((i1,i2)->{return i2-i1;});
        int max=0;
        for (int i=max;i<len;i++) {
            max=i;     
            if (i<len-1 && heights[i+1]>heights[i]) {
                int needed=heights[i+1]-heights[i];
                if (bricks<needed) {
                    if (ladders>0) {
                        if (!pq.isEmpty()) {
                            int height=pq.peek();
                            if (height>needed) {
                                pq.poll();
                                bricks+=height-needed;
                                pq.offer(needed);
                            }
                        }
                        ladders--;
                    } else break;                   
                } else {
                    bricks-=needed;
                    pq.offer(needed);                    
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] heights = {4,12,2,7,3,18,20,3,19};
        int bricks = 10, ladders = 2;
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }
}
