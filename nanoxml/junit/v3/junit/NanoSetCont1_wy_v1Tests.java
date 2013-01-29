

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoSetCont1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//setcont1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		SetCont1_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>This is just for testing set content.</FOO>");
	}

	public void test1() throws Exception {
		//setcont4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		SetCont1_wy_v1.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO unit=\"LB\">This is just for testing set content.</FOO>");
	}

}
