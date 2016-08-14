package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class SoccerSuperstition extends CodeFightsChallenge {

	// https://codefights.com/challenge/RRFe66MNdgwokujxD/main

	protected static String TAG = SoccerSuperstition.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "soccerSuperstition(3, 2, 16)", soccerSuperstition(3, 2, 16), "27");

		// Test Cases
		printTestCase(TAG, 1, "n: 3, k: 2, t: 16", soccerSuperstition(3, 2, 16), "27");
		printTestCase(TAG, 2, "n: 3, k: 10, t: 17", soccerSuperstition(3, 10, 17), "1");
		printTestCase(TAG, 3, "n: 3, k: 1, t: 1", soccerSuperstition(3, 1, 1), "921");
		printTestCase(TAG, 4, "n: 3, k: 10, t: 10", soccerSuperstition(3, 10, 10), "46656");
		printTestCase(TAG, 5, "n: 3, k: 10, t: 12", soccerSuperstition(3, 10, 12), "9261");
		printTestCase(TAG, 6, "n: 3, k: 9, t: 15", soccerSuperstition(3, 9, 15), "216");
		printTestCase(TAG, 7, "n: 3, k: 5, t: 7", soccerSuperstition(3, 5, 7), "119580");
		printTestCase(TAG, 8, "n: 3, k: 1, t: 16", soccerSuperstition(3, 1, 16), "4");
		printTestCase(TAG, 9, "n: 3, k: 4, t: 17", soccerSuperstition(3, 4, 17), "1");
		printTestCase(TAG, 10, "n: 3, k: 8, t: 14", soccerSuperstition(3, 8, 14), "1000");
		printTestCase(TAG, 11, "n: 3, k: 3, t: 11", soccerSuperstition(3, 3, 11), "6937");
		printTestCase(TAG, 12, "n: 3, k: 2, t: 8", soccerSuperstition(3, 2, 8), "6309");
		printTestCase(TAG, 13, "n: 3, k: 7, t: 4", soccerSuperstition(3, 7, 4), "456001");
		printTestCase(TAG, 14, "n: 3, k: 8, t: 8", soccerSuperstition(3, 8, 8), "154107");
		printTestCase(TAG, 15, "n: 3, k: 7, t: 16", soccerSuperstition(3, 7, 16), "27");
	}

	static int soccerSuperstition(int n, int k, int t) {
		int c = 0, x, y, z;

		for (x = 0; x < 100; x++)
			if (a(x, k))
				for (y = x; y < 100; y++)
					if (a(y, k) && b(x, y, t))
						for (z = x; z < 100; z++)
							if (a(z, k) && b(y, z, t) && b(z, x, t))
								c += x == y && y == z ? 1 : x != y ? 3 : 0;

		return c;
	}

	static boolean a(int i, int k) {
		return Math.abs((i / 10) - (i % 10)) < k;
	}

	static boolean b(int i, int j, int t) {
		return (i / 10) + (j % 10) > t;
	}

}
