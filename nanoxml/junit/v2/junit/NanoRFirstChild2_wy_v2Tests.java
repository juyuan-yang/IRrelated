

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRFirstChild2_wy_v2Tests extends TestCase {

//	public void test0() throws Exception {
//		//rfirstchild2.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		RFirstChild2_wy_v2.main(new String[] {"inputs/file9_wy.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLElement.getFirstChildNamed(XMLElement.java:316)\r\n\tat RFirstChild2_wy_v2.main(RFirstChild2_wy_v2.java:47)\r\n");
//	}

	public void test1() throws Exception {
		//rfirstchild3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild2_wy_v2.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The first child element named BAR6  is: \r\n    <BAR6>blah</BAR6>\r\n");
	}

}
