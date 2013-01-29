

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRFirstChild2_wy_v3Tests extends TestCase {

	public void test0() throws Exception {
		//rfirstchild2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild2_wy_v3.main(new String[] {"inputs/file9_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The first child element named BAR6  is: \r\n    <BAR6>blah</BAR6>\r\n");
	}

	public void test1() throws Exception {
		//rfirstchild3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild2_wy_v3.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The first child element named BAR6  is: \r\n    <BAR6>blah</BAR6>\r\n");
	}

}
