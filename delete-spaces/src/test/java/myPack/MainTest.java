package myPack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testFindSpacedFile() {
		// fail("Not yet implemented");
	}

	@Test
	void testFindSpacedFileByRegex() {
		Main main = new Main();
		String res = main.rename("a b");
		assertEquals("ab", res);
	}

	@Test
	void testRename() {
		Main main = new Main();
		String res = main.rename("a b");
		assertEquals("ab", res);
	}

}
