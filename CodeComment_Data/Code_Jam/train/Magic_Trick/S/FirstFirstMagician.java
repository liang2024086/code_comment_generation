package methodEmbedding.Magic_Trick.S.LYD54;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.algos.langutils.AlgoUtils;

public class FirstFirstMagician
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader r=new BufferedReader(new FileReader("infile.in"));
		BufferedWriter w=new BufferedWriter(new FileWriter("outfile.out"));
		int T=Integer.parseInt(r.readLine());
		for(int i=1;i<=T;i++){
			Long[] selectedRowArr1 = null,selectedRowArr2 = null;
			int selectedRow1=Integer.parseInt(r.readLine());
			for(int j=1;j<=4;j++){
				if(j==selectedRow1){
					selectedRowArr1=AlgoUtils.parseLongArray(r.readLine());
				}else{
					r.readLine();
				}
			}
			int selectedRow2=Integer.parseInt(r.readLine());
			for(int j=1;j<=4;j++){
				if(j==selectedRow2){
					selectedRowArr2=AlgoUtils.parseLongArray(r.readLine());
				}else{
					r.readLine();
				}
			}
			Set<Long> set1=new HashSet<Long>(Arrays.asList(selectedRowArr1));
		    Set<Long> set2=new HashSet<Long>(Arrays.asList(selectedRowArr2));
		    set1.retainAll(set2);
		    if(set1.size()==1){
		    	String outString=String.format("Case #%s: %s\n",i,set1.iterator().next());
		    	w.append(outString);
		    }else if(set1.size()>1){
		    	String outString=String.format("Case #%s: %s\n",i,"Bad magician!");
		    	w.append(outString);
		    }else if(set1.size()==0){
		    	String outString=String.format("Case #%s: %s\n",i,"Volunteer cheated!");
		    	w.append(outString);
		    }
		}
		w.close();
		r.close();
	}
}
