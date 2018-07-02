package methodEmbedding.Standing_Ovation.S.LYD1983;


/**
 * 
 */
import java.io.*;
/**
 * @author Danay
 *
 */
public class Exercise1 {

	/**
	 * 
	 */
	public Exercise1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcases = 0,casenumber=0;
		int numberpeople=0, friends=0;
		BufferedReader br = null;
		BufferedWriter writer=null;
		String sCurrentLine;
		
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Danay\\Downloads\\A-small-attempt5.txt"), "utf-8"));
			br = new BufferedReader(new FileReader("C:\\Users\\Danay\\Downloads\\A-small-attempt5.in"));
			sCurrentLine = br.readLine();
			testcases=Integer.parseInt(sCurrentLine);
				for (int i=0; i<testcases;i++,numberpeople=0,friends=0){
					String line=br.readLine();
					String split_line[]=line.split(" ");
					casenumber = Integer.parseInt(split_line[0]);
					String split_case[]=split_line[1].split("");
					for (int j=0;j<=casenumber;j++){
						int s;
						s=Integer.parseInt(split_case[j]);
						if (j>numberpeople && s!=0){
							friends+=j-numberpeople;
							numberpeople+=s+(j-numberpeople);
						}else
						numberpeople+=s;
					}
					writer.write("Case #"+ (i+1) + ": "+ friends);
					writer.newLine();
					System.out.println("Case #"+ (i+1) + ": "+ friends);
					
				}
				
			
			
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
				writer.close();
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
						
	}

}
