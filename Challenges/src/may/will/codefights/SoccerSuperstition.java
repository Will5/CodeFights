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

		for (x = 0; x < 100; x++) {
			if (a(c(x), k)) {
				for (y = x; y < 100; y++) {
					if (a(c(y), k) && b(c(x), c(y), t)) {
						for (z = x; z < 100; z++) {
							if (a(c(z), k) && b(c(y), c(z), t) && b(c(z), c(x), t)) {
								if (x == y && y == z) {
									c+=1;
								} else if (x != y) {
									c+=3;
								}
							}
						}
					}
				}
			}
		}

		return c;
	}

	static boolean a(String a, int k) {
		return Math.abs(d(a.charAt(0)) - d(a.charAt(1))) < k;
	}

	static boolean b(String a, String b, int t) {
		return d(a.charAt(1)) + d(b.charAt(0)) > t;
	}

	static String c(int i) {
		return String.format("%02d", i);
	}

	static int d(char c) {
		return c - 48;
	}

}
