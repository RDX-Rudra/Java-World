public class leetcode1 {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        
        for (int team = 0; team < n; team++) {
            boolean isChampion = true;
            
            for (int otherTeam = 0; otherTeam < n; otherTeam++) {
                if (team != otherTeam && grid[team][otherTeam] == 1) {
                    isChampion = false;
                    break;
                }
            }
            
            if (isChampion) {
                return team;
            }
        }
        
        return -1; // This should not happen based on the constraints
    }
    public class Main {
        public static void main(String[] args) {
            leetcode1 solution = new leetcode1();
    
            // Example 1
            int[][] grid1 = {{0, 1}, {0, 0}};
            int champion1 = solution.findChampion(grid1);
            System.out.println("Champion for Example 1: Team " + champion1);
    
            // Example 2
            int[][] grid2 = {{0, 0, 1}, {1, 0, 1}, {0, 0, 0}};
            int champion2 = solution.findChampion(grid2);
            System.out.println("Champion for Example 2: Team " + champion2);
        }
    }
    
}

