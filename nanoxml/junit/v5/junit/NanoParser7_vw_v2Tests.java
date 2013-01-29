

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoParser7_vw_v2Tests extends TestCase {

	public void test0() throws Exception {
		//Parser_vw_v5_86.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser7_vw_v2.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" Nested Exception\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:208)\r\n\tat Parser7_vw_v2.main(Parser7_vw_v2.java:50)\r\n*** Nested Exception:\r\njava.lang.NullPointerException\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:201)\r\n\tat Parser7_vw_v2.main(Parser7_vw_v2.java:50)\r\n");
	}

}
