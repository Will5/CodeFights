package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class PascalTriangle extends CodeFightsChallenge {

	// https://codefights.com/challenge/GYXCXJkQLXEbu7TFC

	private static String TAG = Hexagon.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "Pascal_triangle(2)", Pascal_triangle(2), new int[]{1, 1});

		// Test Cases
		printTestCase(TAG, 1, "n: 2", Pascal_triangle(2), new int[]{1, 1});
		printTestCase(TAG, 2, "n: 1", Pascal_triangle(1), new int[]{1});
		printTestCase(TAG, 3, "n: 3", Pascal_triangle(3), new int[]{1, 2, 1});
	}

	private static int[] Pascal_triangle(int n) {
		int[] r = new int[n];
		r[0] = 1;

		int j = 1;
		for (; j < n; )
			r[j] = r[j - 1] * (n - j) / j++;

		return r;
	}

}
