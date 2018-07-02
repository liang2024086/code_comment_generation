package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1058;

import java.util.*;
import java.io.*;
class codejam2
{
	public static void main(String args[])throws IOException
{
	 int t;
	 String so="";
	int n;
	FileReader fr=new FileReader("B-small-attempt1.in");
	BufferedReader br=new BufferedReader(fr);
	String saty=br.readLine();
	t=Integer.parseInt(saty);
	
	
	int i;
	for(i=1;i<=t;i++)
	{
	   saty=br.readLine();
	   int j=-1,k=-1;
	   int count=0;
	   char s[]=saty.toCharArray();
	   while(true){
		   j=-1;
		   k=-1;
   for(int y=0;y<saty.length();y++){
	   if(s[y]=='+'){
		   j=y;
		   break;
		   }
	   }
	   for(int y=0;y<saty.length();y++){
	   if(s[y]=='-'){
		   k=y;
		   break;
		   }
	   }
		if(j==-1){
			count=count+1;
			break;
			}
		else if(k==-1){
			count+=0;
			break;
			}
		else{
			if(s[0]=='-' && j==saty.length()-1){
				count+=1;
				break;
				}
			else if(s[0]=='+' && k==saty.length()-1){
				count+=2;
				break;}
			else{
				if(s[0]!='-'){
					count+=2;
				}
				else{
					count+=1;
					}
					while((k<=saty.length()-1)){
					if(s[k]!='-')
					break;
					k++;
					}
				for(int z=0;z<k;z++){
					s[z]='+';
					}
				}
				}
			}
	   so=so+"Case #"+i+": "+count+"\n";
	}
	FileWriter fw=new FileWriter("output.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(so);
	bw.close();
	fw.close();
	
}
}
