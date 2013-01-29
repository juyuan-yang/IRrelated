

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRContent_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rcont1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RContent_wy_v1.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  content of xml element is: null\r\n");
	}

	public void test1() throws Exception {
		//rcont2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RContent_wy_v1.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  content of xml element is: null\r\n");
	}

	public void test2() throws Exception {
		//rcont3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RContent_wy_v1.main(new String[] {"inputs/file8_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  content of xml element is: \n   This element does not have children.\n   It just contain PCDATA.\t\n\r\n");
	}

	public void test3() throws Exception {
		//rcont4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RContent_wy_v1.main(new String[] {"inputs/file9_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  content of xml element is: null\r\n");
	}

}
