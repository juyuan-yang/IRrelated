

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRChildCount_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rchildcount1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildCount_wy_v1.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  number of children of xml element is: 0\r\n");
	}

	public void test1() throws Exception {
		//rchildcount2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildCount_wy_v1.main(new String[] {"inputs/file8_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  number of children of xml element is: 0\r\n");
	}

	public void test2() throws Exception {
		//rchildcount3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildCount_wy_v1.main(new String[] {"inputs/file6_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  number of children of xml element is: 1\r\n");
	}

	public void test3() throws Exception {
		//rchildcount4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildCount_wy_v1.main(new String[] {"inputs/file5_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  number of children of xml element is: 2\r\n");
	}

	public void test4() throws Exception {
		//rchildcount5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildCount_wy_v1.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  number of children of xml element is: 8\r\n");
	}

	public void test5() throws Exception {
		//rchildcount6.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RChildCount_wy_v1.main(new String[] {"inputs/file9_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "The  number of children of xml element is: 9\r\n");
	}

}
