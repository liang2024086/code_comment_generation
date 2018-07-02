package methodEmbedding.Standing_Ovation.S.LYD1696;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=null;
		BufferedWriter bw=null;
		File f=new File("d:/googlejam.txt");
		try{
			br=new BufferedReader(new FileReader("d:/A-small-attempt0.in"));
			bw=new BufferedWriter(new FileWriter(f));
			String line="";
			int all=Integer.parseInt(br.readLine());
			int c=1;
			while((line=br.readLine())!=null){
				String[] info=line.split(" ");
				int max=Integer.parseInt(info[0]);
				int accumulate=0;
				int need=0;
				for(int i=0;i<info[1].length();i++){
					int cur=Integer.parseInt(info[1].charAt(i)+"");
					if(i==0&&cur==0){
						need++;
						accumulate++;
					}
					else{
						if(accumulate>=i){
							accumulate+=cur;
						}else{
							while(accumulate<i){
								need++;
								accumulate++;
							}
							accumulate+=cur;
						}
					}
				}
				bw.write("Case #"+c+": ");
				c++;
				bw.write(need+"");
				bw.newLine();
				//System.out.println(info[1]+"\t"+need+"\t accumulate="+accumulate);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			br.close();
			bw.close();
		}
	}
}
