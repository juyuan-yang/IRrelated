

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import net.n3.nanoxml.*;

public class NanoParser1_vw_v1Tests extends TestCase {

//	public void test0() throws Exception {
//		//Parser_vw_v1_1.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_1.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.lang.NullPointerException\r\n\tat net.n3.nanoxml.XMLWriter.write(XMLWriter.java:109)\r\n\tat net.n3.nanoxml.XMLWriter.write(XMLWriter.java:91)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:53)\r\n");
//	}

	public void test1() throws Exception {
		//Parser_vw_v1_2.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_2.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<BAR/>\r\n");
	}

	public void test2() throws Exception {
		//Parser_vw_v1_3.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_3.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR/>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n</FOO>\r\n");
	}

//	public void test3() throws Exception {
//		//Parser_vw_v1_4.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_4.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.io.IOException: Unexpected EOF\r\n\tat net.n3.nanoxml.StdXMLReader.read(StdXMLReader.java:354)\r\n\tat net.n3.nanoxml.XMLUtil.skipWhitespace(XMLUtil.java:346)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:423)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test4() throws Exception {
//		//Parser_vw_v1_5.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_5.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 15: Closing tag does not match opening tag: `FOO' != `BAR'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test5() throws Exception {
//		//Parser_vw_v1_6.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_6.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 10: Closing tag does not match opening tag: `BAR' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

	public void test6() throws Exception {
		//Parser_vw_v1_7.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_7.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n        <BAR/>\r\n        blah\r\n    </BAR>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n</FOO>\r\n");
	}

	public void test7() throws Exception {
		//Parser_vw_v1_8.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_8.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<xml>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n</xml>\r\n");
	}

	public void test8() throws Exception {
		//Parser_vw_v1_9.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_9.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR/>\r\n    <BAR/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n</FOO>\r\n");
	}

//	public void test9() throws Exception {
//		//Parser_vw_v1_10.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_10.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 3: Expected: delimited string\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:450)\r\n\tat net.n3.nanoxml.XMLUtil.scanString(XMLUtil.java:237)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:485)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:382)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test10() throws Exception {
//		//Parser_vw_v1_11.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_11.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 4: Expected: `='\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:450)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:482)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:382)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

	public void test11() throws Exception {
		//Parser_vw_v1_12.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_12.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n</FOO>\r\n");
	}

//	public void test12() throws Exception {
//		//Parser_vw_v1_13.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_13.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 1: Expected: `='\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:450)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:482)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:382)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test13() throws Exception {
//		//Parser_vw_v1_14.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_14.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.io.IOException: Unexpected EOF\r\n\tat net.n3.nanoxml.StdXMLReader.read(StdXMLReader.java:354)\r\n\tat net.n3.nanoxml.XMLUtil.skipComment(XMLUtil.java:68)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:259)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:197)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test14() throws Exception {
//		//Parser_vw_v1_15.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_15.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.io.IOException: Unexpected EOF\r\n\tat net.n3.nanoxml.StdXMLReader.read(StdXMLReader.java:354)\r\n\tat net.n3.nanoxml.XMLUtil.skipComment(XMLUtil.java:68)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:259)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:197)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test15() throws Exception {
//		//Parser_vw_v1_16.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_16.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 3: Duplicate attribute: x\r\n\tat net.n3.nanoxml.StdXMLBuilder.addAttribute(StdXMLBuilder.java:191)\r\n\tat net.n3.nanoxml.StdXMLParser.processAttribute(StdXMLParser.java:487)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:382)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

//	public void test16() throws Exception {
//		//Parser_vw_v1_17.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_17.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO z=\"defaultValue\" y=\"fixedValue\">blah</FOO>\n");
//	}

//	public void test17() throws Exception {
//		//Parser_vw_v1_18.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_18.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 2: Expected: `>'\r\n\tat net.n3.nanoxml.XMLUtil.errorExpectedInput(XMLUtil.java:450)\r\n\tat net.n3.nanoxml.StdXMLParser.processDocType(StdXMLParser.java:332)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:255)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:197)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test18() throws Exception {
//		//Parser_vw_v1_19.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_19.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" java.io.FileNotFoundException: test.dtd (No such file or directory)\r\n\tat java.io.FileInputStream.open(Native Method)\r\n\tat java.io.FileInputStream.<init>(FileInputStream.java:106)\r\n\tat java.io.FileInputStream.<init>(FileInputStream.java:66)\r\n\tat sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:70)\r\n\tat sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:161)\r\n\tat java.net.URL.openStream(URL.java:1007)\r\n\tat net.n3.nanoxml.StdXMLReader.openStream(StdXMLReader.java:463)\r\n\tat net.n3.nanoxml.StdXMLParser.processDocType(StdXMLParser.java:336)\r\n\tat net.n3.nanoxml.StdXMLParser.processSpecialTag(StdXMLParser.java:255)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:197)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test19() throws Exception {
//		//Parser_vw_v1_20.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_20.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 3: Invalid entity: `&value;'\r\n\tat net.n3.nanoxml.XMLUtil.errorInvalidEntity(XMLUtil.java:465)\r\n\tat net.n3.nanoxml.XMLUtil.scanEntity(XMLUtil.java:310)\r\n\tat net.n3.nanoxml.XMLUtil.read(XMLUtil.java:391)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:425)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

//	public void test20() throws Exception {
//		//Parser_vw_v1_21.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_21.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">blah</FOO>\n");
//	}

//	public void test21() throws Exception {
//		//Parser_vw_v1_22.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_22.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}

//	public void test22() throws Exception {
//		//Parser_vw_v1_23.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_23.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    <BAR>vaz</BAR>\r\n    \nblah\r\n</FOO>\r\n");
//	}
//
//	public void test23() throws Exception {
//		//Parser_vw_v1_24.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_24.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    blah\r\n\r\n    <BAR> vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test24() throws Exception {
//		//Parser_vw_v1_25.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_25.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test25() throws Exception {
//		//Parser_vw_v1_26.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_26.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test26() throws Exception {
//		//Parser_vw_v1_27.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_27.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test27() throws Exception {
//		//Parser_vw_v1_28.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_28.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test28() throws Exception {
//		//Parser_vw_v1_29.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_29.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test29() throws Exception {
//		//Parser_vw_v1_30.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_30.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test30() throws Exception {
//		//Parser_vw_v1_31.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_31.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test31() throws Exception {
//		//Parser_vw_v1_32.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_32.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test32() throws Exception {
//		//Parser_vw_v1_33.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_33.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test33() throws Exception {
//		//Parser_vw_v1_34.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_34.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test34() throws Exception {
//		//Parser_vw_v1_35.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_35.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test35() throws Exception {
//		//Parser_vw_v1_36.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_36.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test36() throws Exception {
//		//Parser_vw_v1_37.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_37.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test37() throws Exception {
//		//Parser_vw_v1_38.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_38.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test38() throws Exception {
//		//Parser_vw_v1_39.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_39.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test39() throws Exception {
//		//Parser_vw_v1_40.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_40.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test40() throws Exception {
//		//Parser_vw_v1_41.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_41.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test41() throws Exception {
//		//Parser_vw_v1_42.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_42.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test42() throws Exception {
//		//Parser_vw_v1_43.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_43.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test43() throws Exception {
//		//Parser_vw_v1_44.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_44.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test44() throws Exception {
//		//Parser_vw_v1_45.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_45.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test45() throws Exception {
//		//Parser_vw_v1_46.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_46.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test46() throws Exception {
//		//Parser_vw_v1_47.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_47.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test47() throws Exception {
//		//Parser_vw_v1_48.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_48.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test48() throws Exception {
//		//Parser_vw_v1_49.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_49.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test49() throws Exception {
//		//Parser_vw_v1_50.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_50.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test50() throws Exception {
//		//Parser_vw_v1_51.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_51.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test51() throws Exception {
//		//Parser_vw_v1_52.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_52.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n    \r\nblah\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test52() throws Exception {
//		//Parser_vw_v1_53.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_53.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"2\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}

	public void test53() throws Exception {
		//Parser_vw_v1_54.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_54.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo a=\"test\" xmlns=\"http://nanoxml.n3.net/foo\">vaz\n</Foo>\r\n");
	}

//	public void test54() throws Exception {
//		//Parser_vw_v1_55.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_55.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test55() throws Exception {
//		//Parser_vw_v1_56.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_56.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test56() throws Exception {
//		//Parser_vw_v1_57.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_57.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}

	public void test57() throws Exception {
		//Parser_vw_v1_58.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_58.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo a=\"test\" xmlns=\"http://nanoxml.n3.net/foo\">\r\n    vaz\n\r\n    <Blah x=\"1\" ns:x=\"2\"/>\r\n</Foo>\r\n");
	}

//	public void test58() throws Exception {
//		//Parser_vw_v1_59.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_59.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test59() throws Exception {
//		//Parser_vw_v1_60.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_60.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test60() throws Exception {
//		//Parser_vw_v1_61.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_61.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test61() throws Exception {
//		//Parser_vw_v1_62.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_62.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test62() throws Exception {
//		//Parser_vw_v1_63.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_63.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"3\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test63() throws Exception {
//		//Parser_vw_v1_64.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_64.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"3\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test64() throws Exception {
//		//Parser_vw_v1_65.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_65.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"3\" y=\"2\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}
//
//	public void test65() throws Exception {
//		//Parser_vw_v1_66.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_66.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "Exception in thread \"main\" net.n3.nanoxml.XMLParseException: XML Not Well-Formed at Line 19: Closing tag does not match opening tag: `ns:Bar' != `Bar'\r\n\tat net.n3.nanoxml.XMLUtil.errorWrongClosingTag(XMLUtil.java:497)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:436)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.processElement(StdXMLParser.java:451)\r\n\tat net.n3.nanoxml.StdXMLParser.scanSomeTag(StdXMLParser.java:202)\r\n\tat net.n3.nanoxml.StdXMLParser.scanData(StdXMLParser.java:159)\r\n\tat net.n3.nanoxml.StdXMLParser.parse(StdXMLParser.java:133)\r\n\tat Parser1_vw_v1.main(Parser1_vw_v1.java:51)\r\n");
//	}
//
//	public void test66() throws Exception {
//		//Parser_vw_v1_67.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_67.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"3\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test67() throws Exception {
//		//Parser_vw_v1_68.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_68.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"3\" y=\"2\">\r\n    test\r\n\r\n    <BAR>vaz</BAR>\r\n</FOO>\r\n");
//	}
//
//	public void test68() throws Exception {
//		//Parser_vw_v1_69.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_69.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"3\" y=\"2\">\r\n    test\r\n\r\n    <VAZ>vaz</VAZ>\r\n    INCLUDE\r\n\r\n</FOO>\r\n");
//	}

	public void test69() throws Exception {
		//Parser_vw_v1_70.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_70.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo a=\"test\" xmlns=\"http://nanoxml.n3.net/foo\">vaz\n</Foo>\r\n");
	}

//	public void test70() throws Exception {
//		//Parser_vw_v1_71.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_71.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>\r\n");
//	}
//
//	public void test71() throws Exception {
//		//Parser_vw_v1_72.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_72.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>\r\n");
//	}
//
//	public void test72() throws Exception {
//		//Parser_vw_v1_73.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_73.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">INCLUDE\r\n</FOO>\r\n");
//	}

	public void test73() throws Exception {
		//Parser_vw_v1_74.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_74.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo a=\"test\" xmlns=\"http://nanoxml.n3.net/foo\">vaz\n</Foo>\r\n");
	}

//	public void test74() throws Exception {
//		//Parser_vw_v1_75.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_75.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>\r\n");
//	}
//
//	public void test75() throws Exception {
//		//Parser_vw_v1_76.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_76.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">test\r\n</FOO>\r\n");
//	}
//
//	public void test76() throws Exception {
//		//Parser_vw_v1_77.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_77.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" z=\"defaultValue\" y=\"fixedValue\">INCLUDE\r\n</FOO>\r\n");
//	}

	public void test77() throws Exception {
		//Parser_vw_v1_78.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_78.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo b=\"test1\" a=\"test\" d=\"test4\" xmlns=\"http://nanoxml.n3.net/foo\" c=\"test3\">vaz\n</Foo>\r\n");
	}

//	public void test78() throws Exception {
//		//Parser_vw_v1_79.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_79.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" a=\"5\" z=\"3\" y=\"2\">test\r\n</FOO>\r\n");
//	}
//
//	public void test79() throws Exception {
//		//Parser_vw_v1_80.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_80.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" a=\"5\" z=\"3\" y=\"2\">test\r\n</FOO>\r\n");
//	}
//
//	public void test80() throws Exception {
//		//Parser_vw_v1_81.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_81.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" a=\"7\" z=\"3\" y=\"2\">INCLUDE\r\n</FOO>\r\n");
//	}

	public void test81() throws Exception {
		//Parser_vw_v1_82.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/testvw_82.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<Foo b=\"test1\" a=\"test\" d=\"test4\" xmlns=\"http://nanoxml.n3.net/foo\" c=\"test3\">vaz\n</Foo>\r\n");
	}

//	public void test82() throws Exception {
//		//Parser_vw_v1_83.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_83.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" a=\"5\" z=\"3\" y=\"2\">test\r\n</FOO>\r\n");
//	}
//
//	public void test83() throws Exception {
//		//Parser_vw_v1_84.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_84.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" a=\"5\" z=\"3\" y=\"2\">test\r\n</FOO>\r\n");
//	}
//
//	public void test84() throws Exception {
//		//Parser_vw_v1_85.out
//		String result;
//		ByteArrayOutputStream byteBuffer;
//
//		byteBuffer = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(byteBuffer));
//		Parser1_vw_v1.main(new String[] {"inputs/testvw_85.xml"});
//		result = new String(byteBuffer.toByteArray());
//		assertEquals(result, "<FOO x=\"1\" a=\"7\" z=\"3\" y=\"2\">INCLUDE\r\n</FOO>\r\n");
//	}

	public void test85() throws Exception {
		//Parser_vw_v1_87.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		Parser1_vw_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO>\r\n    <BAR/>\r\n    <BAR x=\"1\"/>\r\n    <BAR x=\"1\" y=\"2\"/>\r\n    <BAR>\r\n        <BAR/>\r\n        <BARBAR/>\r\n        <BA/>\r\n        <FOO/>\r\n    </BAR>\r\n    <BAR>blah</BAR>\r\n    <BAR x=\"1\">blah</BAR>\r\n    <BAR>&lt;&amp;&gt;&apos;&quot;</BAR>\r\n    <BAR>abc</BAR>\r\n    \n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\n\r\n</FOO>\r\n");
	}

}
