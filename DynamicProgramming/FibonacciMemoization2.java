
public class FibonacciMemoization2 {

    public int CalculateFibonacci(int n) {

        int[] memoize = new int[n + 1];
        return CalculateFibonacciRecursive(memoize, n);
    }

    public int CalculateFibonacciRecursive(int[] memoize, int n) {

        if (n < 2)
            return n;

        memoize[n] = CalculateFibonacciRecursive(memoize, n - 1) + CalculateFibonacciRecursive(memoize, n - 2);
        return memoize[n];
    }

    public static void main(String[] args) {

        FibonacciMemoization2 fibo = new FibonacciMemoization2();

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
