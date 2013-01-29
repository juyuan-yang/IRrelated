

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoCrElement2_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//crelem2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		CrElement2_wy_v1.main(new String[] {});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "");
	}

}
