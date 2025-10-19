import java.util.ArrayList;

public class Graph5CycleDet {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));
    }

    public static boolean isCycleDectUnDirected(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent){
        visited[curr] = true;

        for(Edge e: graph[curr]){
            if(!visited[e.dest]){
                if(isCycleDectUnDirected(graph, visited, e.dest, curr)){
                    return true;
                }
            } else if(e.dest != parent && visited[e.dest]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 6;
        // using Adjacency List
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[v];

        createGraph(graph);

        boolean[] visited = new boolean[v];
        // System.out.println(isCycleDect(graph, visited, 0, recStack));

        System.out.println(isCycleDectUnDirected(graph, visited, 0, -1));
    }
}
