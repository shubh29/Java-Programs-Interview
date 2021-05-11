
public class Fibonacci {

	static void fibonacciSequence(int N) {
		int n1 = 0, n2 = 1, counter = 0;
		while (counter < N) {
			System.out.println(n1+ " ");
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			counter = counter + 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		fibonacciSequence(N);
	}

}
