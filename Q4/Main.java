import java.util.*;

class Edge {
    int to, weight;

    Edge(int t, int w) {
        to = t;
        weight = w;
    }
}

public class Main {

    static final int V = 8;

    static void addEdge(List<List<Edge>> graph, int u, int v, int w) {
        graph.get(u).add(new Edge(v, w));
        graph.get(v).add(new Edge(u, w));
    }

    static void dijkstra(List<List<Edge>> graph, int src) {

        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        dist[src] = 0;

        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int u = current[0];

            for (Edge e : graph.get(u)) {

                int v = e.to;
                int weight = e.weight;

                if (dist[u] + weight < dist[v]) {

                    dist[v] = dist[u] + weight;

                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        System.out.println("Shortest distances from CP:");

        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " : " + dist[i]);
        }
    }

    public static void main(String[] args) {

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        addEdge(graph, 0, 1, 15);
        addEdge(graph, 0, 2, 12);
        addEdge(graph, 0, 3, 18);
        addEdge(graph, 1, 4, 22);
        addEdge(graph, 2, 5, 16);
        addEdge(graph, 3, 6, 14);
        addEdge(graph, 4, 5, 10);
        addEdge(graph, 5, 7, 13);
        addEdge(graph, 6, 7, 25);

        dijkstra(graph, 0);
    }
}