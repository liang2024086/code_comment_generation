package methodEmbedding.Standing_Ovation.S.LYD1303;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Main {
	public static void main(String[] args) {
		try{
			File fo=new File("out.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(fo));
			PrintWriter pw=new PrintWriter(bw);
			
            FileReader f = new FileReader("A-small-attempt0.in");
            BufferedReader b = new BufferedReader(f);
            String s;
            //b.readLine();//??????
            //b.readLine();//??????
            b.readLine();//???????????????
            int l=0;
            //pw.println("Output\n");
            while((s = b.readLine())!=null){//1??????????????????
            	System.out.println(s);
            	int n=Integer.valueOf(s.charAt(0));
            	String[] s2=s.split(" ");
            	int zeronum=0;
            	l++;
            	for(int i=0;i<s2[1].length();i++){
            		if(s2[1].charAt(i) == '0'){
            			zeronum++;
            		}
            	}
            	pw.println("Case #"+l+": "+zeronum);
                
            }
            pw.close();
            
        }catch(Exception e){
            System.out.print(e);
        }
	}
}
