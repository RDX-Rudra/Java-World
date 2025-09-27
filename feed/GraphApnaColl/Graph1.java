import java.util.ArrayList;
import java.util.List;

public class Graph1 {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(List<ArrayList<Edge>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            graph.set(i, new ArrayList<Edge>());
        }

        graph.get(0).add(new Edge(0, 2));

        graph.get(1).add(new Edge(1, 2));
        graph.get(1).add(new Edge(1, 3));

        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 1));
        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int v = 4;
        List<ArrayList<Edge>> graph = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            graph.add(null);
        }

        createGraph(graph);

        for (Edge e : graph.get(2)) {
            System.out.println("Source: " + e.src + ", Destination: " + e.dest);
        }
    }
}
