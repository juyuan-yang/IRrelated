

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRemoveChildIndex1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rmchildindx1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RemoveChildIndex1_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: -1\r\n\tat java.util.Vector.removeElementAt(Vector.java:522)\r\n\tat net.n3.nanoxml.XMLElement.removeChildAtIndex(XMLElement.java:228)\r\n\tat RemoveChildIndex1_wy_v1.main(RemoveChildIndex1_wy_v1.java:48)\r\n");
	}

}
