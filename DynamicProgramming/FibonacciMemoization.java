// Memoization (Top Down)

public class FibonacciMemoization {

	final int MAX = 100; // it will accept some limited values
	final int NIL = -1;

	int[] lookUp = new int[MAX];

	// initializing all values as NIL
	void initialize() {
		for (int i = 0; i < MAX; i++)
			lookUp[i] = NIL;
	}

	// function for nth Fibonacci number
	int fibo(int n) {

		if (lookUp[n] == NIL) {
			if (n <= 1)
				lookUp[n] = n;
			else
				lookUp[n] = fibo(n - 1) + fibo(n - 2);
		}
		return lookUp[n];
	}

	public static void main(String[] args) {

		FibonacciMemoization fib = new FibonacciMemoization();
		fib.initialize();
		System.out.println("5th Fibonacci Number is: " + fib.fibo(5));
		System.out.println("30th Fibonacci Number is: " + fib.fibo(30));
		System.out.println("6th Fibonacci Number is: " + fib.fibo(6));
		System.out.println("40th Fibonacci Number is: " + fib.fibo(40));

	}

}
