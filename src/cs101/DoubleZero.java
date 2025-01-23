package cs101;

public class DoubleZero {

	public static void main(String[] args) {
		double zero = 0.0;

		// TODO: what is the type of the expression `zero * 4`?
		// Write it here: This is a double
		System.out.println(zero * 4);
		System.out.println(4 * zero);

		double a = 4.567;

		// TODO: declare a new double `b` and initialize it to `a` divided by `zero`.
		double b = a / zero;
		// If you print `b`, what do you think you will get?
		// If I print 'b', I think i will get something like undefined or error because
		// anything divided by
		// 0 is undefined.

		// TODO: Print `b`.
		System.out.println(b);

		// TODO: Add `b` to a positive constant and print the result.
		System.out.println(b + 3);
		// TODO: Subtract `b` from a positive constant and print the result.
		System.out.println(b - 3);
		// TODO: declare a new double `c` and initialize it to 17.0;
		int c = 17;
		// TODO: uncomment the following lines and run the code
		int sqroot = (int) Math.sqrt(c);
		System.out.println("c is " + c);
		System.out.println("sqroot is " + sqroot);

		// TODO: Change the type of `c` to int and run the code.
		// What prints out? Why?
		// Write your answer here: You get an error and that's because 17.0 is a double
		// but we called it an int so the computer cant compile that.

		// TODO: Change the type of `c` to int and 17.0 to 17 and run the code.
		// What prints out? Why?
		// Write your answer here: It prints out c is 17 and sqroot is 4.123105... and
		// thats because the computer can process 17 as an int and it continues with the
		// code

		// TODO: Change the type of `c` to int and 17.0 to 17 and
		// change the type of `sqroot` to int. You should get an error. Why?
		// Write your answer here: I think it's because the answer should be a double
		// and it can't process that we want an int.

		// TODO: Hover over the error. You should see a an option to
		// `Add cast to 'int'`. Click this. Run the code.
		// What prints out? What do you think is happening?
		// Write your answer here: It prints a 4 and its because we told java that we
		// want the answer as an int so it can convert the double to int.

	}

}
