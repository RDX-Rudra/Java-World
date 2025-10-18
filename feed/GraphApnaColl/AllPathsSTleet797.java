import java.util.ArrayList;
import java.util.List;

public class AllPathsSTleet797 {
    private void dfs(int[][] graph, int curr, int dest, List<Integer> path, List<List<Integer>> result) {
        if (curr == dest) {
            result.add(new ArrayList<>(path)); // deep copy
            return;
        }
        for (int neighbor : graph[curr]) {
            path.add(neighbor);
            dfs(graph, neighbor, dest, path, result);
            path.remove(path.size() - 1); // backtrack
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        if (graph == null || graph.length == 0) return result;

        List<Integer> path = new ArrayList<>();
        path.add(0); // start from node 0
        dfs(graph, 0, graph.length - 1, path, result);
        return result;
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        AllPathsSTleet797 obj = new AllPathsSTleet797();
        List<List<Integer>> paths = obj.allPathsSourceTarget(graph);
        System.out.println(paths); // Output: [[0, 1, 3], [0, 2, 3]]
    }
}
