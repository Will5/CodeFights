package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class CoolNumber extends CodeFightsChallenge {

	// https://codefights.com/challenge/CatFGCa9NXsZbCJxB

	protected static String TAG = CoolNumber.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "coolNumber(1)", coolNumber(1), "false");
		printExampleCase(TAG, 2, "coolNumber(2)", coolNumber(2), "true");
		printExampleCase(TAG, 3, "coolNumber(6)", coolNumber(6), "true");
		printExampleCase(TAG, 4, "coolNumber(8)", coolNumber(8), "false");

		// Test Cases
		printTestCase(TAG, 1, "n: 1", coolNumber(1), "false");
		printTestCase(TAG, 2, "n: 3", coolNumber(3), "true");
		printTestCase(TAG, 3, "n: 4", coolNumber(4), "false");
		printTestCase(TAG, 4, "n: 5", coolNumber(5), "true");
		printTestCase(TAG, 5, "n: 971", coolNumber(971), "true");
		printTestCase(TAG, 6, "n: 991", coolNumber(991), "true");
		printTestCase(TAG, 7, "n: 983", coolNumber(983), "true");
	}

	static boolean coolNumber(int n) {
		int s = 0, i = 0;

		for (; ++i < n; )
			s += n % i == 0 ? i : 0;

		return s != 0 && n % s == 0;
	}

}
