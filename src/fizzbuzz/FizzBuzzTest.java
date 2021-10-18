package fizzbuzz;
// Some new imports for Java Test Class
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void of_zerois0() {
		assertEquals(FizzBuzz.of(0), ("0"));
	}

	@Test
	public void of_oneis1() {
		assertEquals(FizzBuzz.of(1), ("1"));
	}

	@Test
	public void of_threeisFizz() {
	assertEquals(FizzBuzz.of(3), ("Fizz"));
	}
	
	@Test
	public void of_fiveisBuzz() {
		assertEquals(FizzBuzz.of(5), ("Buzz"));
	}
	
	@Test
	public void of_sixisFizz() {
		assertEquals(FizzBuzz.of(6), ("Fizz"));
	}

	@Test
	public void of_tenisBuzz() {
		assertEquals(FizzBuzz.of(10), ("Buzz"));
	}

	@Test
	public void of_fiveteenisFizzBuzz() {
		assertEquals(FizzBuzz.of(15), ("FizzBuzz"));
	}
}