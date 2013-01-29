

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRVecChildNamed2_wy_v1Tests extends TestCase {

//	public void test0() throws Exception {
//		//rvecchildnamed2.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		RVecChildNamed2_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLElement.getChildrenNamed(XMLElement.java:316)\r\n\tat RVecChildNamed2_wy_v1.main(RVecChildNamed2_wy_v1.java:48)\r\n");
//	}

	public void test1() throws Exception {
		//rvecchildnamed3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildNamed2_wy_v1.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements with the name BAR6 are: \r\n    <BAR6>blah</BAR6>\r\n\r\n");
	}

}
