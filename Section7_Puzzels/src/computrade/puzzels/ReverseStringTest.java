package computrade.puzzels;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ReverseStringTest {
	
	ReverseString rs;
	
	@Before
	public void init(){
		this.rs = new ReverseString();
		
	}
	
	@Test
	public void testReverseStringWithJavaApi() {
	
		assertEquals("CBA",rs.reverseJava("ABC"));
		assertEquals("21ba",rs.reverseJava("ab12"));
		assertEquals("",rs.reverseJava(""));
		assertEquals("a",rs.reverseJava("a"));
		assertEquals("aaa",rs.reverseJava("aaa"));
		assertEquals("aba",rs.reverseJava("aba"));
		assertEquals("Bbbaa",rs.reverseJava("aabbB"));
	
	}
	
	
	@Test
	public void testReverseStringWithStringBuilder() {

	
		assertEquals("EDCBA",rs.reverseStringBuilder("ABCDE"));
		assertEquals("21ba",rs.reverseStringBuilder("ab12"));
		assertEquals("",rs.reverseStringBuilder(""));
		assertEquals("a",rs.reverseStringBuilder("a"));
		assertEquals("aaa",rs.reverseStringBuilder("aaa"));
		assertEquals("aba",rs.reverseStringBuilder("aba"));
		assertEquals("Bbbaa",rs.reverseStringBuilder("aabbB"));
	
	}
	
	@Test
	public void testReverseStringWithChar() {

		assertEquals("EDCBA",rs.reverseChar("ABCDE"));
		assertEquals("21ba",rs.reverseChar("ab12"));
		assertEquals("",rs.reverseChar(""));
		assertEquals("a",rs.reverseChar("a"));
		assertEquals("aaa",rs.reverseChar("aaa"));
		assertEquals("aba",rs.reverseChar("aba"));
		assertEquals("Bbbaa",rs.reverseChar("aabbB"));
	
	}
	
	@Test
	public void testReverseStringWithRecursion() {

		assertEquals("EDCBA",rs.reverseStringRecursive("ABCDE"));
		assertEquals("21ba",rs.reverseStringRecursive("ab12"));
		assertEquals("",rs.reverseStringRecursive(""));
		assertEquals("a",rs.reverseStringRecursive("a"));
		assertEquals("aaa",rs.reverseStringRecursive("aaa"));
		assertEquals("aba",rs.reverseStringRecursive("aba"));
		assertEquals("Bbbaa",rs.reverseStringRecursive("aabbB"));
	}
		
}
