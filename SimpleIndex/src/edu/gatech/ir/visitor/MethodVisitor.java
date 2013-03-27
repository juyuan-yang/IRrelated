package edu.gatech.ir.visitor;

import edu.gatech.ir.SplitIndexFiles;
import edu.gatech.ir.parser.SimpleClass;
import edu.gatech.ir.parser.SimpleMethod;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.visitor.VoidVisitorAdapter;

public class MethodVisitor extends VoidVisitorAdapter {
	/*
	 * Parameters: arg here is SimpleClass which stores info of the class which this method is in
	 */
    @Override
    public void visit(MethodDeclaration n, Object arg) {
    	SimpleClass simpleClass = (SimpleClass)arg;
    	String method = n.getName();
    	String javadoc = (n.getJavaDoc() == null) ? "" : n.getJavaDoc().getContent();
    	SimpleMethod simpleMethod = new SimpleMethod(method, simpleClass, javadoc, "", n.toString());
    	simpleMethod.setLineInfo(n.getBeginLine(), n.getEndLine());
    	SplitIndexFiles.methods.add(simpleMethod);
    }
}
