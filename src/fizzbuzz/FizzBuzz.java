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

				s += "Fizz"; // For multiples of three print Fizz instead of the number

			if (i % 5 == 0)

				s += "Buzz"; // For the multiples of five print Buzz instead of the number

			return !s.isEmpty() ? s : String.valueOf(i); // When in line is not empty result will give in console(Fizz,Buzz and etc)

	}
}