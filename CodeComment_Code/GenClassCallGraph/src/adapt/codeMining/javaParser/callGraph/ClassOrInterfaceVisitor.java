package adapt.codeMining.javaParser.callGraph;

import java.util.HashSet;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ClassOrInterfaceVisitor extends VoidVisitorAdapter{
	private HashSet<String> types=new HashSet<String>();
	@Override
	public void visit(ClassOrInterfaceType n, Object arg){	
		types.add(n.getName());
	}
	public HashSet<String> getContainedTypes(){
		return types;
	}
}
