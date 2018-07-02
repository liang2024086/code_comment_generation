package methodEmbedding.Speaking_in_Tongues.S.LYD935;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programTwo {
	public static void main (String[]args){
		try{
			/*//open the file 
			FileInputStream fstream = new FileInputStream("C:\\Users\\bEcKhAm\\Downloads\\A-small-practice.in");
			
			//Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			new BufferedReader(new InputStreamReader(in));*/
			
			//Scanner scan = new Scanner(new FileReader("D:\\file2.in"));
			Scanner scan = new Scanner(new FileReader("D:\\A-small-attempt1.in"));
			int TC = scan.nextInt();
			String str =scan.nextLine();
			int lp=1;
			while(TC>0)
			{	str = scan.nextLine();
				int i,ch;
				int k[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t'
						,'n','w','j','p','f','m','a','q'};
				//System.out.println(str.length());
				System.out.print("Case #"+(lp++)+": ");
				for(i=0;i<str.length();i++){
					if(str.charAt(i)!=' '){
						int p = str.charAt(i);
						p=p-97;
						System.out.print((char)k[p]);
					}
					else
						System.out.print(' ');
					//System.out.println((char)ch);
				
				}
				System.out.println();
				TC--;
			}
				//System.out.print((char)k[0]);
			/*for(i=0;i<str.length();i++)
			{
				ch = str.charAt(i);
				
				
			}*/
			/*int i=0,k=0;
			int arrD;
			while(i < TC){
				arrD=scan.nextInt();
				System.out.println("arrD = "+arrD);
				int []a = new int[arrD];
				int []b = new int[arrD];
				for(k=0;k<arrD;k++){
					a[k]=scan.nextInt();
				}
				for(k=0;k<arrD;k++){
					b[k]=scan.nextInt();
				}
				
				for(k=0;k<arrD;k++){
					System.out.println(a[k] +"and"+ b[k]);
				}
				
			}
					*/
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
