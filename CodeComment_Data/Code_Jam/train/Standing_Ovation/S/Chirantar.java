package methodEmbedding.Standing_Ovation.S.LYD184;

import java.io.*;

public class Chirantar {
	
	BufferedWriter writer;
	File file;
	String path="C:\\Users\\Chirantar\\Desktop\\codejam\\";
	String input=path+"A-small-attempt0.in";
	String output=path+"abc.out";
	BufferedReader reader;
	
	public static void main(String[] args){
		
		Chirantar chi=new Chirantar();
		String[] string = null;
		int length;
		int counter=0;
		int answer=0;
		chi.file =new File(chi.output);
		
		if (!chi.file.exists()) {
			try {
				chi.file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(chi.file.getAbsoluteFile());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			chi.reader=new BufferedReader(new FileReader(chi.input));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		chi.writer=new BufferedWriter(fw);
		
		int t = 0;
		
		try {
			t=Integer.valueOf(chi.reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<t;i++){
			
			try {
				string=chi.reader.readLine().trim().split("\\s+");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			length=Integer.valueOf(string[0])+1;
			counter=string[1].charAt(0);
			counter-=48;
			
			for(int j=1;j<length;j++){
				if(counter>=j){
					counter+=Integer.valueOf(string[1].charAt(j));
					counter+=-48;
				}
				else{
					answer+=(j-counter);
					counter=j;
					counter+=Integer.valueOf(string[1].charAt(j));
					counter+=-48;
				}
			}
			
			String ans="Case #"+(i+1)+": "+answer+"\n";
			
			try {
				chi.writer.write(ans);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			counter=0;
			answer=0;
		}
		
		System.out.println("done");
		
		try {
			chi.writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			chi.reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
