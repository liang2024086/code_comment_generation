package parseTree.callGraph;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import parseTree.MyFileRepresenter;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class VisitMethodCall extends VoidVisitorAdapter<Object>{

        private HashMap<String,String> variableType = new HashMap<String,String>();
	private HashMap<String,String> classVariableType = new HashMap<String,String>();
        private LinkedList<String> ownImport = new LinkedList<String>();
        private String ownPackage;
        private HashMap<String,Integer> classNameIndex = new HashMap<String,Integer>();
        private LinkedList<String> codes = new LinkedList<String>();
	private HashMap<String,MyFileRepresenter> classFileRep = new HashMap<String,MyFileRepresenter>();

        public VisitMethodCall(String ownPackage, LinkedList<String> ownImport, HashMap<String, Integer> classNameIndex,HashMap<String,String> classVariableType,HashMap<String,MyFileRepresenter> classFileRep) {
                this.ownPackage = ownPackage;
                this.ownImport = ownImport;
                this.classNameIndex = classNameIndex;
		this.classVariableType = classVariableType;
		this.classFileRep = classFileRep;
        }

        public LinkedList<String> getCodes(){
                return codes;
        }

        public void visit (MethodCallExpr n, Object arg){
                Expression exp = n.getScope();
                if(exp != null){
                        codes.add(exp.toStringWithoutComments());
                String name = exp.toStringWithoutComments();
                String method = n.getName().toString();
                String type = null;
		if (name != null){
	                if (classVariableType.containsKey(name)){
                        	type = classVariableType.get(name);
                	}
        	        else if (variableType.containsKey(name)){
	                        type = variableType.get(name);
	                }
        	}
        
                if (type != null){
			String methodFullName = type+"."+method;
                        if (classFileRep.containsKey(type)){
                                HashMap<String,LinkedList<String>> methodCodes = classFileRep.get(type).methodCodes;
                                if (methodCodes.containsKey(methodFullName))
                                        for (int i = 0;i < methodCodes.get(methodFullName).size();++i)
                                        {
                                                codes.add(methodCodes.get(methodFullName).get(i));
                                        }
                        }

                }
                }
                codes.add(n.getName());
//              System.out.println("method " + n.getName()+" " + n.getParentNode().getClass());
//              System.out.println(" variableName:" +eliminateSymbol(n.getScope().toString()));
        }

	private int judgeClass(String type){
                int i;
                int pos;
                for (i = 0; i < ownImport.size(); ++i){
                        String impo = ownImport.get(i);
                        pos = impo.lastIndexOf('.');
                        if (pos != -1){
                                if (type.equals(impo.substring(pos+1,impo.length())))
                                        return i;
                        }
                }

                return -1;
        }

        private String getClassFullName(String type){
                int pos = judgeClass(type);
                if (pos != -1)
                        return ownImport.get(pos)+"."+type;
                else {
                        String classString = ownPackage+"."+type;
                        if (classNameIndex.containsKey(classString))
                                return classString;
                        else return null;
                }
        }

        private String eliminateSymbol(String name){
                int pos = name.indexOf('[');
                if (pos == -1)
                        return name;
                else return name.substring(0,pos);
        }

}
