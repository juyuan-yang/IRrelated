

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoSetAttr4_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//setattr4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		SetAttr4_wy_v1.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO address=\"NW Ave\" age=\"20\" unit=\"LB\" weight=\"80\" direction=\"north\">\r\n    <BAR1/>\r\n    <BAR2 x=\"1\"/>\r\n    <BAR3 x=\"1\" y=\"2\"/>\r\n    <BAR4>\r\n        <BAR5/>\r\n        <BARBAR1/>\r\n        <BA1/>\r\n        <FOO1/>\r\n    </BAR4>\r\n    <BAR6>blah</BAR6>\r\n    <BAR7 x=\"1\">blah</BAR7>\r\n    <BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8>\r\n    <BAR9>abc</BAR9>\r\n    &lt;&amp;&gt;&quot;&apos;!:&#x2030;\r\n</FOO>\r\n");
	}

}
