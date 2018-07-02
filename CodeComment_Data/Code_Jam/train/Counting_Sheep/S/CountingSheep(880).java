package methodEmbedding.Counting_Sheep.S.LYD1097;


import java.util.*;
import java.io.*;
public class CountingSheep {
	 public static void main(String[] args) throws IOException {
		 File file = new File("C://A-small-attempt0.in");
		    File outFile = new File("C://output.txt");
		    BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		    int testCases = Integer.parseInt(br.readLine());
		   
		    
		    for(int t=1;t<=testCases;t++){
		    	ArrayList<Integer> keys = new ArrayList<Integer>();
		    	 ArrayList<Integer> key = new ArrayList<Integer>();
				    for(int j=0; j<10; j++){
				    	key.add(j);
				    }
		    	int wonder = 1;
		    	String workingInt = br.readLine();
		    	while(wonder<100000&&Integer.parseInt(workingInt)!=0){
		    	int code = Integer.parseInt(workingInt)*wonder ;
		        String[] coding = String.valueOf(code).split("");
		        for(int i =0; i< coding.length; i++){
		        	int thes = Integer.parseInt(coding[i]);
		        	keys.add(thes);
		        	
		        	}
		        if(keys.containsAll(key)){
	        		bw.write("Case #" + t + ": "+ code+ "\n");
	        		wonder=wonder+100000000;
		        	
		        }
		        wonder++;
		        }
		        if(Integer.parseInt(workingInt)==0){
		        	bw.write("Case #" + t + ": INSOMNIA " +"\n");
		        
		    }
		   
		    }
		    br.close();
		    bw.close();
	 }

}
