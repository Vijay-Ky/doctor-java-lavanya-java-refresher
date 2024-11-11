class P
{
	public static void main(String[] args)
	{
		int i = 1, k = 3, m = -2, n = 5;
		
		int j = ++i + i-- + k++ * --k + 
				++m - n-- + --n * k-- + 
				++i + --m + i++ + --k +
			    --n * k-- + ++i + --m + 
			    i-- + k++ * --k;

		System.out.println("i: " + i); // Value of i
		System.out.println("k: " + k); // Value of k
		System.out.println("m: " + m); // Value of m
		System.out.println("n: " + n); // Value of n
		System.out.println("j: " + j); // Value of j
	}
}
