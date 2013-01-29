

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRAttrVal1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rattrval1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RAttrVal1_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat java.util.Hashtable.get(Hashtable.java:336)\r\n\tat java.util.Properties.getProperty(Properties.java:774)\r\n\tat java.util.Properties.getProperty(Properties.java:793)\r\n\tat net.n3.nanoxml.XMLElement.getAttribute(XMLElement.java:349)\r\n\tat net.n3.nanoxml.XMLElement.getAttribute(XMLElement.java:334)\r\n\tat RAttrVal1_wy_v1.main(RAttrVal1_wy_v1.java:48)\r\n");
	}

}
