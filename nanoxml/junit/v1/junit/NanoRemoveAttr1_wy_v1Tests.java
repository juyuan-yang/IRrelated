

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRemoveAttr1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rmattr1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RemoveAttr1_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat java.util.Hashtable.remove(Hashtable.java:438)\r\n\tat net.n3.nanoxml.XMLElement.removeAttribute(XMLElement.java:373)\r\n\tat RemoveAttr1_wy_v1.main(RemoveAttr1_wy_v1.java:48)\r\n");
	}

}
