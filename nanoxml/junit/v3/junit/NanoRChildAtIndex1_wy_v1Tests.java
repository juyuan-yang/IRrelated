

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRChildAtIndex1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rchildindex1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildAtIndex1_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child element at index -1 is: \r\nException in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: -1\r\n\tat java.util.Vector.elementAt(Vector.java:435)\r\n\tat net.n3.nanoxml.XMLElement.getChildAtIndex(XMLElement.java:460)\r\n\tat RChildAtIndex1_wy_v1.main(RChildAtIndex1_wy_v1.java:49)\r\n");
	}

}
