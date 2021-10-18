package fizzbuzz;

public class FizzBuzz

{

	//create public static of

	public static String of(int i) {

			if (i == 0)

			return "0";
			return _of(i);

} // close public static of

// create public static _of

	private static String _of(int i) {

			String s = "";

			if (i % 3 == 0)

				s += "Fizz";

			if (i % 5 == 0)

				s += "Buzz";

			return !s.isEmpty() ? s : String.valueOf(i); // When in line is not empty result will give in console(Fizz,Buzz and etc)

	}
}