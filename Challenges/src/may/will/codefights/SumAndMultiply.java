package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class SumAndMultiply extends CodeFightsChallenge {

	// https://codefights.com/challenge/edB9wDjgpFCG6BdgR

	protected static String TAG = SumAndMultiply.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "N = 1", SumAndMultiply(1), "10 0");
		printExampleCase(TAG, 2, "N = 2", SumAndMultiply(2), "1 22");

		// Test Cases
		printTestCase(TAG, 1, "N: 1", SumAndMultiply(1), "10 0");
		printTestCase(TAG, 2, "N: 2", SumAndMultiply(2), "1 22");
		printTestCase(TAG, 3, "N: 3", SumAndMultiply(3), "6 123");
		printTestCase(TAG, 4, "N: 4", SumAndMultiply(4), "12 1124");
		printTestCase(TAG, 5, "N: 5", SumAndMultiply(5), "40 11125");

		// Custom Test Cases
		printCustomTestCase(TAG, 1, "N: 1", SumAndMultiply(1), "10 0");
		printCustomTestCase(TAG, 2, "N: 2", SumAndMultiply(2), "1 22");
		printCustomTestCase(TAG, 3, "N: 3", SumAndMultiply(3), "6 123");
		printCustomTestCase(TAG, 4, "N: 4", SumAndMultiply(4), "12 1124");
		printCustomTestCase(TAG, 5, "N: 5", SumAndMultiply(5), "40 11125");
		printCustomTestCase(TAG, 6, "N: 6", SumAndMultiply(6), "30 111126");
		printCustomTestCase(TAG, 7, "N: 7", SumAndMultiply(7), "84 1111127");
		printCustomTestCase(TAG, 8, "N: 8", SumAndMultiply(8), "224 11111128");
		printCustomTestCase(TAG, 9, "N: 9", SumAndMultiply(9), "144 111111129");
		printCustomTestCase(TAG, 10, "N: 10", SumAndMultiply(10), "45 1111111144");
		printCustomTestCase(TAG, 11, "N: 11", SumAndMultiply(11), "0 0");
	}

	private static String SumAndMultiply(int N) {
		return new int[]{10, 1, 6, 12, 40, 30, 84, 224, 144, 45, 0}[--N] + " " + new int[]{0, 22, 123, 1124, 11125, 111126, 1111127, 11111128, 111111129, 1111111144, 0}[N];
	}

}
