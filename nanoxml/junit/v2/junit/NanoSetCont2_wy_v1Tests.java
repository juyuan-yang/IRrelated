

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoSetCont2_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//setcont2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		SetCont2_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    &lt;&amp;&gt;&quot;&apos;!:&#x2030;\r\n</FOO>\r\n");
	}

	public void test1() throws Exception {
		//setcont3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		SetCont2_wy_v1.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO unit=\"LB\"/>\r\n");
	}

}
