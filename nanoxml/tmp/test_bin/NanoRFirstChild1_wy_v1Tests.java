

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRFirstChild1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rfirstchild1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild1_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLElement.getFirstChildNamed(XMLElement.java:292)\r\n\tat RFirstChild1_wy_v1.main(RFirstChild1_wy_v1.java:47)\r\n");
	}

}
