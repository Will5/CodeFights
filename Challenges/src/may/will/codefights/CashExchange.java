package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class CashExchange extends CodeFightsChallenge {

	// https://codefights.com/challenge/onpShQtAM5GZihvoH

	private static String TAG = CashExchange.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "n = 2, a = [1.5, 3.2], b = [1, 23.1]", CashExchange(2, new double[]{1.5, 3.2}, new double[]{1, 23.1}), "2310");

		// Test Cases
		printTestCase(TAG, 1, "n: 2, a: [1.5, 3.2], b: [1, 23.1]", CashExchange(2, new double[]{1.5, 3.2}, new double[]{1, 23.1}), "2310");
		printTestCase(TAG, 2, "n: 1, a: [1], b: [1]", CashExchange(1, new double[]{1}, new double[]{1}), "100");
		printTestCase(TAG, 3, "n: 2, a: [1.5, 3.2], b: [1, 23.1]", CashExchange(2, new double[]{1.5, 3.2}, new double[]{1, 23.1}), "2310");
		printTestCase(TAG, 4, "n: 3, a: [1, 100, 1], b: [100, 1, 100]", CashExchange(3, new double[]{1, 100, 1}, new double[]{100, 1, 100}), "1000000");
		printTestCase(TAG, 5, "n: 30, a: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], b: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]", CashExchange(30, new double[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new double[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}), "100");
	}

	private static double CashExchange(int n, double[] a, double[] b) {

//		/* Solution 1: */
//		Arrays.sort(a);
//		Arrays.sort(b);
//		return 100 / a[0] * b[--n];

//		/* Solution 2: */
//		--n;
//		double s = 100;
//		boolean f = a[n] < b[n];
//		for (int i = 0; i < n; i++) {
//			f = i % 2 == 0 ? a[n] < b[n] : f;
//			s = i % 2 == 0 ? s / (f ? a[n] : b[n]) : s * (f ? a[n] : b[n]);
//		}
//		return s;

//		/* Solution 3: */
//		--n;
//		double s = 100, h = 0;			// s : # of ruples. h : history
//		boolean f = a[n] < b[n];		// which exchange rate is better?
//		for (int i = 0; i < n; i++) {
//			f = i % 2 == 0 ? a[n] < b[n] : f;
//			
//			boolean x = false;
//			if ( i % 2 == 0 ) {
//				x = i % 2 == 0 ? h < ( f ? a[n] : b[n] ) : h > ( f ? a[n] : b[n] ) ;
//				h = x ? h : f ? a[n] : b[n];
//			}
//
//			if (x) {
//				h = h < ( f ? a[n] : b[n] ) ? h : f ? a[n] : b[n];
//				s = i % 2 == 0 ? s / h : s * h;
//			}
//		}
//		return s;

		return 0;

	}

}
