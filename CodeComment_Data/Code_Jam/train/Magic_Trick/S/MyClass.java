package methodEmbedding.Magic_Trick.S.LYD343;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 
 * 
 * @author ajs0031
 * @version 3-18-2014
 */
class MyClass {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ajs0031\\workspace\\Misc\\src\\input.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
		    int index = 0, row = 0;
		    int count = 1;
		    int caseCount = 1;
		    ArrayList<Integer> list1 = new ArrayList<Integer>();
		    ArrayList<Integer> list2 = new ArrayList<Integer>();
		    FileWriter fw = new FileWriter("C:\\Users\\ajs0031\\workspace\\Misc\\src\\output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String line; (line = br.readLine()) != null; ) {
		        if(index == 0) {
		        	
		        } else if(index % 5 == 1) {
		        	count = 1;
		        	row = Integer.parseInt(line);
		        } else if(index % 10 >=2 && index % 10 <= 5) {
		        	if(count == row) {
		        		String[] vals = line.split(" ");
		        		for(int i = 0; i < vals.length; i++) {
		        			list1.add(Integer.parseInt(vals[i]));
		        		}
		        	}
		        	count++;
		        } else if(index % 10 >=7 || index % 10 == 0) {
		        	if(count == row) {
		        		String[] vals = line.split(" ");
		        		for(int i = 0; i < vals.length; i++) {
		        			list2.add(Integer.parseInt(vals[i]));
		        		}
		        	}
		        	count++;
		        }
		        if(index % 10 == 0 && index != 0) {
		        	ArrayList<Integer> common = new ArrayList<Integer>();
		        	for(Integer val : list1) {
		        		if(list2.contains(val)) {
		        			common.add(val);
		        		}
		        	}
		        	if(common.isEmpty()) {
		        		bw.write("Case #" + caseCount + ": " + "Volunteer cheated!");
		        		bw.newLine();
		        	} else if(common.size() > 1) {
		        		bw.write("Case #" + caseCount + ": " + "Bad magician!");
		        		bw.newLine();
		        	} else {
		        		bw.write("Case #" + caseCount + ": " + common.get(0));
		        		bw.newLine();
		        	}
		        	caseCount++;
		        	list1.clear();
		        	list2.clear();
		        }
		        index++;
		    }
		    // line is not visible here.
			bw.close();
		}
		
	
	}

   
    }
