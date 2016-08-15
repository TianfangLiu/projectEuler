
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		System.out.println(Math.E);
		int count = 0;
		for (long i=1; i<100; i++) {
			if (isPrime(i))
				count++;
		}
		System.out.println(count);
		
	}
	
	private static boolean isPrime(long x) {
		if (x <= 1) return false;
		if (2 == x) return true;
		if (x%2 == 0) return false;
		for (long i=3; i*i<=x; i+=2) {
			if (x%i == 0) return false;
		}
		return true;
	}

}
