package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class Hexagon extends CodeFightsChallenge {

	// https://codefights.com/challenge/xqE5E6KebvaWszRtP

	protected static String TAG = Hexagon.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "sides = [1, 1, 1, 1, 1, 1]", Hexagon(new int[]{1, 1, 1, 1, 1, 1}), "6");
		printExampleCase(TAG, 2, "sides = [1, 2, 1, 2, 1, 2]", Hexagon(new int[]{1, 2, 1, 2, 1, 2}), "13");

		// Test Cases
		printTestCase(TAG, 1, "sides: [1, 1, 1, 1, 1, 1]", Hexagon(new int[]{1, 1, 1, 1, 1, 1}), "6");
		printTestCase(TAG, 2, "sides: [1, 2, 1, 2, 1, 2]", Hexagon(new int[]{1, 2, 1, 2, 1, 2}), "13");
		printTestCase(TAG, 3, "sides: [2, 4, 5, 3, 3, 6]", Hexagon(new int[]{2, 4, 5, 3, 3, 6}), "83");
		printTestCase(TAG, 4, "sides: [45, 19, 48, 18, 46, 21]", Hexagon(new int[]{45, 19, 48, 18, 46, 21}), "6099");
		printTestCase(TAG, 5, "sides: [66, 6, 65, 6, 66, 5]", Hexagon(new int[]{66, 6, 65, 6, 66, 5}), "5832");
		printTestCase(TAG, 6, "sides: [7, 5, 4, 8, 4, 5]", Hexagon(new int[]{7, 5, 4, 8, 4, 5}), "175");
		printTestCase(TAG, 7, "sides: [3, 2, 1, 4, 1, 2]", Hexagon(new int[]{3, 2, 1, 4, 1, 2}), "25");
		printTestCase(TAG, 8, "sides: [7, 1, 7, 3, 5, 3]", Hexagon(new int[]{7, 1, 7, 3, 5, 3}), "102");
		printTestCase(TAG, 9, "sides: [9, 2, 9, 3, 8, 3]", Hexagon(new int[]{9, 2, 9, 3, 8, 3}), "174");
	}

	public static int Hexagon(int[] sides) {
		int[] s = sides;
		int a = s[0], d = s[3];
		return (a - d) * (a - d) + 2 * (a * s[1] + s[2] * d + s[4] * s[5]);
	}

}
