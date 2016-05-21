package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class LuckyNum extends CodeFightsChallenge {

	// https://codefights.com/challenge/5EXaBBd9sCbKeyzbo

	protected static String TAG = LuckyNum.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "L = 1 and R = 2", LuckyNum(1, 2), "-1");
		printExampleCase(TAG, 2, "L = 4 and R = 7", LuckyNum(4, 7), "4");

		// Test Cases
		printTestCase(TAG, 1, "L: 3, R: 77", LuckyNum(3, 77), "4");
		printTestCase(TAG, 2, "L: 45, R: 49", LuckyNum(45, 49), "47");
		printTestCase(TAG, 3, "L: 443, R: 444", LuckyNum(443, 444), "444");
		printTestCase(TAG, 4, "L: 44444, R: 44444", LuckyNum(44444, 44444), "44444");
	}

	private static int LuckyNum(int L, int R) {
		return L > R ? -1 : (L + "").matches("^[47]*") ? L : LuckyNum(L + 1, R);
	}

}
