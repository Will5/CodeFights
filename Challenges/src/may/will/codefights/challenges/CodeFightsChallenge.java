package may.will.codefights.challenges;

public class CodeFightsChallenge {

	protected static void printExampleCase(String classSimpleName, int count, String input, Object output, String expectedOutput) {
		// Print Challenge Title
		printChallengeTitle(String.format("%s CHALLENGE", classSimpleName.toUpperCase()));

		// Print Example Case
		printChallengeCase(String.format("Example %d", count), input, output, expectedOutput);
	}

	protected static void printTestCase(String classSimpleName, int count, String input, Object output, String expectedOutput) {
		// Print Challenge Title
		printChallengeTitle(String.format("%s CHALLENGE", classSimpleName.toUpperCase()));

		// Print Test Case
		printChallengeCase(String.format("Test %d", count), input, output, expectedOutput);
	}

	protected static void printCustomTestCase(String classSimpleName, int count, String input, Object output, String expectedOutput) {
		// Print Challenge Title
		printChallengeTitle(String.format("%s CHALLENGE", classSimpleName.toUpperCase()));

		// Print Custom Test Case
		printChallengeCase(String.format("Custom test %d", count), input, output, expectedOutput);
	}

	protected static void printChallengeTitle(String challengeTitle) {
		printStringBorder(challengeTitle);
		System.out.println(challengeTitle);
		printStringBorder(challengeTitle);
	}

	private static void printStringBorder(String s) {
		for (@SuppressWarnings("unused") char c : s.toCharArray())
			System.out.print("~");
		System.out.println();
	}

	protected static void printChallengeCase(String challengeCase, String input, Object output, String expectedOutput) {
		System.out.println(String.format(""
						+ "%s\n"
						+ "   Input:           %s\n"
						+ "   Output:          %s\n"
						+ "   Expected Output: %s",
				challengeCase,
				input,
				String.valueOf(output),
				expectedOutput));
	}

}
