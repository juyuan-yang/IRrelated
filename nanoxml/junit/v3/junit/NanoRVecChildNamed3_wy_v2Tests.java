

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRVecChildNamed3_wy_v2Tests extends TestCase {

	public void test0() throws Exception {
		//rvecchildnamed4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildNamed3_wy_v2.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements with the name BAR are: \r\n    <BAR/>\r\n\r\n    <BAR x=\"1\"/>\r\n\r\n    <BAR x=\"1\" y=\"2\"/>\r\n\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n\r\n    <BAR>blah</BAR>\r\n\r\n    <BAR x=\"1\">blah</BAR>\r\n\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n\r\n    <BAR>abc</BAR>\r\n\r\n");
	}

	public void test1() throws Exception {
		//rvecchildnamed5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildNamed3_wy_v2.main(new String[] {"inputs/file10_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements with the name BAR are: \r\n    <BAR/>\r\n\r\n    <BAR x=\"1\"/>\r\n\r\n    <BAR x=\"1\" y=\"2\"/>\r\n\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n\r\n    <BAR>blah</BAR>\r\n\r\n    <BAR x=\"1\">blah</BAR>\r\n\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n\r\n    <BAR>abc</BAR>\r\n\r\n");
	}

	public void test2() throws Exception {
		//rvecchildnamed6.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildNamed3_wy_v2.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements with the name BAR are: \r\n");
	}

	public void test3() throws Exception {
		//rvecchildnamed7.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildNamed3_wy_v2.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements with the name BAR are: \r\n");
	}

}
