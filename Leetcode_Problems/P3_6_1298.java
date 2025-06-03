import java.util.*;

public class P3_6_1298 {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        

        int candiesCount = 0;

        boolean[] visited = new boolean[status.length];

        for(int box: initialBoxes){
            //if(status[box] == 1){
                dfs(box, status, keys, containedBoxes, visited);
            //} 
        }

        for(int i = 0; i < candies.length; i++){
            if(visited[i] && status[i] == 1){
                candiesCount += candies[i];
            }
            
        }


        return candiesCount;
    }


    private void dfs(int box, int[] status, int[][] keys, int[][] containedBoxes, boolean[] visited){

        visited[box] = true;

        for(int key: keys[box]){
            if(key == box){
                continue;
            }
            status[key] = 1;
        }

        for(int bx: containedBoxes[box]){
            if(!visited[bx]){
                dfs(bx, status, keys, containedBoxes, visited);
            }
        }
    }

    public static void main(String[] args) {
        P3_6_1298 obj = new P3_6_1298();
        int[] status = {1, 0, 1, 0};
        int[] candies = {7, 5, 4, 100};
        int[][] keys = {{}, {}, {1}, {}};
        int[][] containedBoxes = {{1, 2}, {3}, {}, {}};
        int[] initialBoxes = {0};

        System.out.println(obj.maxCandies(status, candies, keys, containedBoxes, initialBoxes)); // Output: 112
    }
}
