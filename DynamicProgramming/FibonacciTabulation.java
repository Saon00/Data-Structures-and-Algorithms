
public class FibonacciTabulation {

    public int CalculateFibonacci(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];

        //base case
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    public static void main(String[] args) {

        FibonacciTabulation fibo = new FibonacciTabulation();

        // for getting the time difference
        long start = System.currentTimeMillis();

        System.out.println("5th Fibonacci Number is: " + fibo.CalculateFibonacci(5));
        System.out.println("30th Fibonacci Number is: " + fibo.CalculateFibonacci(30));
        System.out.println("6th Fibonacci Number is: " + fibo.CalculateFibonacci(6));
        System.out.println("40th Fibonacci Number is: " + fibo.CalculateFibonacci(40));

        long end = System.currentTimeMillis();
        System.out.println("Execution time in milliseconds: " + (end - start));
    }
}
