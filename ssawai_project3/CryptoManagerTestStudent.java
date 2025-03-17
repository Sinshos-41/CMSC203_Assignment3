package ssawai_project3;

/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: 
 * The CryptoManagerTestPublic class is a JUnit test class designed to test the functionality of the CryptoManager class. It uses JUnit 
 * to verify various encryption and decryption methods. This class tests every public method of the CryptoManager class, except setUp and 
 * tearDown methods. 
 * Due: 03/17/2025
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Sinsho Sawai
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("HELLO"));
        assertTrue(CryptoManager.isStringInBounds("TESTING123"));
        assertFalse(CryptoManager.isStringInBounds("hello")); //Lowercase should fail
        assertFalse(CryptoManager.isStringInBounds("{OUTSIDE RANGE}")); //`{` is out of range
    }

    @Test
    public void testEncryptCaesar() {
        assertEquals("KHOOR", CryptoManager.caesarEncryption("HELLO", 3)); //Shift by 3
        assertEquals("IFMMP!XPSME", CryptoManager.caesarEncryption("HELLO WORLD", 1)); //Shift by 1
        
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("HELLO", CryptoManager.caesarDecryption("KHOOR", 3)); //Reverse shift by 3
        assertEquals("HELLO WORLD", CryptoManager.caesarDecryption("IFMMP!XPSME", 1)); //Reverse shift by 1
    }

    @Test
    public void testEncryptBellaso() {
        assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
        assertEquals("ZR~T|w", CryptoManager.bellasoEncryption("HELLO", "KEY")); //Different key
        
        // Add debug prints if the expected results are not matching
        System.out.println(CryptoManager.bellasoEncryption("HELLO", "KEY"));
    }

    @Test
    public void testDecryptBellaso() {
        //Expected decryption should match the original text
        String decrypted1 = CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO");
        assertEquals("MERRY CHRISTMAS", decrypted1, "Decryption failed for Bellaso cipher with key 'HELLO'");

        String decrypted2 = CryptoManager.bellasoDecryption("ZR~T|w", "KEY");
        assertEquals("HELLO", decrypted2, "Decryption failed for Bellaso cipher with key 'KEY'");
    }

}
