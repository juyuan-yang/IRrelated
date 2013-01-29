

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRPropAttr_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rpropattr1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RPropAttr_wy_v1.main(new String[] {"inputs/emptyelem1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "-- listing properties --\r\n");
	}

	public void test1() throws Exception {
		//rpropattr2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RPropAttr_wy_v1.main(new String[] {"inputs/emptyelem2_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "-- listing properties --\r\ncolor=Red\r\n");
	}

	public void test2() throws Exception {
		//rpropattr3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RPropAttr_wy_v1.main(new String[] {"inputs/emptyelem3_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "-- listing properties --\r\nsmell=Sweet\r\ncolor=Red\r\nname=Rose\r\nseason=Spring\r\n");
	}

	public void test3() throws Exception {
		//rpropattr4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RPropAttr_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "-- listing properties --\r\n");
	}

	public void test4() throws Exception {
		//rpropattr5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RPropAttr_wy_v1.main(new String[] {"inputs/file2_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "-- listing properties --\r\nunit=LB\r\n");
	}

	public void test5() throws Exception {
		//rpropattr6.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RPropAttr_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "-- listing properties --\r\nage=20\r\nunit=LB\r\nweight=80\r\ndirection=north\r\n");
	}

}
