

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoParser7_vw_v2Tests extends TestCase {

	public void test0() throws Exception {
		//Parser_vw_v2_86.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser7_vw_v2.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:218)\r\n\tat Parser7_vw_v2.main(Parser7_vw_v2.java:50)\r\nnet.n3.nanoxml.XMLException: null\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:225)\r\n\tat Parser7_vw_v2.main(Parser7_vw_v2.java:50)\r\n");
	}

}
