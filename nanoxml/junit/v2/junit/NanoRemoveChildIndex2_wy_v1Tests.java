

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRemoveChildIndex2_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rmchildindx2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RemoveChildIndex2_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 20 >= 9\r\n\tat java.util.Vector.removeElementAt(Vector.java:518)\r\n\tat net.n3.nanoxml.XMLElement.removeChildAtIndex(XMLElement.java:228)\r\n\tat RemoveChildIndex2_wy_v1.main(RemoveChildIndex2_wy_v1.java:48)\r\n");
	}

}
