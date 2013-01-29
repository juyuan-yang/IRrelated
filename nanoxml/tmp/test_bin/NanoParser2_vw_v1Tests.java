

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoParser2_vw_v1Tests extends TestCase {

	public void test0() throws Exception {
		//Parser_vw_v1_86.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser2_vw_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:132)\r\n\tat Parser2_vw_v1.main(Parser2_vw_v1.java:50)\r\n");
	}

}
