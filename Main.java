package ExponentiationMod;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Result is" + exponentiationMod(5, 10, 7));
		System.out.println("Result is" +exponentiationMod(3, 7, 11));
		System.out.println("Result is" +exponentiationMod(2, 62, 13));
		
	}
	
//	public static long exponentiationMod(long base, long exponent, long modulus) {
//		long result = 1;
//		while(exponent >0) {
//			result *= base;
//			result %= modulus;
//			exponent--;
//		}
//		return result;
//	}
	
	//This is the method with binary expansion
	public static long exponentiationMod(long base, long exponent, long modulus) {
		
		long res = 1;
	    base %= modulus; 
	 
	    if (base == 0)
	      return 0;
	 
	    // This is binary expansion loop
	    while (exponent > 0) 
	    {
	      if ((exponent & 1) != 0)
	        res = (res * base) % modulus;
	 
	      exponent = exponent >> 1;
	      base = (base*base) % modulus;
	    }
	    return res;
	}

}
