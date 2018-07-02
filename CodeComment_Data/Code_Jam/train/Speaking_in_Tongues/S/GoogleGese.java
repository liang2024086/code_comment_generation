package methodEmbedding.Speaking_in_Tongues.S.LYD107;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class GoogleGese {
	

	public static void main(String args[]) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader(new File("E:/DOWNLOADS/A-small-attempt2.in")));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("E:/DOWNLOADS/A-small-GoogleGese.out")));
		String line = reader.readLine();
		int k = Integer.parseInt(line);
		for(int i = 0 ; i < k ; i ++){
			line = reader.readLine();
			char[] cArray = line.toCharArray();
			for(int j=0;j<cArray.length;j++){
				if(cArray[j]=='a') cArray[j]='y';
				else if(cArray[j]=='b') cArray[j]='h';		
				else if(cArray[j]=='c') cArray[j]='e';	
				else if(cArray[j]=='d') cArray[j]='s';	
				else if(cArray[j]=='e') cArray[j]='o';	
				else if(cArray[j]=='f') cArray[j]='c';	
				else if(cArray[j]=='g') cArray[j]='v';	
				else if(cArray[j]=='h') cArray[j]='x';	
				else if(cArray[j]=='i') cArray[j]='d';	
				else if(cArray[j]=='j') cArray[j]='u';	
				else if(cArray[j]=='k') cArray[j]='i';	
				else if(cArray[j]=='l') cArray[j]='g';	
				else if(cArray[j]=='m') cArray[j]='l';	
				else if(cArray[j]=='n') cArray[j]='b';	
				else if(cArray[j]=='o') cArray[j]='k';	
				else if(cArray[j]=='p') cArray[j]='r';	
				else if(cArray[j]=='q') cArray[j]='z';	
				else if(cArray[j]=='r') cArray[j]='t';	
				else if(cArray[j]=='s') cArray[j]='n';	
				else if(cArray[j]=='t') cArray[j]='w';	
				else if(cArray[j]=='u') cArray[j]='j';	
				else if(cArray[j]=='v') cArray[j]='p';	
				else if(cArray[j]=='w') cArray[j]='f';	
				else if(cArray[j]=='x') cArray[j]='m';	
				else if(cArray[j]=='y') cArray[j]='a';	
				else if(cArray[j]=='z') cArray[j]='q';	
			}
			
	        int Case=i+1;
	   //     for (char c : cArray)  System.out.println(c);
			writer.write("Case #" + Case + ": ");
			String str=new String(cArray);
	        writer.write(str); 
	        if(Case==k){} else{writer.write("\n"); }
	   
			
		}
		reader.close();
		writer.close();
	}

}

