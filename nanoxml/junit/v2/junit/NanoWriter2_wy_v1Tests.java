

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoWriter2_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//writer2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer2_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLWriter.write(XMLWriter.java:140)\r\n\tat net.n3.nanoxml.XMLWriter.write(XMLWriter.java:102)\r\n\tat Writer2_wy_v1.main(Writer2_wy_v1.java:47)\r\n");
	}

}
