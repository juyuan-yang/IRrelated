

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRFirstChild3_wy_v2Tests extends TestCase {

	public void test0() throws Exception {
		//rfirstchild4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild3_wy_v2.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The first child element named BAR is: \r\n    <BAR/>\r\n");
	}

	public void test1() throws Exception {
		//rfirstchild5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild3_wy_v2.main(new String[] {"inputs/file10_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The first child element named BAR is: \r\n    <BAR/>\r\n");
	}

}
