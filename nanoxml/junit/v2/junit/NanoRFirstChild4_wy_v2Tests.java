

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRFirstChild4_wy_v2Tests extends TestCase {

//	public void test0() throws Exception {
//		//rfirstchild6.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		RFirstChild4_wy_v2.main(new String[] {"inputs/simple.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLElement.getFirstChildNamed(XMLElement.java:316)\r\n\tat RFirstChild4_wy_v2.main(RFirstChild4_wy_v2.java:46)\r\n");
//	}

	public void test1() throws Exception {
		//rfirstchild7.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild4_wy_v2.main(new String[] {"inputs/file10_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child with the name  of TREE  could not be found.\r\n");
	}

	public void test2() throws Exception {
		//rfirstchild8.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild4_wy_v2.main(new String[] {"inputs/file8_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child with the name  of TREE  could not be found.\r\n");
	}

	public void test3() throws Exception {
		//rfirstchild9.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RFirstChild4_wy_v2.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The child with the name  of TREE  could not be found.\r\n");
	}

}
