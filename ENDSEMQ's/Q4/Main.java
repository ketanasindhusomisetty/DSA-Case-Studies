import java.util.*;

class Edge {

    int to, weight;

    Edge(int t, int w) {
        to = t;
        weight = w;
    }
}

public class Main {

    static final int V = 7;

    static void addEdge(List<List<Edge>> graph, int u, int v, int w) {

        graph.get(u).add(new Edge(v, w));
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

        System.out.println("Minimum toll costs from KIR:");

        for (int i = 0; i < V; i++) {

            System.out.println("Node " + i + " : " + dist[i]);
        }
    }

    public static void main(String[] args) {

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        addEdge(graph, 0, 1, 12);
        addEdge(graph, 0, 2, 15);
        addEdge(graph, 1, 3, 18);
        addEdge(graph, 2, 4, 14);
        addEdge(graph, 3, 5, 20);
        addEdge(graph, 4, 5, 16);
        addEdge(graph, 5, 6, 10);

        dijkstra(graph, 0);
    }
}