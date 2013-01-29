

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoParser1_vw_v1Tests extends TestCase {

//	public void test0() throws Exception {
//		//Parser_vw_v3_1.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_1.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLWriter.write(XMLWriter.java:141)\r\n\tat net.n3.nanoxml.XMLWriter.write(XMLWriter.java:103)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:53)\r\n");
//	}

	public void test1() throws Exception {
		//Parser_vw_v3_2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_2.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<BAR/>");
	}

	public void test2() throws Exception {
		//Parser_vw_v3_3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_3.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO><BAR/><BAR x=\"1\"/><BAR x=\"1\" y=\"2\"/><BAR><BAR/><BARBAR/><BA/><FOO/></BAR><BAR/><BAR x=\"1\">blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</FOO>");
	}

//	public void test3() throws Exception {
//		//Parser_vw_v3_4.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_4.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Nested Exception\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:226)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n*** Nested Exception:\r\njava.io.IOException: Unexpected EOF\r\n\tat net.n3.nanoxml.StdXMLReader.read(StdXMLReader.java:401)\r\n\tat net.n3.nanoxml.XMLUtil.skipWhitespace(XMLUtil.java:351)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:577)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:610)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test4() throws Exception {
//		//Parser_vw_v3_5.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_5.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Closing tag does not match opening tag: `FOO' != `BAR', SystemID='file:.', Line=15\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:510)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:590)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:610)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test5() throws Exception {
//		//Parser_vw_v3_6.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_6.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Closing tag does not match opening tag: `BAR' != `Bar', SystemID='file:.', Line=10\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:510)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:590)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:610)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

	public void test6() throws Exception {
		//Parser_vw_v3_7.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_7.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO><BAR/><BAR x=\"1\"/><BAR x=\"1\" y=\"2\"/><BAR><BAR/><BARBAR/><BA/><FOO/><BAR/>blah</BAR><BAR x=\"1\">blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</FOO>");
	}

	public void test7() throws Exception {
		//Parser_vw_v3_8.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_8.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<xml><BAR/><BAR x=\"1\"/><BAR x=\"1\" y=\"2\"/><BAR><BAR/><BARBAR/><BA/><FOO/></BAR><BAR>blah</BAR><BAR x=\"1\">blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</xml>");
	}

	public void test8() throws Exception {
		//Parser_vw_v3_9.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_9.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO><BAR/><BAR/><BAR/><BAR><BAR/><BARBAR/><BA/><FOO/></BAR><BAR>blah</BAR><BAR>blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</FOO>");
	}

//	public void test9() throws Exception {
//		//Parser_vw_v3_10.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_10.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Expected: delimited string, SystemID='file:.', Line=3\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:457)\r\n\tat net.n3.nanoxml.XMLUtil.scanString(XMLUtil.java:237)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:655)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:487)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:610)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test10() throws Exception {
//		//Parser_vw_v3_11.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_11.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Expected: `=', SystemID='file:.', Line=4\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:457)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:649)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:487)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:610)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

	public void test11() throws Exception {
		//Parser_vw_v3_12.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_12.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO><BAR/><BAR x=\"1\"/><BAR x=\"1\" y=\"2\"/><BAR><BAR/><BARBAR/><BA/><FOO/></BAR><BAR>blah</BAR><BAR x=\"1\">blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</FOO>");
	}

//	public void test12() throws Exception {
//		//Parser_vw_v3_13.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_13.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Expected: `=', SystemID='file:../inputs/testvw_13.xml', Line=1\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:457)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:649)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:487)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test13() throws Exception {
//		//Parser_vw_v3_14.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_14.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Nested Exception\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:226)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n*** Nested Exception:\r\njava.io.IOException: Unexpected EOF\r\n\tat net.n3.nanoxml.StdXMLReader.read(StdXMLReader.java:401)\r\n\tat net.n3.nanoxml.XMLUtil.skipComment(XMLUtil.java:68)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:353)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:290)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test14() throws Exception {
//		//Parser_vw_v3_15.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_15.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Nested Exception\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:226)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n*** Nested Exception:\r\njava.io.IOException: Unexpected EOF\r\n\tat net.n3.nanoxml.StdXMLReader.read(StdXMLReader.java:401)\r\n\tat net.n3.nanoxml.XMLUtil.skipComment(XMLUtil.java:68)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:353)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:290)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test15() throws Exception {
//		//Parser_vw_v3_16.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_16.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Duplicate attribute: x, SystemID='file:.', Line=3\r\n\tat net.n3.nanoxml.StdXMLBuilder.addAttribute(StdXMLBuilder.java:251)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:541)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:610)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

//	public void test16() throws Exception {
//		//Parser_vw_v3_17.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_17.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO z=\"defaultValue\" y=\"fixedValue\">blah</FOO>");
//	}
//
//	public void test17() throws Exception {
//		//Parser_vw_v3_18.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_18.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Expected: `>', SystemID='file:../inputs/testvw_18.xml', Line=2\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:457)\r\n\tat net.n3.nanoxml.StdXMLParser.processDocType(StdXMLParser.java:430)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:349)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:290)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test18() throws Exception {
//		//Parser_vw_v3_19.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_19.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Nested Exception\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:226)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n*** Nested Exception:\r\njava.io.FileNotFoundException: test.dtd (No such file or directory)\r\n\tat java.io.FileInputStream.open(Native Method)\r\n\tat java.io.FileInputStream.<init>(FileInputStream.java:106)\r\n\tat java.io.FileInputStream.<init>(FileInputStream.java:66)\r\n\tat sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:70)\r\n\tat sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:161)\r\n\tat java.net.URL.openStream(URL.java:1007)\r\n\tat net.n3.nanoxml.StdXMLReader.openStream(StdXMLReader.java:521)\r\n\tat net.n3.nanoxml.StdXMLParser.processDocType(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:349)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:290)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test19() throws Exception {
//		//Parser_vw_v3_20.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_20.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" Invalid entity: `&value;', SystemID='file:.', Line=3\r\n\tat net.n3.nanoxml.XMLUtil.errorInvalidEntity(XMLUtil.java:474)\r\n\tat net.n3.nanoxml.XMLUtil.scanEntity(XMLUtil.java:313)\r\n\tat net.n3.nanoxml.XMLUtil.read(XMLUtil.java:396)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:579)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:295)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:246)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:221)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test20() throws Exception {
//		//Parser_vw_v3_21.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_21.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">blah</FOO>");
//	}

	public void test21() throws Exception {
		//Parser_vw_v3_22.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_22.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\"><ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test22() throws Exception {
//		//Parser_vw_v3_23.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_23.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\"><BAR>vaz</BAR>\r\nblah</FOO>");
//	}
//
//	public void test23() throws Exception {
//		//Parser_vw_v3_24.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_24.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">blah\r\n<BAR> vaz</BAR></FOO>");
//	}
//
//	public void test24() throws Exception {
//		//Parser_vw_v3_25.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_25.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}

	public void test25() throws Exception {
		//Parser_vw_v3_26.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_26.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\"><ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test26() throws Exception {
//		//Parser_vw_v3_27.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_27.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test27() throws Exception {
//		//Parser_vw_v3_28.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_28.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test28() throws Exception {
//		//Parser_vw_v3_29.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_29.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\"><VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test29() throws Exception {
		//Parser_vw_v3_30.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_30.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\"><ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test30() throws Exception {
//		//Parser_vw_v3_31.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_31.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test31() throws Exception {
//		//Parser_vw_v3_32.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_32.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test32() throws Exception {
//		//Parser_vw_v3_33.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_33.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\"><VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test33() throws Exception {
		//Parser_vw_v3_34.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_34.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"haha\"><ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test34() throws Exception {
//		//Parser_vw_v3_35.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_35.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test35() throws Exception {
//		//Parser_vw_v3_36.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_36.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\"><BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test36() throws Exception {
//		//Parser_vw_v3_37.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_37.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\"><VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test37() throws Exception {
		//Parser_vw_v3_38.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_38.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\">vaz\n    <ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test38() throws Exception {
//		//Parser_vw_v3_39.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_39.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test39() throws Exception {
//		//Parser_vw_v3_40.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_40.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test40() throws Exception {
//		//Parser_vw_v3_41.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_41.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test41() throws Exception {
		//Parser_vw_v3_42.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_42.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\">vaz\n    <ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test42() throws Exception {
//		//Parser_vw_v3_43.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_43.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test43() throws Exception {
//		//Parser_vw_v3_44.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_44.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test44() throws Exception {
//		//Parser_vw_v3_45.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_45.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test45() throws Exception {
		//Parser_vw_v3_46.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_46.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"test1\">vaz\n    <ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test46() throws Exception {
//		//Parser_vw_v3_47.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_47.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test47() throws Exception {
//		//Parser_vw_v3_48.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_48.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test48() throws Exception {
//		//Parser_vw_v3_49.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_49.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test49() throws Exception {
		//Parser_vw_v3_50.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_50.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"test1\">vaz\n    <ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test50() throws Exception {
//		//Parser_vw_v3_51.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_51.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test51() throws Exception {
//		//Parser_vw_v3_52.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_52.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\">test\r\n<BAR>vaz</BAR>\r\nblah\r\n</FOO>");
//	}
//
//	public void test52() throws Exception {
//		//Parser_vw_v3_53.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_53.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"defaultValue\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test53() throws Exception {
		//Parser_vw_v3_54.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_54.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\">vaz\n</Foo>");
	}

//	public void test54() throws Exception {
//		//Parser_vw_v3_55.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_55.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test55() throws Exception {
//		//Parser_vw_v3_56.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_56.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test56() throws Exception {
//		//Parser_vw_v3_57.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_57.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test57() throws Exception {
		//Parser_vw_v3_58.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_58.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\">vaz\n<Blah xmlns=\"http://nanoxml.n3.net/foo\" x=\"2\"/></Foo>");
	}

//	public void test58() throws Exception {
//		//Parser_vw_v3_59.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_59.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test59() throws Exception {
//		//Parser_vw_v3_60.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_60.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test60() throws Exception {
//		//Parser_vw_v3_61.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_61.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test61() throws Exception {
		//Parser_vw_v3_62.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_62.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"test1\">vaz\n    <ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test62() throws Exception {
//		//Parser_vw_v3_63.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_63.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test63() throws Exception {
//		//Parser_vw_v3_64.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_64.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test64() throws Exception {
//		//Parser_vw_v3_65.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_65.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test65() throws Exception {
		//Parser_vw_v3_66.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_66.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"test1\" c=\"test2\">vaz\n    <ns:Bar xmlns:ns=\"http://nanoxml.n3.net/bar\"><Blah xmlns=\"http://nanoxml.n3.net/foo\" xmlns:ns=\"http://nanoxml.n3.net/bar\" x=\"1\" ns:x=\"2\"/></ns:Bar></Foo>");
	}

//	public void test66() throws Exception {
//		//Parser_vw_v3_67.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_67.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test67() throws Exception {
//		//Parser_vw_v3_68.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_68.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\">test\r\n<BAR>vaz</BAR></FOO>");
//	}
//
//	public void test68() throws Exception {
//		//Parser_vw_v3_69.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_69.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\">test\r\n<VAZ>vaz</VAZ>INCLUDE\r\n</FOO>");
//	}

	public void test69() throws Exception {
		//Parser_vw_v3_70.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_70.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\">vaz\n</Foo>");
	}

//	public void test70() throws Exception {
//		//Parser_vw_v3_71.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_71.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>");
//	}
//
//	public void test71() throws Exception {
//		//Parser_vw_v3_72.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_72.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>");
//	}
//
//	public void test72() throws Exception {
//		//Parser_vw_v3_73.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_73.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">INCLUDE\r\n</FOO>");
//	}

	public void test73() throws Exception {
		//Parser_vw_v3_74.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_74.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\">vaz\n</Foo>");
	}

//	public void test74() throws Exception {
//		//Parser_vw_v3_75.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_75.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>");
//	}
//
//	public void test75() throws Exception {
//		//Parser_vw_v3_76.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_76.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>");
//	}
//
//	public void test76() throws Exception {
//		//Parser_vw_v3_77.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_77.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">INCLUDE\r\n</FOO>");
//	}

	public void test77() throws Exception {
		//Parser_vw_v3_78.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_78.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"test1\" c=\"test3\" d=\"test4\">vaz\n</Foo>");
	}

//	public void test78() throws Exception {
//		//Parser_vw_v3_79.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_79.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\" a=\"5\">test\r\n</FOO>");
//	}
//
//	public void test79() throws Exception {
//		//Parser_vw_v3_80.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_80.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\" a=\"5\">test\r\n</FOO>");
//	}
//
//	public void test80() throws Exception {
//		//Parser_vw_v3_81.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_81.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\" a=\"7\">INCLUDE\r\n</FOO>");
//	}

	public void test81() throws Exception {
		//Parser_vw_v3_82.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_82.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo xmlns=\"http://nanoxml.n3.net/foo\" a=\"test\" b=\"test1\" c=\"test3\" d=\"test4\">vaz\n</Foo>");
	}

//	public void test82() throws Exception {
//		//Parser_vw_v3_83.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_83.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\" a=\"5\">test\r\n</FOO>");
//	}
//
//	public void test83() throws Exception {
//		//Parser_vw_v3_84.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_84.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\" a=\"5\">test\r\n</FOO>");
//	}
//
//	public void test84() throws Exception {
//		//Parser_vw_v3_85.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_85.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" y=\"2\" z=\"3\" a=\"7\">INCLUDE\r\n</FOO>");
//	}

	public void test85() throws Exception {
		//Parser_vw_v3_87.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO><BAR/><BAR x=\"1\"/><BAR x=\"1\" y=\"2\"/><BAR><BAR/><BARBAR/><BA/><FOO/></BAR><BAR>blah</BAR><BAR x=\"1\">blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n</FOO>");
	}

}
