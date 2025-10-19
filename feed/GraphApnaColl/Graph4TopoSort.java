import java.util.ArrayList;
import java.util.Stack;

public class Graph4TopoSort {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topoSort(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
        visited[curr] = true;
        for(Edge e: graph[curr]){
            if(!visited[e.dest]){
                topoSort(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        // using Adjacency List
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[v];

        createGraph(graph);
        boolean[] visited = new boolean[v];

        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                topoSort(graph, i, visited, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
