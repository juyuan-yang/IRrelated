package edu.gatech.ir.visitor;

import edu.gatech.ir.SplitIndexFiles;
import edu.gatech.ir.parser.SimpleClass;
import japa.parser.ast.body.ClassOrInterfaceDeclaration;
import japa.parser.ast.visitor.VoidVisitorAdapter;

public class ClassVisitor extends VoidVisitorAdapter {
	/*
	 * Parameters: arg here is package string for this class
	 */
	@Override
    public void visit(ClassOrInterfaceDeclaration n, Object arg) {
		String className = (String)arg + "." + n.getName();
		String javadoc = (n.getJavaDoc() == null) ? "" : n.getJavaDoc().getContent();
		SimpleClass simpleClass = new SimpleClass(className, javadoc, "");
		SplitIndexFiles.classes.add(simpleClass);
        new MethodVisitor().visit(n, simpleClass);
    }
}
