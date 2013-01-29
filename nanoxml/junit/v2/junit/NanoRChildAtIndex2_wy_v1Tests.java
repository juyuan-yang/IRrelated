

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRChildAtIndex2_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rchildindex2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildAtIndex2_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child element at index 9: \r\nException in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 9 >= 9\r\n\tat java.util.Vector.elementAt(Vector.java:432)\r\n\tat net.n3.nanoxml.XMLElement.getChildAtIndex(XMLElement.java:298)\r\n\tat RChildAtIndex2_wy_v1.main(RChildAtIndex2_wy_v1.java:49)\r\n");
	}

}
