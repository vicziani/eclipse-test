package examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ExamplesTest {

	@Test
	void testAdd() {
		log.debug("Hello World!");
		assertEquals(5, 3 + 2);
	}
	
	
}
