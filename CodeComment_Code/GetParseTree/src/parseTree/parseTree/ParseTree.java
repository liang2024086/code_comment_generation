package parseTree.parseTree;

import java.util.LinkedList;
import java.util.Queue;
import parseTree.Vocabulary;
import parseTree.Bmcl;

public class ParseTree{

	private ParseTreeNode root = new ParseTreeNode();//根节点的父亲为-1
	private LinkedList<ParseTreeNode> parseTree = new LinkedList<ParseTreeNode>();
	private Vocabulary vocab = null;

private int number = -1;

	public ParseTree(int dim){
		parseTree.add(root);
		root.setIndex(parseTree.indexOf(root));
		root.setValue("root");

		vocab = new Vocabulary(dim);
	}

	public int length(){
		return parseTree.size();
	}

	public boolean hasChildren(int node){
		return parseTree.get(node).hasChildren();
	}

	public String getValue(int node){
		return parseTree.get(node).getValue();
	}

	public String getValue(){
		return getValue(parseTree.size()-1);
	}

	public String[] getFeatures(){
		return getFeatures(parseTree.size()-1);
	}

	public String[] getFeatures(int node){

		String [] result = new String[Bmcl.featureNum];

		int index = 0;
		for (int i = 0; i < parseTree.size(); ++i){
			if (!parseTree.get(i).hasChildren()){
				result[index] = parseTree.get(i).getValue();
				index ++;
				if (index == Bmcl.featureNum/2)
					break;
			}
		}

		if (index < Bmcl.featureNum/2){
			for (int j = index; j < Bmcl.featureNum/2; ++j)
				result[j] = null;
		}
		index = Bmcl.featureNum/2;

		int fatherIndex = node;
		while (true){
			fatherIndex = parseTree.get(fatherIndex).getFather();
			if (fatherIndex <= 0)
				break;
			
			result[index] = parseTree.get(fatherIndex).getValue();
			index ++;

			if (index == Bmcl.featureNum)
				break;
		}

		if (index < Bmcl.featureNum){
			for (int j = index; j < Bmcl.featureNum; ++j)
				result[j] = null;
		}

		return result;

	}

	public Vocabulary getVocabulary(){
		return this.vocab;
	}

	public int addNode(int father,String value){
		ParseTreeNode node = new ParseTreeNode(father,value);
		parseTree.add(node);
		int child = parseTree.indexOf(node);
		node.setIndex(child);
		parseTree.get(father).addChild(child);
		return child;
	}

	public void removeNode(int index){
		
	}

	public LinkedList<String> getChildren(){
		return getChildren(parseTree.size()-1);
	}

	public LinkedList<String> getChildren(int node){
		LinkedList<String> tmpChildren = new LinkedList<String>();

		for (Integer child : parseTree.get(node).getChildren()){
			tmpChildren.add(parseTree.get(child.intValue()).getValue());
		}

		return tmpChildren;
	}

	public void BFS(){
	    BFS(root,0,-1);
	}
	
	public void BFS(ParseTreeNode node, int n, int father){
		int index = ++number;
int aabbcc = Bmcl.functionNameToIndex.get(Bmcl.OwnMethodName);

		if (Bmcl.functionNameToIndex.containsKey(node.getValue()))
		{
			Bmcl.codePW.println(number + " " + father + " " + (-Bmcl.functionNameToIndex.get(node.getValue())) + " " + 0);
		}
		else{
			if (node.getChildren().size() == 0)
				Bmcl.codePW.println(number + " " + father + " " + Bmcl.vocabulary.getCodeWordIndex(node.getValue()) + " " + 0);
			else
				Bmcl.codePW.println(number + " " + father + " " + Bmcl.vocabulary.getCodeWordIndex(node.getValue()) + " " + node.getChildren().size());
		}
		LinkedList<String> tmpChildren = new LinkedList<String>();

		for (Integer child : node.getChildren()){
			tmpChildren.add(parseTree.get(child.intValue()).getValue());
		}

		for (Integer child : node.getChildren()){
			BFS(parseTree.get(child.intValue()),n+1,index);
		}
		return ;
	}

	public void DFS(){
		DFS(root,0,-1,0);
	}

	public void DFS(ParseTreeNode node, int n, int father,int level){
		int index = ++number;
//		vocab.addCode(node.getValue());
//		Bmcl.vocabulary.addCode(node.getValue());
//		System.out.println(number + " " + father + " " + Bmcl.vocabulary.getCodeWordIndex(node.getValue()));
int aabbcc = Bmcl.functionNameToIndex.get(Bmcl.OwnMethodName);

		if (Bmcl.functionNameToIndex.containsKey(node.getValue()))
		{
			Bmcl.codePW.println(number + " " + father + " " + (-Bmcl.functionNameToIndex.get(node.getValue())) + " " + 0 + " " + level);
			
if (aabbcc > Bmcl.functionNameToIndex.get(node.getValue()))
//System.out.println(aabbcc + " " + Bmcl.OwnMethodName + " " + node.getValue());
	Bmcl.abc1++;
else if (aabbcc == Bmcl.functionNameToIndex.get(node.getValue()))
	Bmcl.abc3++;
else Bmcl.abc2++;
		}
		else{
			if (node.getChildren().size() == 0)
				Bmcl.codePW.println(number + " " + father + " " + Bmcl.vocabulary.getCodeWordIndex(node.getValue()) + " " + 0 + " " + level);
			else
				Bmcl.codePW.println(number + " " + father + " " + Bmcl.vocabulary.getInterNodeIndex(node.getValue()) + " " + node.getChildren().size() + " " + level);
		}
//		Bmcl.codePW.println(number + " " + father + " " + node.getValue());
		LinkedList<String> tmpChildren = new LinkedList<String>();

		for (Integer child : node.getChildren()){
			tmpChildren.add(parseTree.get(child.intValue()).getValue());
		}


		for (Integer child : node.getChildren()){
			DFS(parseTree.get(child.intValue()),n+1,index,level+1);
		}
		return ;
	}

	public void addWord(){
		addWord(root);
	}

	private void addWord(ParseTreeNode node){
		if (Bmcl.functionNameToIndex.containsKey(node.getValue())){
//System.out.println("SODF");
		    Bmcl.vocabulary.addCode("NULL");
		}else if(node.getChildren().size() > 0){
		    Bmcl.vocabulary.addInterNodeWord(node.getValue());
		}
		else{
		  Bmcl.vocabulary.addCode(node.getValue());
		}
		
		LinkedList<String> tmpChildren = new LinkedList<String>();

		for (Integer child : node.getChildren()){
			tmpChildren.add(parseTree.get(child.intValue()).getValue());
		}


		for (Integer child : node.getChildren()){
			addWord(parseTree.get(child.intValue()));
		}
		return ;
	}

}
