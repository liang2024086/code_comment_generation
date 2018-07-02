package methodEmbedding.Magic_Trick.S.LYD955;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class QualA {
	private static int noOfTestCases;
	private static int q1Ans,q2Ans;
	private static List<String> selectedRow1 = new ArrayList<String>();
	private static List<String> selectedRow2 = new ArrayList<String>();
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String line;
		String[] elements;
		noOfTestCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfTestCases;i++){
			q1Ans=Integer.parseInt(br.readLine());
			for(int j=0;j<q1Ans-1;j++)
				br.readLine();
				line=br.readLine();
				elements=line.split(" ");
				for(String s:elements)
					selectedRow1.add(s);
				for(int j=0;j<4-q1Ans;j++)
					br.readLine();
			
			
				q2Ans=Integer.parseInt(br.readLine());
				for(int j=0;j<q2Ans-1;j++)
					br.readLine();
					line=br.readLine();
					elements=line.split(" ");
					for(String s:elements)
						selectedRow2.add(s);
					for(int j=0;j<4-q2Ans;j++)
						br.readLine();
					
				selectedRow1.retainAll(selectedRow2);
			
				if(selectedRow1.size()==1)
					System.out.println("Case #"+(i+1)+": "+selectedRow1.get(0));
				else if(selectedRow1.size()>1)
					System.out.println("Case #"+(i+1)+": "+"Bad magician!");
				else
					System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
				selectedRow1.clear();
				selectedRow2.clear();
			}
	}
}
