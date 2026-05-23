public class Main {

    static int rodCutting(int[] price, int n) {

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int best = -1;

            for (int j = 1; j <= i; j++) {

                best = Math.max(best, price[j] + dp[i - j]);
            }

            dp[i] = best;
        }

        System.out.println("DP Table:");

        for (int i = 0; i <= n; i++) {
            System.out.println("dp[" + i + "] = " + dp[i]);
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

        int n = 10;

        int result = rodCutting(price, n);

        System.out.println("\nMaximum Revenue: " + result);
    }
}