package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class EvenSubsets extends CodeFightsChallenge {

	// https://codefights.com/challenge/wLawe86ZaZrixm8dD

	protected static String TAG = EvenSubsets.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "EvenSubsets([1, 2, 3])", EvenSubsets(new int[]{1, 2, 3}), "1");
		printExampleCase(TAG, 2, "EvenSubsets([2, 3, 4])", EvenSubsets(new int[]{2, 3, 4}), "3");

		// Test Cases
		printTestCase(TAG, 1, "x: [1, 2, 3]", EvenSubsets(new int[]{1, 2, 3}), "1");
		printTestCase(TAG, 2, "x: [5, 7, 2, 3]", EvenSubsets(new int[]{5, 7, 2, 3}), "1");
		printTestCase(TAG, 3, "x: [5755, 2434, 22, 163, 9, 2]", EvenSubsets(new int[]{5755, 2434, 22, 163, 9, 2}), "7");
	}

	static int EvenSubsets(int[] x) {
		int c = 0, s = 0, n;

		for (int y : x) if (y % 2 == 0) c++;

		n = f(c);

		for (int i = c; i > 0; i--)
			s += (n / ((f(i) * f(c - i))));

		return s;
	}

	static int f(int j) {
		int k = 1;
		for (int i = j; i > 1; i--)
			k *= i;
		return k;
	}

}
