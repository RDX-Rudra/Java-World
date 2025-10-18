import java.util.*;

public class HybridBananas {
    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Map<Integer, List<Edge>> graph = new HashMap<>();
        Map<Integer, Set<Integer>> nodeTrees = new HashMap<>();

        int treeId = 0;

        // Build graph
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine().trim();
            if (line.equals("break")) {
                treeId++;
                continue;
            }

            String[] parts = line.split("\\s+");
            List<Integer> nodes = new ArrayList<>();

            for (String p : parts) {
                int node = Integer.parseInt(p);
                nodes.add(node);
                nodeTrees.putIfAbsent(node, new HashSet<>());
                nodeTrees.get(node).add(treeId);
                graph.putIfAbsent(node, new ArrayList<>());
            }

            for (int j = 0; j < nodes.size() - 1; j++) {
                int u = nodes.get(j);
                int v = nodes.get(j + 1);
                graph.get(u).add(new Edge(v, 1)); // climb up
                graph.get(v).add(new Edge(u, 0)); // climb down
            }
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(minEnergy(graph, nodeTrees, start, end));
    }

    private static int minEnergy(Map<Integer, List<Edge>> graph,
                                 Map<Integer, Set<Integer>> nodeTrees,
                                 int start, int end) {

        Deque<Integer> dq = new ArrayDeque<>();
        Map<Integer, Integer> dist = new HashMap<>();

        for (int node : graph.keySet()) dist.put(node, Integer.MAX_VALUE);
        dist.put(start, 0);
        dq.add(start);

        while (!dq.isEmpty()) {
            int u = dq.pollFirst();
            int d = dist.get(u);

            if (!graph.containsKey(u)) continue;

            for (Edge e : graph.get(u)) {
                int v = e.to;
                int cost = e.cost;

                // Calculate switch tree penalty
                Set<Integer> treesU = nodeTrees.getOrDefault(u, Set.of());
                Set<Integer> treesV = nodeTrees.getOrDefault(v, Set.of());

                boolean shareTree = false;
                for (int t : treesU) {
                    if (treesV.contains(t)) {
                        shareTree = true;
                        break;
                    }
                }

                int totalCost = d + cost + (shareTree ? 0 : 1);

                if (totalCost < dist.get(v)) {
                    dist.put(v, totalCost);
                    if (cost == 0 && shareTree)
                        dq.addFirst(v);
                    else
                        dq.addLast(v);
                }
            }
        }

        return dist.getOrDefault(end, -1);
    }
}
