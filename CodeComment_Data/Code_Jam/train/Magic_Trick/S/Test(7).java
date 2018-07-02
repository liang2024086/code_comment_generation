package methodEmbedding.Magic_Trick.S.LYD698;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("text/A-small-attempt1.in"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				for(int i=0;i<Integer.parseInt(sCurrentLine);i++){
					int ans1 = Integer.parseInt(br.readLine());
					String theRow1 = null ;
					for(int j=0;j<4;j++){
						if(j==ans1-1){
							theRow1 = br.readLine();							
						}else{
							br.readLine();
						}
					}
					int ans2 = Integer.parseInt(br.readLine());
					String theRow2 = null ;
					for(int j=0;j<4;j++){
						if(j==ans2-1){
							theRow2 = br.readLine();							
						}else{
							br.readLine();
						}
					}
					HashMap<Integer, Integer> theMap = new HashMap<Integer, Integer>();
					String[] row1 = theRow1.split(" ");
					String[] row2 = theRow2.split(" ");
					
					for(int j=0;j<4;j++){
						theMap.put(Integer.parseInt(row1[j]), 1);
					}
					for(int j=0;j<4;j++){
						if(theMap.containsKey(Integer.parseInt(row2[j]))){
							theMap.put(Integer.parseInt(row2[j]), theMap.get(Integer.parseInt(row2[j]))+1);							
						}else{
							theMap.put(Integer.parseInt(row2[j]), 1);
						}
						
					}
					ArrayList<Integer> toRemove = new ArrayList<Integer>();
					for( Entry<Integer,Integer> e : theMap.entrySet()){
						if(e.getValue() <= 1){
							toRemove.add(e.getKey());
						}
					}
					for(int g=0;g<toRemove.size();g++){
						theMap.remove(toRemove.get(g));
					}
					
					if(theMap.size() == 1){						
						System.out.println("Case #"+(i+1)+": "+theMap.entrySet().iterator().next().getKey());
					}else if(theMap.size() > 1){
						System.out.println("Case #"+(i+1)+": Bad magician!");
					}else{
						System.out.println("Case #"+(i+1)+": Volunteer cheated!");
						
					}															
				}
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
