package test;

public class TestModular {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("El factorial de: " + n + " es : " + factorial(n));

	}
	
	private static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
