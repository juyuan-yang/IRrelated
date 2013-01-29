

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoCrElement5_wy_v3Tests extends TestCase {

	public void test0() throws Exception {
		//crelem5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		CrElement5_wy_v3.main(new String[] {});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "");
	}

}
