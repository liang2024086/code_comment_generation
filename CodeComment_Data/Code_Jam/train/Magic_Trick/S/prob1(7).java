package methodEmbedding.Magic_Trick.S.LYD806;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class prob1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		int ans1=0,ans2=0,aCount=1,bCount=1,hitCount=0;
		String [][]a=new String[2][4];
		StringBuffer output = null;
		String result="";
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader(new File("C:/Google-Codejam/2014/Input.txt")));
			bw=new BufferedWriter(new FileWriter("c:/Google-Codejam/2014/output.txt"));
			int count=Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				output = new StringBuffer("Case #"+(i+1)+": ");
				ans1=Integer.parseInt(br.readLine());
				while(aCount++<ans1){
					br.readLine();
				}
				a[0]=br.readLine().split(" ");
				while(aCount++<=4){
					br.readLine();
				}
				ans2=Integer.parseInt(br.readLine());
				while(bCount++<ans2){
					br.readLine();
				}
				a[1]=br.readLine().split(" ");
				while(bCount++<=4){
					br.readLine();
				}
				for (int j = 0; j < 4; j++){
					for(int k = 0; k < 4; k++){
						if(a[0][j].equals(a[1][k])){
							hitCount++;
							result=a[0][j];
						}
					}
				}
				
				if(hitCount==0){
					output.append("Volunteer cheated!");
				}else if(hitCount==1){
					output.append(result);
				}else{
					output.append("Bad magician!");
				}
				bw.write(output.toString());
				bw.newLine();
				aCount=1;bCount=1;hitCount=0;ans1=0;ans2=0;
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
