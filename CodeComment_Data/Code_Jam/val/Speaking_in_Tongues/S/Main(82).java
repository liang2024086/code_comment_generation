package methodEmbedding.Speaking_in_Tongues.S.LYD1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
	
	
	static String[] cipher={"ejp mysljylc kd kxveddknmc re jsicpdrysi","rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","de kr kd eoya kw aej tysr re ujdr lkgc jv"};
	static String[] plain={"our language is impossible to understand","there are twenty six factorial possibilities","so it is okay if you want to just give up"};
	static char[] map=new char[30];
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		for(int i=0;i<30;i++)
			map[i]=0;
		
		map['z'-'a']='q';
		map['q'-'a']='z';
		for(int k=0;k<3;k++)
			for(int i=0;i<cipher[k].length();i++)
				if (cipher[k].charAt(i)!=' ')
					map[cipher[k].charAt(i)-'a']=plain[k].charAt(i);
		/*
		int[] tmp=new int[30];
		for(int i=0;i<=25;i++)
			if (map[i]!=0)
				tmp[map[i]-'a']=1;
		
		for(int i=0;i<=25;i++)
			if (tmp[i]==0)
				System.out.println("falta "+((char)(i+'a')));
	
		for(int i=0;i<=25;i++)
			if (map[i]==0)
				System.out.println("ERROR "+((char)(i+'a')));*/
		
		
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.valueOf(rd.readLine());
		for(int caso=1;caso<=T;caso++)
		{
			char[] array=rd.readLine().toCharArray();
			System.out.print("Case #"+caso+": ");
			for(int i=0;i<array.length;i++)
				if (array[i]==' ')
					System.out.print(" ");
				else
					System.out.print(map[array[i]-'a']+"");
			System.out.println();
		}
	}

}
