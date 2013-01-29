

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRemoveAttr1_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//rmattr1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RemoveAttr1_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO unit=\"LB\" weight=\"80\" direction=\"north\" age=\"20\"><BAR1/><BAR2 x=\"1\"/><BAR3 x=\"1\" y=\"2\"/><BAR4><BAR5/><BARBAR1/><BA1/><FOO1/></BAR4><BAR6>blah</BAR6><BAR7 x=\"1\">blah</BAR7><BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8><BAR9>abc</BAR9>\n &lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</FOO>");
	}

}
