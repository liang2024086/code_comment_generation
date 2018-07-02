package parseTree.callGraph;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

public class CallGraph {
//	public static Logger logger=Logger.getLogger(CallGraph.class.getName());
	private HashMap<Integer,ArrayList<Integer> > outGraph=new HashMap<Integer,ArrayList<Integer> >(17000);
	private HashMap<Integer,ArrayList<Integer> > inGraph=new HashMap<Integer,ArrayList<Integer> >(17000);
	public List<Integer> getInNodes(int doc) {
		return inGraph.get(doc);
	}

	public List<Integer> getOutNodes(int doc) {
		return outGraph.get(doc);
	}

	public List<Integer> getTopology() {
		LinkedList<Integer> res=new LinkedList<Integer>();
		HashMap<Integer,Integer> indegrees=new HashMap<Integer,Integer>();
		int totalIndegree=0;
		for(Entry<Integer,ArrayList<Integer> > et:outGraph.entrySet()){//inGraph.entrySet()){
			Integer key=et.getKey();
			ArrayList<Integer> values=et.getValue();
			totalIndegree+=values.size();
			indegrees.put(key, values.size());
		}
//		System.out.println("initial totalIndegree:"+totalIndegree);
		while(totalIndegree!=0){

			boolean find=false;
			for(Entry<Integer,Integer> et:indegrees.entrySet()){
				Integer key=et.getKey();
				Integer value=et.getValue();
				if(value.intValue()==0){
					res.add(key);
					ArrayList<Integer> influenced=inGraph.get(key);//outGraph.get(key);
					for(Integer i:influenced){
						int tmp=indegrees.get(i);
						if(tmp>0){
							tmp--;	
							totalIndegree--;
						}
						
						indegrees.put(i, tmp);
					}
					indegrees.put(key, -1);//we use -1 to mark that this node has been considered 
					find=true;
				}
			}
			if(find==false){// this means that there is no topology sort in the graph, i.e. there exist cycles,so we randomly break up the cycle
				for(Entry<Integer,Integer> et:indegrees.entrySet()){
					Integer key=et.getKey();
					int value=et.getValue();
					if(value!=-1&&value!=0){
						res.add(key);
						totalIndegree-=value;
						ArrayList<Integer> influenced=inGraph.get(key);//outGraph.get(key);
						for(Integer i:influenced){
							int tmp=indegrees.get(i);
							if(tmp>0){
								tmp--;	
								totalIndegree--;
							}
							
							indegrees.put(i, tmp);
						}
						indegrees.put(key,-1);
						break;
					}
				}
			}
		}
		for(Entry<Integer,Integer> et:indegrees.entrySet()){
			Integer key=et.getKey();
			Integer value=et.getValue();
			if(value.intValue()!=-1){
				res.add(key);
			}
		}
		return res;
		
	}
	private String validateCallGraph(){
		if(outGraph.size()!=inGraph.size()){
			return "outGraph size "+outGraph.size()+" does not equal to inGraph size "+inGraph.size();
		}

		int totalInDegree=0;
		int totalOutDegree=0;
		for(Entry<Integer,ArrayList<Integer> > et:outGraph.entrySet()){
			totalOutDegree+=et.getValue().size();
		}
		for(Entry<Integer,ArrayList<Integer> > et:inGraph.entrySet()){
			totalInDegree+=et.getValue().size();
		}
		if(totalInDegree!=totalOutDegree){
			return "indegree "+totalInDegree+" does not equal to outdegree "+totalOutDegree;
		}

		return null;
	}
	public void buildGraph(String repo) throws IOException{
	//	for(String repo:repos){
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("../GenClassCallGraph/map/"+repo+"CallGraph.txt")));
			String line=null;
			while((line=br.readLine())!=null){
				int pos=line.indexOf(',');
				if(pos==-1){
					Integer key=Integer.valueOf(line);
					ArrayList<Integer> relatedNodes=new ArrayList<Integer>();
					outGraph.put(key, relatedNodes);
					if(!inGraph.containsKey(key)){
						ArrayList<Integer> tmp=new ArrayList<Integer>();
						inGraph.put(key, tmp);
					}
					//logger.info("NODE "+key+" outNodes: "+outGraph.get(key).size()+" inNodes: "+inGraph.get(key).size());
				}
				else{
					String curNodeString=line.substring(0, pos);
					Integer curNode=Integer.valueOf(curNodeString);
					String relatedNodesString=line.substring(pos+1);
					String[] relatedNodesStringParts=relatedNodesString.split(" ");	
					ArrayList<Integer> relatedNodes=new ArrayList<Integer>();
					for(String n:relatedNodesStringParts){
						Integer tmp=Integer.valueOf(n);
						relatedNodes.add(tmp);
						
						if(inGraph.containsKey(tmp)){
							ArrayList<Integer> value=inGraph.get(tmp);
							value.add(curNode);
						}
						else{
						
							ArrayList<Integer> value=new ArrayList<Integer>();
							value.add(curNode);
							inGraph.put(tmp, value);
						}
					}
					if(!inGraph.containsKey(curNode)){
						ArrayList<Integer> value=new ArrayList<Integer>();
						inGraph.put(curNode, value);
					}
					outGraph.put(curNode, relatedNodes);

				}
			}
//			for(Entry<Integer,ArrayList<Integer> > et:outGraph.entrySet()){
//				Integer key=et.getKey();
//				ArrayList<Integer> values=et.getValue();
//				for(Integer ig:values){
//					inGraph.get(ig).add(key);
//				}
//			}
			String validateRes=validateCallGraph();
			if(validateRes!=null){
				System.err.println(validateRes);
			}
			br.close();	
	//	}
	}

}
