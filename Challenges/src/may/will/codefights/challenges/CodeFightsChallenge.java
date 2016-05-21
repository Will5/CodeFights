package may.will.codefights.challenges;

public class CodeFightsChallenge {

	protected static void printExampleCase(String classSimpleName, int count, String input, Object output, String expectedOutput) {
		// Print Challenge Title
		printChallengeTitle(String.format("%s CHALLENGE", classSimpleName.toUpperCase()));

		// Print Example Case
		System.out.println(String.format(""
						+ "Example %d\n"
						+ "   Input:           %s\n"
						+ "   Output:          %s\n"
						+ "   Expected Output: %s",
				count,
				input,
				String.valueOf(output),
				expectedOutput));
	}

	protected static void printTestCase(String classSimpleName, int count, String input, Object output, String expectedOutput) {
		// Print Challenge Title
		printChallengeTitle(String.format("%s CHALLENGE", classSimpleName.toUpperCase()));

		// Print Test Case
		System.out.println(String.format(""
						+ "Test %d\n"
						+ "   Input:           %s\n"
						+ "   Output:          %s\n"
						+ "   Expected Output: %s",
				count,
				input,
				String.valueOf(output),
				expectedOutput));
	}

	protected static void printChallengeTitle(String challenge) {
		printStringBorder(challenge);
		System.out.println(challenge);
		printStringBorder(challenge);
	}

	private static void printStringBorder(String s) {
		for (@SuppressWarnings("unused") char c : s.toCharArray())
			System.out.print("~");
		System.out.println();
	}

}
