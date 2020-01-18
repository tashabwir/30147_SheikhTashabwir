package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............		 */

		int x = 1;
		int total = 100;
		System.out.println(total);

		while (total > 0) {		// ***supposed to make the loop stop but it doesnt***
			for (int i = 1; i > 0; i++) {
				int temp = i * 10;

				if (i == 1) {
					for (int j = 1; j <= temp; j++) {
						total = total - i;
						System.out.println(total);
					}
				} else {
					for (int j = 1; j <= temp / i; j++) {
						total = total - i;
						System.out.println(total);
					}
				}
			}
		}
	}
}

