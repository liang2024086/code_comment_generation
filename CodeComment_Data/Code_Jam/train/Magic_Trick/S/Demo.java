package methodEmbedding.Magic_Trick.S.LYD454;

import java.io.*;


 
public class Demo
{
 
public static void main(String[] args) throws IOException 
{
 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		int matix1[]=new int[4];int matix2[]=new int[4];int t=1;
		int cas=1;

try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("A-small-attempt1.in"));
			int no=0;String lines1[]=new String[4];String lines2[]=new String[4];int first=-1;
			
			
			
			
			
			while ((sCurrentLine = br.readLine()) != null) {
			
		if(no==0)
		{t=Integer.parseInt(sCurrentLine);}
	 else if(no==1)			
	{first=Integer.parseInt(sCurrentLine);}
	else if(no==2)
	{lines1[0]=sCurrentLine;}
	else if(no==3)
	{lines1[1]=sCurrentLine;}
	else if(no==4)
	{lines1[2]=sCurrentLine;}
	else if(no==5)
	{lines1[3]=sCurrentLine;
	
	String[] tempy2 = lines1[first-1].split(" ");		
	matix1[0]=Integer.parseInt(tempy2[0]);matix1[1]=Integer.parseInt(tempy2[1]);
	matix1[2]=Integer.parseInt(tempy2[2]);matix1[3]=Integer.parseInt(tempy2[3]);
	}
	//matrix 2
	else if(no==6)
	{first=Integer.parseInt(sCurrentLine);}

	else if(no==7)
	{lines2[0]=sCurrentLine;}
	else if(no==8)
	{lines2[1]=sCurrentLine;}
	else if(no==9)
	{lines2[2]=sCurrentLine;}
	else if(no==10)
	{lines2[3]=sCurrentLine;
	
	String[] tempy1 = lines2[first-1].split(" ");		
	matix2[0]=Integer.parseInt(tempy1[0]);matix2[1]=Integer.parseInt(tempy1[1]);
	matix2[2]=Integer.parseInt(tempy1[2]);matix2[3]=Integer.parseInt(tempy1[3]);
	




	
	
	int count=0;int ans=-1;
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(matix1[i]==matix2[j])
			{
				count++;ans=matix1[i];
				
			}
		}
	}
	
	String a3=Integer.toString(ans);
	
	String a1="Case #";
	String a2=Integer.toString(cas);cas++;
	String amswer;
	if(count==1)
	{ amswer=a1+a2+": "+a3	;}
	else if(count>1)
	{ amswer=a1+a2+": Bad magician!";}
	else
	{amswer=a1+a2+": Volunteer cheated!";}
					
					String data = amswer;
 					String filename="anwser.txt";
    					File file =new File(filename);
 
    					//if file doesnt exists, then create it
    					if(!file.exists()){
    					file.createNewFile();
    					}
 
    					//true = append file
    					FileWriter fileWritter = new FileWriter(file.getName(),true);
    	    				BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	   			        bufferWritter.write(data);
					bufferWritter.newLine();
    	     			 	  bufferWritter.close();
 
	      				  
					//FILE WRITER CLOSES HERE
					
	}				
					
					
	no++;				
			if(no==11)
				no=1;
						
					
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}


						










}
 
}	
