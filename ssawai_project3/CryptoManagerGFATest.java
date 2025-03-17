package ssawai_project3;

/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: 
 * This class represents GFA test cases for a CryptoManager object. This class tests the functionality of the CryptoManager class. 
 * It contains unit tests to verify encryption and decryption methods, as well as string validation.
 * Due: 03/17/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Sinsho Sawai
*/



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CryptoManagerGFATest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("THIS TEST SHOULD SUCCEED"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("IFMMP!XPSME", CryptoManager.caesarEncryption("HELLO WORLD", 1));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("IFMMP!XPSME", 1));
	}
}
