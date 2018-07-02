package methodEmbedding.Speaking_in_Tongues.S.LYD1671;

import java.util.Scanner;
public class cjam1 {
	public static void main(String ar[])
	{
		
		String fin="";
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		String inp=in.nextLine();
		int count=1;
		while(t!=0)
		{
				inp=in.nextLine();
				
			 for(int j=0;j<inp.length();j++){
			       // j++;
				char s=inp.charAt(j);
			        if (s =='a'){
			        	fin=fin+"y";
			        } 
			        else if(s =='b')
			        {
			           fin=fin+"h";
			        }
			         else if(s == 'c')
			        {
			            fin=fin+"e";
			        }
			         else if(s == 'd')
			        {
			            fin=fin+"s";
			        }
			         else if(s == 'e')
			        {
			            fin=fin+"o";
			        }
			         else if(s == 'f')
			        {
			            fin=fin+"c";
			        }
			         else if(s == 'g')
			        {
			            fin=fin+"v";
			        }
			         else if(s == 'h')
			        {
			            fin=fin+"x";
			        }
			         else if(s == 'i')
			        {
			            fin=fin+"d";
			        }
			         else if(s == 'j')
			        {
			            fin=fin+"u";
			        }
			         else if(s == 'k')
			        {
			            fin=fin+"i";
			        }
			         else if(s == 'l')
			        {
			            fin=fin+"g";
			        }
			         else if(s == 'm')
			        {
			            fin=fin+"l";
			        }
			         else if(s == 'n')
			        {
			            fin=fin+"b";
			        }
			         else if(s== 'o')
			        {
			            fin=fin+"k";
			        }
			         else if(s== 'p')
			        {
			            fin=fin+"r";
			        }
			         else if(s== 'q')
			        {
			            fin=fin+"z";
			        }
			         else if(s== 'r')
			        {
			            fin=fin+"t";
			        }
			         else if(s== 's')
			        {
			            fin=fin+"n";
			        }
			         else if(s== 't')
			        {
			            fin=fin+"w";
			        }
			         else if(s== 'u')
			        {
			            fin=fin+"j";
			        }
			         else if(s== 'v')
			        {
			            fin=fin+"p";
			        }
			         else if(s== 'w')
			        {
			            fin=fin+"f";
			        }
			         else if(s== 'x')
			        {
			            fin=fin+"m";
			        }
			         else if(s== 'y')
			        {
			            fin=fin+"a";
			        }
			         else if(s== 'z')
			        {
			            fin=fin+"q";
			        }
			        else{
			            fin=fin+s;
			        }
			 }
			 System.out.println("Case #"+count+": "+fin);
			 t--;
			 count++;
			 fin="";
			
		}
	}
}
