package methodEmbedding.Magic_Trick.S.LYD1987;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("/home/peddis/datafiles/data2.in"));
		String line= br.readLine();int rownum=1;int count=1;int selectRow1=0;int selectRow2=0;int rowct=1;
		ArrayList<Set> al = new ArrayList<Set>();
		while (null != (line = br.readLine())) {
			if(rownum%5==1){
				if(count==1){
					selectRow1 = Integer.parseInt(line);
					count++;
				}
				else{
					selectRow2 = Integer.parseInt(line)+4;	
					count=1;
				}
			}else {
				if(rowct==selectRow1 || rowct==selectRow2 ){
					//System.out.println("printing row: "+line);
					String[] input = line.split(" ");
					Set<Integer> h = new HashSet<Integer>();
					for(String s : input){
						h.add(Integer.parseInt(s));
					}
					al.add(h);
				}
				if(rowct<8)
					rowct++;
				else
					rowct=1;
			}
			
			rownum++;
		}
		br.close();
		int matchFound=0;int loopnum=1;
		for(int i=0;i<al.size();i=i+2){
			int match=0;
			Set<Integer> h1= al.get(i);
			Set<Integer> h2= al.get(i+1);
			for(Integer x : h1){
				if(h2.contains(x)){
					matchFound++;
					match=x;
				}
			}
			if(matchFound==1){
				System.out.println("Case #"+ loopnum++ +": "+match);				
			}else if(matchFound>1){
				System.out.println("Case #"+ loopnum++ +": Bad magician!");
			}else if(matchFound==0){
				System.out.println("Case #"+ loopnum++ +": Volunteer cheated!");
			}
			matchFound=0;
		}
	}

}
