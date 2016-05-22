package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class LuckyTicket extends CodeFightsChallenge {

	// https://codefights.com/challenge/qqCQZZWBnD6G9Zs4C

	protected static String TAG = LuckyTicket.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "LuckyTicket(2, \"47\")", LuckyTicket(2, "47"), "NO");

		// Test Cases
		printTestCase(TAG, 1, "n: 2, s: \"47\"", LuckyTicket(2, "47"), "NO");
		printTestCase(TAG, 2, "n: 4, s: \"4738\"", LuckyTicket(4, "4738"), "NO");
		printTestCase(TAG, 3, "n: 4, s: \"4774\"", LuckyTicket(4, "4774"), "YES");
		printTestCase(TAG, 4, "n: 6, s: \"777777\"", LuckyTicket(4, "777777"), "YES");
		printTestCase(TAG, 5, "n: 10, s: \"4745474547\"", LuckyTicket(10, "4745474547"), "NO");
		printTestCase(TAG, 6, "n: 50, s: \"74444444444444444444444444444444444444444444444444\"", LuckyTicket(50, "74444444444444444444444444444444444444444444444444"), "NO");
		printTestCase(TAG, 7, "n: 50, s: \"44747747774474747747747447777447774747447477444474\"", LuckyTicket(50, "44747747774474747747747447777447774747447477444474"), "YES");
	}

	static String LuckyTicket(int n, String s) {
		int i = 0, r = 0;

		for (; i < n / 2; )
			r += s.charAt(i++) - s.charAt(n - i);

		return r == 0 && s.matches("[47]*") ? "YES" : "NO";
	}

}
