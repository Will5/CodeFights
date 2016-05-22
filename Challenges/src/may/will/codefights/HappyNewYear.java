package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class HappyNewYear extends CodeFightsChallenge {

	// https://codefights.com/challenge/RdeNyqPPR3ioGzGTn

	protected static String TAG = HappyNewYear.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1,
				"wish = 'Happy New Year and CodeFight On in 2016!'",
				happyNewYear("Happy New Year and CodeFight On in 2016!"),
				new String[]{
						"*************",
						"* Happy     *",
						"* New       *",
						"* Year      *",
						"* and       *",
						"* CodeFight *",
						"* On        *",
						"* in        *",
						"* 2016!     *",
						"*************"});

		// Test Cases
		printTestCase(TAG, 1,
				"wish: \"Happy New Year and CodeFight On in 2016!\"",
				happyNewYear("Happy New Year and CodeFight On in 2016!"),
				new String[]{
						"*************",
						"* Happy     *",
						"* New       *",
						"* Year      *",
						"* and       *",
						"* CodeFight *",
						"* On        *",
						"* in        *",
						"* 2016!     *",
						"*************"});
		printTestCase(TAG, 2,
				"wish: \"Congratulations, keep being awesome!\"",
				happyNewYear("Congratulations, keep being awesome!"),
				new String[]{
						"********************",
						"* Congratulations, *",
						"* keep             *",
						"* being            *",
						"* awesome!         *",
						"********************"});
		printTestCase(TAG, 3,
				"wish: \"Old is gone and new is here, forget your sorrows and your tear, Wish you a very very very Happy New Year.\"",
				happyNewYear("Old is gone and new is here, forget your sorrows and your tear, Wish you a very very very Happy New Year."),
				new String[]{
						"***********",
						"* Old     *",
						"* is      *",
						"* gone    *",
						"* and     *",
						"* new     *",
						"* is      *",
						"* here,   *",
						"* forget  *",
						"* your    *",
						"* sorrows *",
						"* and     *",
						"* your    *",
						"* tear,   *",
						"* Wish    *",
						"* you     *",
						"* a       *",
						"* very    *",
						"* very    *",
						"* very    *",
						"* Happy   *",
						"* New     *",
						"* Year.   *",
						"***********"});
		printTestCase(TAG, 4,
				"wish: \"wow wow wow wow wow\"",
				happyNewYear("wow wow wow wow wow"),
				new String[]{
						"*******",
						"* wow *",
						"* wow *",
						"* wow *",
						"* wow *",
						"* wow *",
						"*******"});

		// Custom Test Cases
		printCustomTestCase(TAG, 1,
				"wish: \"Hello World\"",
				happyNewYear("Hello World"),
				new String[]{
						"*********",
						"* Hello *",
						"* World *",
						"*********"});
	}

	static String[] happyNewYear(String w) {
		String[] l = w.split(" "), r = new String[l.length + 2];
		int i = 0, s = 0;
		for (String d : l) {
			int e = d.length();
			if (e > s)
				s = e;
		}

		for (; i < r.length; i++) {
			if (i == 0 || i == r.length - 1)
				r[i] = "**" + new String(new char[s]).replace("\0", "*") + "**";
			else {
				while (l[i - 1].length() < s) l[i - 1] = l[i - 1] + " ";
				r[i] = "* " + l[i - 1] + " *";
			}
		}
		return r;
	}

}
