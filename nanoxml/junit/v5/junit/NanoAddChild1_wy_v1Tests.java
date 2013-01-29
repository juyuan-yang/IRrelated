

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoAddChild1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//addchild1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		AddChild1_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.IllegalArgumentException: child must not be null\r\n\tat net.n3.nanoxml.XMLElement.addChild(XMLElement.java:376)\r\n\tat AddChild1_wy_v1.main(AddChild1_wy_v1.java:47)\r\n");
	}

}
