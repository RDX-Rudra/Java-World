public class P11_5_2923 {
    public static int findChampion(int[][] grid) {
        int n = grid.length;
        //just need to find any row which is having all 1 except where i==j.
        for(int i=0; i<n; i++){

            boolean champ = true;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(grid[i][j] == 0){
                    champ = false;
                    break;
                }
            }
            if(champ) return i; // team i beats all the other teams.
        }

        return -1; // maybe we must have one champion in this problem
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1},{1,0,1},{0,0,0}};
        int ans = findChampion(grid);
        System.out.println(ans);
    }
}
