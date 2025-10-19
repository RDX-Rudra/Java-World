import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph3CycleDet { // Cycle Detection in Directed Graph using DFS
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static boolean isCycleDect(ArrayList<Edge>[] graph, boolean[] visited, int curr, boolean[] recStack){
        visited[curr] = true;
        recStack[curr] = true;

        for(Edge e: graph[curr]){
            if(!visited[e.dest]){
                if(isCycleDect(graph, visited, e.dest, recStack)){
                    return true;
                }
            } else if(recStack[e.dest]){
                return true;
            }
        }
        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        // using Adjacency List
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[v];

        createGraph(graph);

        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        // System.out.println(isCycleDect(graph, visited, 0, recStack));

        for(int i=0; i<v; i++){
            if(!visited[i]){
                if(isCycleDect(graph, visited, i, recStack)){
                    System.out.println("Cycle detected");
                    return;
                }
            }
        } 
    }
}
