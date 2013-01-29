

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
		assertEquals(result, "<FOO unit=\"LB\">The added child element is without name.</FOO>");
	}

	public void test1() throws Exception {
		//addchild4.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		AddChild3_wy_v1.main(new String[] {"inputs/simple.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO><BAR/><BAR x=\"1\"/><BAR x=\"1\" y=\"2\"/><BAR><BAR/><BARBAR/><BA/><FOO/></BAR><BAR>blah</BAR><BAR x=\"1\">blah</BAR><BAR>&lt;&amp;&gt;&apos;&quot;</BAR><BAR>abc</BAR>\n&#x9;&lt;&amp;&gt;&quot;&apos;!:&#x2030;\nThe added child element is without name.</FOO>");
	}

	public void test2() throws Exception {
		//addchild5.out
		String result;
		ByteArrayOutputStream byteBuffer;

		byteBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteBuffer));
		AddChild3_wy_v1.main(new String[] {"inputs/file9_wy.xml"});
		result = new String(byteBuffer.toByteArray());
		assertEquals(result, "<FOO unit=\"LB\" weight=\"80\" direction=\"north\" age=\"20\"><BAR1/><BAR2 x=\"1\"/><BAR3 x=\"1\" y=\"2\"/>\n&#x9;This elem contain some data with posi higher than BAR6.\n&#x9;<BAR4><BAR5/><BARBAR1/><BA1/><FOO1/></BAR4><BAR6>blah</BAR6><BAR7 x=\"1\">blah</BAR7><BAR8>&lt;&amp;&gt;&apos;&quot;</BAR8><BAR9>abc</BAR9>The added child element is without name.</FOO>");
	}

}
