

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoWriter6_wy_v1Tests extends TestCase {

	public void test0() throws Exception {
		//writer6.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/emptyelem3_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <Flower smell=\"Sweet\" color=\"Red\" name=\"Rose\" season=\"Spring\"/>\r\n");
	}

	public void test1() throws Exception {
		//writer7.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file4_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO unit=\"LB\"/>\r\n");
	}

	public void test2() throws Exception {
		//writer8.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file10_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO>\r\n      <BAR/>\r\n      <BAR x=\"1\"/>\r\n      <BAR x=\"1\" y=\"2\"/>\r\n      <BAR>\r\n          <BAR/>\r\n          <BARBAR/>\r\n          <BA/>\r\n          <FOO/>\r\n      </BAR>\r\n      <BAR>blah</BAR>\r\n      <BAR x=\"1\">blah</BAR>\r\n      <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n      <BAR>abc</BAR>\r\n  </FOO>\r\n");
	}

	public void test3() throws Exception {
		//writer9.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file11_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO>\n   This element does not have children.\n   It just contain PCDATA.&#x9;\n</FOO>\r\n");
	}

	public void test4() throws Exception {
		//writer10.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO>\r\n      <BAR/>\r\n      <BAR x=\"1\"/>\r\n      <BAR x=\"1\" y=\"2\"/>\r\n      <BAR>\r\n          <BAR/>\r\n          <BARBAR/>\r\n          <BA/>\r\n          <FOO/>\r\n      </BAR>\r\n      <BAR>blah</BAR>\r\n      <BAR x=\"1\">blah</BAR>\r\n      <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n      <BAR>abc</BAR>\r\n      \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n  </FOO>\r\n");
	}

	public void test5() throws Exception {
		//writer11.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file12_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO age=\"20\" unit=\"LB\" weight=\"80\" direction=\"north\"/>\r\n");
	}

	public void test6() throws Exception {
		//writer12.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file7_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO age=\"20\" unit=\"LB\" weight=\"80\" direction=\"north\">\r\n      <BAR1/>\r\n      <BAR2 x=\"1\"/>\r\n      <BAR3 x=\"1\" y=\"2\"/>\r\n      <BAR4>\r\n          <BAR5/>\r\n          <BARBAR1/>\r\n          <BA1/>\r\n          <FOO1/>\r\n      </BAR4>\r\n      <BAR6>blah</BAR6>\r\n      <BAR7 x=\"1\">blah</BAR7>\r\n      <BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8>\r\n      <BAR9>abc</BAR9>\r\n  </FOO>\r\n");
	}

	public void test7() throws Exception {
		//writer13.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file8_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO unit=\"LB\">\n   This element does not have children.\n   It just contain PCDATA.&#x9;\n</FOO>\r\n");
	}

	public void test8() throws Exception {
		//writer14.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Writer6_wy_v1.main(new String[] {"inputs/file9_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "  <FOO age=\"20\" unit=\"LB\" weight=\"80\" direction=\"north\">\r\n      <BAR1/>\r\n      <BAR2 x=\"1\"/>\r\n      <BAR3 x=\"1\" y=\"2\"/>\r\n      \n&#x9;This elem contain some data with posi higher than BAR6.\n&#x9;\r\n      <BAR4>\r\n          <BAR5/>\r\n          <BARBAR1/>\r\n          <BA1/>\r\n          <FOO1/>\r\n      </BAR4>\r\n      <BAR6>blah</BAR6>\r\n      <BAR7 x=\"1\">blah</BAR7>\r\n      <BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8>\r\n      <BAR9>abc</BAR9>\r\n  </FOO>\r\n");
	}

}
