import java.util.*;

class Main {

    private int time = 0;

    void SCCUtil(int u, int[] disc, int[] low,
                 Stack<Integer> stackMember,
                 boolean[] stack,
                 List<List<Integer>> adj) {

        disc[u] = low[u] = ++time;

        stackMember.push(u);
        stack[u] = true;

        for (int v : adj.get(u)) {

            if (disc[v] == -1) {
                SCCUtil(v, disc, low, stackMember, stack, adj);

                low[u] = Math.min(low[u], low[v]);
            }

            else if (stack[v]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        int w = -1;

        if (low[u] == disc[u]) {

            System.out.print("SCC: ");

            while (w != u) {

                w = stackMember.pop();

                System.out.print("m" + (w + 1) + " ");

                stack[w] = false;
            }

            System.out.println();
        }
    }

    void SCC(List<List<Integer>> adj, int V) {

        int[] disc = new int[V];
        int[] low = new int[V];

        boolean[] stack = new boolean[V];

        Stack<Integer> stackMember = new Stack<>();

        Arrays.fill(disc, -1);

        for (int i = 0; i < V; i++) {

            if (disc[i] == -1) {
                SCCUtil(i, disc, low, stackMember, stack, adj);
            }
        }
    }

    public static void main(String[] args) {

        int V = 8;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(5).add(3);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(7).add(6);

        Main g = new Main();

        System.out.println("Strongly Connected Components:");

        g.SCC(adj, V);
    }
}