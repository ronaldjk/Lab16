import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab16MainTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		int expected = 7;
		int actual = Lab16Main.findPosition(4);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		boolean expected = false;
		boolean actual = Lab16Main.isPrime(4);
		assertEquals(expected, actual);
	}


}
