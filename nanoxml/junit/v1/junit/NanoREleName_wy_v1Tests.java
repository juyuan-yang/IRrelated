

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoREleName_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//relename1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REleName_wy_v1.main(new String[] {"inputs/emptyelem3_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element name is: Flower\r\n");
	}

	public void test1() throws Exception {
		//relename2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REleName_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element name is: FOO\r\n");
	}

}
