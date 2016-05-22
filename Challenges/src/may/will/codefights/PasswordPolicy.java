package may.will.codefights;

import may.will.codefights.challenges.CodeFightsChallenge;

public class PasswordPolicy extends CodeFightsChallenge {

	// https://codefights.com/challenge/BMaKJx4KeWKisHjzp

	protected static String TAG = PasswordPolicy.class.getSimpleName();

	public static void main(String[] args) {
		// Example Cases
		printExampleCase(TAG, 1, "PasswordPolicy(\"code2016Fights\")", PasswordPolicy("code2016Fights"), "e2016F");

		// Test Cases
		printTestCase(TAG, 1, "Password: \"code2016Fights\"", PasswordPolicy("code2016Fights"), "e2016F");
		printTestCase(TAG, 2, "Password: \"88syadneerG\"", PasswordPolicy("88syadneerG"), "8syadneerG");
		printTestCase(TAG, 3, "Password: \"Windows7released21october2009\"", PasswordPolicy("Windows7released21october2009"), "Windows7");
		printTestCase(TAG, 4, "Password: \"AAAAAAABBBBBbasd3\"", PasswordPolicy("AAAAAAABBBBBbasd3"), "Bbasd3");
		printTestCase(TAG, 5, "Password: \"AB1b\"", PasswordPolicy("AB1b"), "");
		printTestCase(TAG, 6, "Password: \"SSSSSSBBBBBBb12\"", PasswordPolicy("SSSSSSBBBBBBb12"), "BBBBb1");
		printTestCase(TAG, 7, "Password: \"12345435569BBBBBbbbb\"", PasswordPolicy("12345435569BBBBBbbbb"), "9BBBBBb");
		printTestCase(TAG, 8, "Password: \"ThisisNotAHardproblem3isit\"", PasswordPolicy("ThisisNotAHardproblem3isit"), "Hardproblem3");
		printTestCase(TAG, 9, "Password: \"ThisisNotAHardproblem3isiT\"", PasswordPolicy("ThisisNotAHardproblem3isiT"), "m3isiT");
	}

	static String PasswordPolicy(String P) {
		int i, j, L = P.length();

		for (i = 6; i <= L; i++)
			for (j = 0; j < L - i + 1; j++) {
				String S = P.substring(j, j + i);

				if (S.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{6,}$"))
					return S;
			}

		return "";
	}

}
