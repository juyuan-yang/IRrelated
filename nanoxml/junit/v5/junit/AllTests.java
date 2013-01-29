
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$

//		suite.addTestSuite(NanoAddChild1_wy_v1Tests.class);
		suite.addTestSuite(NanoAddChild2_wy_v1Tests.class);
		suite.addTestSuite(NanoAddChild3_wy_v1Tests.class);
		suite.addTestSuite(NanoCheckAttr1_wy_v1Tests.class);
		suite.addTestSuite(NanoCheckAttr2_wy_v1Tests.class);
		suite.addTestSuite(NanoCheckAttr3_wy_v1Tests.class);
		suite.addTestSuite(NanoCheckAttr4_wy_v1Tests.class);
		suite.addTestSuite(NanoCheckAttr5_wy_v1Tests.class);
		suite.addTestSuite(NanoCheckChildren1_wy_v3Tests.class);
		suite.addTestSuite(NanoCheckChildren2_wy_v3Tests.class);
		suite.addTestSuite(NanoCheckChildren3_wy_v3Tests.class);
		suite.addTestSuite(NanoCheckLeaf1_wy_v3Tests.class);
		suite.addTestSuite(NanoCheckLeaf2_wy_v3Tests.class);
		suite.addTestSuite(NanoCheckLeaf3_wy_v3Tests.class);
//		suite.addTestSuite(NanoCrElement1_wy_v1Tests.class);
//		suite.addTestSuite(NanoCrElement2_wy_v1Tests.class);
//		suite.addTestSuite(NanoCrElement3_wy_v2Tests.class);
		suite.addTestSuite(NanoParser1_vw_v1Tests.class);
//		suite.addTestSuite(NanoParser7_vw_v2Tests.class);
		suite.addTestSuite(NanoParser8_vw_v2Tests.class);
		suite.addTestSuite(NanoRAttrVal1_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal2_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal3_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal4_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal5_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal6_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal7_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal8_wy_v1Tests.class);
		suite.addTestSuite(NanoRAttrVal9_wy_v1Tests.class);
//		suite.addTestSuite(NanoRChildAtIndex1_wy_v1Tests.class);
//		suite.addTestSuite(NanoRChildAtIndex2_wy_v1Tests.class);
//		suite.addTestSuite(NanoRChildAtIndex3_wy_v1Tests.class);
		suite.addTestSuite(NanoRChildAtIndex4_wy_v1Tests.class);
		suite.addTestSuite(NanoRChildCount_wy_v1Tests.class);
		suite.addTestSuite(NanoRContent_wy_v1Tests.class);
		suite.addTestSuite(NanoREleName_wy_v1Tests.class);
		suite.addTestSuite(NanoRemoveAttr1_wy_v1Tests.class);
		suite.addTestSuite(NanoRemoveAttr2_wy_v1Tests.class);
//		suite.addTestSuite(NanoRemoveChild1_wy_v1Tests.class);
		suite.addTestSuite(NanoRemoveChild2_wy_v3Tests.class);
		suite.addTestSuite(NanoRemoveChild3_wy_v1Tests.class);
//		suite.addTestSuite(NanoRemoveChildIndex1_wy_v1Tests.class);
//		suite.addTestSuite(NanoRemoveChildIndex2_wy_v1Tests.class);
//		suite.addTestSuite(NanoRemoveChildIndex3_wy_v1Tests.class);
		suite.addTestSuite(NanoRemoveChildIndex4_wy_v1Tests.class);
		suite.addTestSuite(NanoREnumAttr_wy_v1Tests.class);
		suite.addTestSuite(NanoREnumChildren_wy_v2Tests.class);
		suite.addTestSuite(NanoRFirstChild1_wy_v3Tests.class);
		suite.addTestSuite(NanoRFirstChild2_wy_v3Tests.class);
		suite.addTestSuite(NanoRFirstChild3_wy_v3Tests.class);
		suite.addTestSuite(NanoRFirstChild4_wy_v2Tests.class);
		suite.addTestSuite(NanoRPropAttr_wy_v1Tests.class);
		suite.addTestSuite(NanoRVecChildNamed1_wy_v2Tests.class);
		suite.addTestSuite(NanoRVecChildNamed2_wy_v2Tests.class);
		suite.addTestSuite(NanoRVecChildNamed3_wy_v2Tests.class);
		suite.addTestSuite(NanoRVecChildren_wy_v2Tests.class);
//		suite.addTestSuite(NanoSetAttr1_wy_v1Tests.class);
//		suite.addTestSuite(NanoSetAttr2_wy_v1Tests.class);
//		suite.addTestSuite(NanoSetAttr3_wy_v1Tests.class);
		suite.addTestSuite(NanoSetAttr4_wy_v1Tests.class);
		suite.addTestSuite(NanoSetCont1_wy_v1Tests.class);
		suite.addTestSuite(NanoSetCont2_wy_v1Tests.class);
		suite.addTestSuite(NanoSetEleName1_wy_v1Tests.class);
//		suite.addTestSuite(NanoSetEleName2_wy_v1Tests.class);
		suite.addTestSuite(NanoWriter1_wy_v1Tests.class);
//		suite.addTestSuite(NanoWriter2_wy_v1Tests.class);
		suite.addTestSuite(NanoWriter3_wy_v1Tests.class);
		suite.addTestSuite(NanoWriter4_wy_v2Tests.class);
		suite.addTestSuite(NanoWriter5_wy_v2Tests.class);
		suite.addTestSuite(NanoWriter6_wy_v2Tests.class);
		suite.addTestSuite(NanoWriter7_wy_v2Tests.class);
		suite.addTestSuite(NanoWriter8_wy_v2Tests.class);
		suite.addTestSuite(NanoWriter9_wy_v2Tests.class);
//		suite.addTestSuite(NanoCrElement4_wy_v3Tests.class);
//		suite.addTestSuite(NanoCrElement5_wy_v3Tests.class);


		//$JUnit-END$
		return suite;
	}

}
