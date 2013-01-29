

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRChildAtIndex3_wy_v1Tests extends TestCase {

//	public void test0() throws Exception {
//		//rchildindex3.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		RChildAtIndex3_wy_v1.main(new String[] {"inputs/file8_wy.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "The child element at index 0 is: \r\nException in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 0 >= 0\r\n\tat java.util.Vector.elementAt(Vector.java:432)\r\n\tat net.n3.nanoxml.XMLElement.getChildAtIndex(XMLElement.java:274)\r\n\tat RChildAtIndex3_wy_v1.main(RChildAtIndex3_wy_v1.java:49)\r\n");
//	}

	public void test1() throws Exception {
		//rchildindex4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildAtIndex3_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child element at index 0 is: \r\n<BAR1/>\r\n");
	}

}
