

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoAddChild3_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//addchild3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		AddChild3_wy_v1.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO unit=\"LB\">\r\n    The added child element is without name.\r\n</FOO>\r\n");
	}

	public void test1() throws Exception {
		//addchild4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		AddChild3_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    &lt;&amp;&gt;&quot;&apos;!:&#x2030;\nThe added child element is without name.\r\n</FOO>\r\n");
	}

	public void test2() throws Exception {
		//addchild5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		AddChild3_wy_v1.main(new String[] {"inputs/file9_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO age=\"20\" unit=\"LB\" weight=\"80\" direction=\"north\">\r\n    <BAR1/>\r\n    <BAR2 x=\"1\"/>\r\n    <BAR3 x=\"1\" y=\"2\"/>\r\n    This elem contain some data with posi higher than BAR6.\r\n    <BAR4>\r\n        <BAR5/>\r\n        <BARBAR1/>\r\n        <BA1/>\r\n        <FOO1/>\r\n    </BAR4>\r\n    <BAR6>blah</BAR6>\r\n    <BAR7 x=\"1\">blah</BAR7>\r\n    <BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8>\r\n    <BAR9>abc</BAR9>\r\n    The added child element is without name.\r\n</FOO>\r\n");
	}

}
