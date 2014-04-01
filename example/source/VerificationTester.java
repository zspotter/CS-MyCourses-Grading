import java.util.List;
import java.util.Arrays;

/*
 * A test wrapper for CSCI142 Lab 5
 *
 * This class was custom written to run tests without the need for a GUI.
 * Other labs may not need custom classes and can just use calls to diff to
 * check validity of program output.
 *
 * Author: Zachary Potter
 * /


public class VerificationTester {


	public static void main(String[] args) {
		
		SolutionChecker checker = new SolutionChecker();		

		test(checker, new int[] {
		    1,2,3,1,
		    0,0,0,0,
		    0,2,3,0,
		    0,0,0,0
		}, 3, Arrays.asList(1, 2, 3));

		test(checker, new int[] {
		    1,2,3,1,
		    1,2,0,1,
		    1,2,3,1,
		    1,1,1,1
		}, 3, Arrays.asList(3));

		test(checker, new int[] {
		    1,2,3,3,3,
		    1,2,2,2,3,
		    1,2,0,4,3,
		    1,2,4,2,3,
		    1,2,2,2,3
		}, 4, Arrays.asList(4));

		test(checker, new int[] {
		    1,2,3,3,3,
		    1,2,2,2,3,
		    1,2,4,4,3,
		    1,2,4,2,3,
		    1,2,2,2,3
		}, 4, Arrays.asList(-1));

	}

	// verifier.checkSolution() return value must be in the expected List to pass
	private static void test(PuzzleVerifier verifier, int[] values, int nColors, List<Integer> expected) {
		System.out.print("Testing... ");
		int result = verifier.checkSolution(values, nColors);
		if (!expected.contains(result)) {
			System.out.println("FAILED! Expected " + expected + ", got " + result);
		} else {
			System.out.println("passed");
		}
	}

}


