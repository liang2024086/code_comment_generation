package methodEmbedding.Standing_Ovation.S.LYD1160;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Standing {
	static BufferedReader br;
	static BufferedWriter bw;
	static File file;
	static String path="/home/gov/Desktop/codejam/";
	static String inP=path+"A-small-attempt0.in";
	static String outP=path+"abc.out";
	public static void main(String[] args) throws NumberFormatException, IOException {
		file =new File(outP);
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		try {
			br=new BufferedReader(new FileReader(inP));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bw=new BufferedWriter(fw);
		int t;
		t=Integer.valueOf(br.readLine());
//		System.out.println(t);
		String[] str;
		int len,count=0,ans=0;
		for(int i=0;i<t;i++){
			str=br.readLine().trim().split("\\s+");
	//		System.out.println(str[0]);
	//		System.out.println(str[1]);
			len=Integer.valueOf(str[0])+1;
			count=str[1].charAt(0);
			count-=48;
	//		System.out.println("intij "+len);
			for(int j=1;j<len;j++){
				if(count>=j){
					count+=(Integer.valueOf(str[1].charAt(j))-48);
				}
				else{
					ans+=(j-count);
					count=j;
					count+=(Integer.valueOf(str[1].charAt(j))-48);
				}
//				System.out.println(j+"="+count+","+ans);
			}
			String strans="Case #"+(i+1)+": "+ans+"\n";
	//		System.out.println(strans);
			bw.write(strans);
	//		System.out.println(count);
			count=0;
			ans=0;
		}
		System.out.println("done");
		bw.close();
		br.close();
	}
}

