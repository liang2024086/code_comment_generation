package methodEmbedding.Magic_Trick.S.LYD2185;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A {

	
	public static void main(String[] args) throws IOException{
		FileReader f=new FileReader("A-small-attempt2.in");
		BufferedReader bf=new BufferedReader(f);
	//	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(bf.readLine());
		
		File file=new File("C:\\Users\\techno city\\Desktop\\op.txt");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		int testCase=1;
		while(tests-->0){
			HashMap<Integer, Integer> map=new HashMap<>();
			ArrayList<Integer> list=new ArrayList<>();
			StringTokenizer st;
			int firstRow=Integer.parseInt(bf.readLine());
			for (int i = 1; i < 5; i++) {
				st=new StringTokenizer(bf.readLine());
				if (i==firstRow){
					
					while(st.hasMoreTokens()){
						int car=Integer.parseInt(st.nextToken());
						list.add(car);
					}
				}
			}
			int secondRow=Integer.parseInt(bf.readLine());
			for (int i = 1; i < 5; i++) {
				st=new StringTokenizer(bf.readLine());
				while(st.hasMoreElements()){
					int current=Integer.parseInt(st.nextToken());
					if (list.contains(current)){
						map.put(current, i);
					}
				}
			}
			
			//vol cheated
			boolean cheated=true;
			boolean bad=false;
			int badCount=0;
			int card=0;
			for (int i = 0; i < list.size(); i++) {
				if (map.get(list.get(i)) == secondRow){
					cheated=false;
					card=list.get(i);
					badCount++;
					if (badCount==2)
						bad=true;
				}
				
			}
			
			
			
			
			
			if (cheated)
				bw.write("Case #"+testCase+": "+"Volunteer cheated!");
			else if (bad)
				bw.write("Case #"+testCase+": "+"Bad magician!");
			else
				bw.write("Case #"+testCase+": "+card);
			
			bw.newLine();
			testCase++;
		}
		bw.close();
	}
}
