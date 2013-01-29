

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoRVecChildren_wy_v2Tests extends TestCase {

	public void test0() throws Exception {
		//rvecchild1.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/emptyelem2_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n");
	}

	public void test1() throws Exception {
		//rvecchild2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/file3_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n");
	}

	public void test2() throws Exception {
		//rvecchild3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n");
	}

	public void test3() throws Exception {
		//rvecchild4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/file5_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n    <BAR9>abc</BAR9>\r\n\r\n    &lt;&amp;&gt;&quot;&apos;!:&#x2030;\r\n\r\n");
	}

	public void test4() throws Exception {
		//rvecchild5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/file6_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n    <BAR9>abc</BAR9>\r\n\r\n");
	}

	public void test5() throws Exception {
		//rvecchild6.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/file1_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n    <BAR1/>\r\n\r\n    <BAR2 x=\"1\"/>\r\n\r\n    <BAR3 x=\"1\" y=\"2\"/>\r\n\r\n    <BAR4>\r\n        <BAR5/>\r\n        <BARBAR1/>\r\n        <BA1/>\r\n        <FOO1/>\r\n    </BAR4>\r\n\r\n    <BAR6>blah</BAR6>\r\n\r\n    <BAR7 x=\"1\">blah</BAR7>\r\n\r\n    <BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8>\r\n\r\n    <BAR9>abc</BAR9>\r\n\r\n    &lt;&amp;&gt;&quot;&apos;!:&#x2030;\r\n\r\n");
	}

	public void test6() throws Exception {
		//rvecchild7.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		RVecChildren_wy_v2.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "All child elements are: \r\n    <BAR1/>\r\n\r\n    <BAR2 x=\"1\"/>\r\n\r\n    <BAR3 x=\"1\" y=\"2\"/>\r\n\r\n    <BAR4>\r\n        <BAR5/>\r\n        <BARBAR1/>\r\n        <BA1/>\r\n        <FOO1/>\r\n    </BAR4>\r\n\r\n    <BAR6>blah</BAR6>\r\n\r\n    <BAR7 x=\"1\">blah</BAR7>\r\n\r\n    <BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8>\r\n\r\n    <BAR9>abc</BAR9>\r\n\r\n");
	}

}
