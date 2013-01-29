

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoREnumAttr_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//renumattr1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REnumAttr_wy_v1.main(new String[] {"inputs/emptyelem1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element attr names are: \r\n");
	}

	public void test1() throws Exception {
		//renumattr2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REnumAttr_wy_v1.main(new String[] {"inputs/emptyelem2_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element attr names are: color \r\n");
	}

	public void test2() throws Exception {
		//renumattr3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REnumAttr_wy_v1.main(new String[] {"inputs/emptyelem3_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element attr names are: color smell name season \r\n");
	}

	public void test3() throws Exception {
		//renumattr4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REnumAttr_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element attr names are: \r\n");
	}

	public void test4() throws Exception {
		//renumattr5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REnumAttr_wy_v1.main(new String[] {"inputs/file2_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element attr names are: unit \r\n");
	}

	public void test5() throws Exception {
		//renumattr6.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		REnumAttr_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "xml element attr names are: unit weight direction age \r\n");
	}

}
