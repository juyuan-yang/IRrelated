

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRChildAtIndex4_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rchildindex5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildAtIndex4_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child element at index 3 is: \r\n<BAR4><BAR5/><BARBAR1/><BA1/><FOO1/></BAR4>");
	}

}
