package may.will.codefights;

import java.util.Arrays;

import may.will.codefights.challenges.CodeFightsChallenge;

public class DigitalRoot extends CodeFightsChallenge {

	// https://codefights.com/challenge/QzjXpcHdxFuzKyvo5

	protected static String TAG = DigitalRoot.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "digitalRoot(\"5\", \"9\")", digitalRoot("5", "9"), new int[]{5, 6, 7, 8, 9});
		printExampleCase(TAG, 2, "digitalRoot(\"12\", \"22\")", digitalRoot("12", "22"), new int[]{3, 4});

		// Test Cases
		printTestCase(TAG, 1, "A: 1, B: 5", digitalRoot("1", "5"), new int[]{1, 2, 3, 4, 5});
		printTestCase(TAG, 2, "A: 12, B: 22", digitalRoot("12", "22"), new int[]{3, 4});
		printTestCase(TAG, 3, "A: 9, B: 12", digitalRoot("9", "12"), new int[]{1, 2, 3, 9});
		printTestCase(TAG, 4, "A: 7, B: 7", digitalRoot("7", "7"), new int[]{7});
		printTestCase(TAG, 5, "A: 12, B: 12", digitalRoot("12", "12"), new int[]{3});

		// Custom Test Cases
		printCustomTestCase(TAG, 1, "A: 123456789, B: 987654321", digitalRoot("123456789", "987654321"), new int[]{9});
	}

	static int[] digitalRoot(String A, String B) {
		long a = Long.parseLong(A), b = Long.parseLong(B),
				i = a, x = 1 + (b - a) % 9;

		int[] r = new int[(int) x];

		for (; i < a + x; )
			r[(int) (i - a)] = (int) (1 + (i++ - 1) % 9);

		Arrays.sort(r);

		return r;
	}

}
