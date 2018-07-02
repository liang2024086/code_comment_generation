package parseTree.callGraph;

import java.util.LinkedList;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class VisitImportPackage extends VoidVisitorAdapter<Object> {

	private LinkedList<String> codes = new LinkedList<String>();
	
	public LinkedList<String> getCodes(){
		return codes;
	}	
	 @Override
        public void visit(ImportDeclaration n, Object arg) {
                String path = n.getName().toString();
                String[] parts = path.split(".");
//		if (parts != null){
                	for (String s : parts) {
                        	codes.add(s);
               		 }
//		}
        }

        @Override
        public void visit(PackageDeclaration n, Object arg) {
                String path = n.getName().toString();
                String[] parts = path.split(".");
//                if (parts != null){
			for (String s : parts) {
                        	codes.add(s);
			}
//                }
        }
}
