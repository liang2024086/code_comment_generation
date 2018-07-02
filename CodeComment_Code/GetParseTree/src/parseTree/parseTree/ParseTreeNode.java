package parseTree.parseTree;

import java.util.LinkedList;

public class ParseTreeNode{

	private int index;
	private int father;
	private String value;
	private LinkedList<Integer> children = new LinkedList<Integer>();
	
	public ParseTreeNode(){
		this.father = -1;
	}

	public ParseTreeNode(int father,String value){
		this.father = father;
		this.value = value;
	}

	public ParseTreeNode(int father,int index,String value){
		this.father = father;
		this.index = index;
		this.value = value;
	}

	public ParseTreeNode(int father, LinkedList<Integer> children,int index,String value){
		this.father = father;
		this.children = children;
		this.index = index;
		this.value = value;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return this.value;
	}

	public void setIndex(int index){
		this.index = index;
	}

	public int getIndex(){
		return this.index;
	}

	public int getFather(){
		return this.father;
	}

	public LinkedList<Integer> getChildren(){
		return this.children;
	}


	public boolean hasChildren(){
		if (children.size() == 0)
			return false;
		else
			return true;
	}

	public void changeFather(int father){
		this.father = father;
	}

	public boolean addChild(Integer child){
		if (!children.contains(child)){
			children.add(child);
			return true;
		}
		else
			return false;
	}

	public int removeChild(Integer child){
		if (!children.contains(child))
			return 0;
		else{
			children.remove(child);
			return 1;
		}
	}

	
}
