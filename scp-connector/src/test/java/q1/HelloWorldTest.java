package q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals("HelloWorld!", new HelloWorld().message);
	}

}
