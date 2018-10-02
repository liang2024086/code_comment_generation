package methodEmbedding.Speaking_in_Tongues.S.LYD735;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.FileInputStream;



public class Main {


	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream(args[0]);
			FileOutputStream fo = new FileOutputStream("output.txt");
			
			InputStreamReader isr = new InputStreamReader(f);
			OutputStreamWriter osw = new OutputStreamWriter(fo);
			BufferedWriter bw = new BufferedWriter(osw);
			
			BufferedReader bis =new BufferedReader(isr);
			int iter = Integer.parseInt(bis.readLine());
			String crypt ="ynficwlbkuomxsevzpdrjgthaq ";
			String uncrypt="abcdefghijklmnopqrstuvwxyz ";
			System.out.println("Iter.."+iter);
			for(int i=0;i<iter;i++)
			{
				String temp=bis.readLine();
				String out="" ;
				for(int j=0;j<temp.length();j++)
				{
					
					out=out+uncrypt.charAt(crypt.indexOf(temp.charAt(j)));
				}
				
			
				bw.write("Case #"+(i+1)+": "+out);
				bw.newLine();
				
				
			}
			bw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
		
		

	}

}
