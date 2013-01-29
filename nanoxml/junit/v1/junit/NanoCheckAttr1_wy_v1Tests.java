

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoCheckAttr1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//checkattr1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		CheckAttr1_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat java.util.Hashtable.containsKey(Hashtable.java:314)\r\n\tat net.n3.nanoxml.XMLElement.hasAttribute(XMLElement.java:395)\r\n\tat CheckAttr1_wy_v1.main(CheckAttr1_wy_v1.java:48)\r\n");
	}

}
