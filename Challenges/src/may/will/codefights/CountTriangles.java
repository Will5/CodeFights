package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class CountTriangles extends CodeFightsChallenge {

	// https://codefights.com/challenge/KTnxgDd3BmiHcsH7K

	protected static String TAG = CountTriangles.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "countTriangles(2)", countTriangles(2), "5");
		printExampleCase(TAG, 2, "countTriangles(3)", countTriangles(3), "13");

		// Test Cases
		printTestCase(TAG, 1, "N: 1", countTriangles(1), "1");
		printTestCase(TAG, 2, "N: 2", countTriangles(2), "5");
		printTestCase(TAG, 3, "N: 3", countTriangles(3), "13");
		printTestCase(TAG, 4, "N: 5", countTriangles(5), "48");

		// Custom Test Cases
		printCustomTestCase(TAG, 1, "N: 1", countTriangles(1), "1");
		printCustomTestCase(TAG, 2, "N: 2", countTriangles(2), "5");
		printCustomTestCase(TAG, 3, "N: 3", countTriangles(3), "13");
		printCustomTestCase(TAG, 4, "N: 4", countTriangles(4), "27");
		printCustomTestCase(TAG, 5, "N: 5", countTriangles(5), "48");
	}

	static int countTriangles(int N) {
		return N * (N + 2) * (2 * N + 1) / 8;
	}

}
