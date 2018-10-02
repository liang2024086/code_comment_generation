package methodEmbedding.Speaking_in_Tongues.S.LYD39;

import java.io.*;
import java.util.*;
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	char c[];
		int count=0;
		try {
			FileOutputStream out=new FileOutputStream("out4.out");
			Scanner inFIle=new Scanner(new FileReader("A-small-attempt0.in") );
			int n=inFIle.nextInt();
			inFIle.nextLine();
			char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char e[]={'y','n','f','g','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
			char d[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
			while (n!=0) {
				count++;
				String str=inFIle.nextLine();
				//System.out.println(str);
				
				char newstr[]=str.toCharArray();
				//System.out.println(newstr);
				String str1="";
				for(int i=0;i<newstr.length;i++)
				{
						char c1=newstr[i];
						if((c1-32)!=0)
							str1=str1+d[c1-97];
						else
							str1=str1+c1;
						
				}
			//	System.out.println(str1);
				
					out.write(("Case #"+count+": "+str1+"\n").getBytes());
				System.out.println(str1);
				n--;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
