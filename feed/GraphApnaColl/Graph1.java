import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph1 {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }


    public static void main(String[] args) {
        int v = 4;
        // using Adjacency List
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[v];

        createGraph(graph);

        for (Edge e : graph[2]) {
            System.out.println("Source: " + e.src + ", Destination: " + e.dest + ", Weight: " + e.wt);
        }

    }
}
