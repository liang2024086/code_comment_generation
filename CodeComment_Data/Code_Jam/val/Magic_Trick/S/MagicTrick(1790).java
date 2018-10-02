package methodEmbedding.Magic_Trick.S.LYD759;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MagicTrick {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File(args[0]));
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		Queue<String> lines = new LinkedList<String>();
		String fileLine = null;
		while ((fileLine = br.readLine()) != null) {
			lines.add(fileLine);
		}
		br.close();
		
		int times = Integer.parseInt(lines.poll());
		
		int lineNum;
		PrintWriter writer = new PrintWriter("C:\\Users\\Shaun\\Desktop\\output.txt");
		for (int i=1;i<=times;i++) {
			List<Integer> line1 = new ArrayList<Integer>();
			List<Integer> line2 = new ArrayList<Integer>();
			String cardLine = null;
			lineNum=Integer.parseInt(lines.poll());
			for (int a=1;a<=4;a++) {
				if (a==lineNum) {
					cardLine=lines.poll();
				}else{
					lines.poll();
				}
			}
			for (String card : cardLine.split(" ")) {
				line1.add(Integer.parseInt(card));
			}
			System.out.println("lineNum1: "+lineNum);
			System.out.println("line1: "+line1);
			
			lineNum=Integer.parseInt(lines.poll());
			for (int a=1;a<=4;a++) {
				if (a==lineNum) {
					cardLine=lines.poll();
				}else{
					lines.poll();
				}
			}
			
			for (String card : cardLine.split(" ")) {
				line2.add(Integer.parseInt(card));
			}

			List<Integer> possible = new ArrayList<Integer>();
			for (Integer int2 : line2) {
				if (line1.contains(int2)) {
					possible.add(int2);
				}
			}
			System.out.println("lineNum2: "+lineNum);
			System.out.println("line2: "+line2);
			
			writer.print("Case #"+i+": ");
			if (possible.size()==1) {
				writer.print(possible.get(0));
			}else if (possible.size()==0) {
				writer.print("Volunteer cheated!");
			}else{
				writer.print("Bad magician!");
			}
			System.out.println("possible: "+possible);
			if (i!=times) {
				writer.println();
			}
		}
		writer.close();
	}
}
