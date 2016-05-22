package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class DecorateComment extends CodeFightsChallenge {

	// https://codefights.com/challenge/eTECyydHHhjZ7MRYx

	protected static String TAG = DecorateComment.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1,
				"DecorateComment(\"This is my comment\")",
				DecorateComment("This is my comment"),
				new String[]{
						"////////////////////////",
						"// This is my comment //",
						"////////////////////////"});

		// Test Cases
		printTestCase(TAG, 1,
				"cmt: \"This is my comment\"",
				DecorateComment("This is my comment"),
				new String[]{
						"////////////////////////",
						"// This is my comment //",
						"////////////////////////"});
		printTestCase(TAG, 2,
				"cmt: \"Can you see me?\"",
				DecorateComment("Can you see me?"),
				new String[]{
						"/////////////////////",
						"// Can you see me? //",
						"/////////////////////"});
		printTestCase(TAG, 3,
				"cmt: \"As long as the function works\"",
				DecorateComment("As long as the function works"),
				new String[]{
						"///////////////////////////////////",
						"// As long as the function works //",
						"///////////////////////////////////"});
		printTestCase(TAG, 4,
				"cmt: \"NoJoking\"",
				DecorateComment("NoJoking"),
				new String[]{
						"//////////////",
						"// NoJoking //",
						"//////////////"});

		// Custom Test Cases
		printCustomTestCase(TAG, 1,
				"cmt: \"Hello World\"",
				DecorateComment("Hello World"),
				new String[]{
						"/////////////////",
						"// Hello World //",
						"/////////////////"});
	}

	static String[] DecorateComment(String c) {
		String[] r = new String[3];

		c = "// " + c + " //";
		String s = c.replaceAll(".", "/");

		r[0] = s;
		r[1] = c;
		r[2] = s;

		return r;
	}

}
