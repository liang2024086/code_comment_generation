package methodEmbedding.Counting_Sheep.S.LYD1685;

import java.io.*;
import java.math.*;
import java.util.*;
public class CountingSmall {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
Scanner st = null;
FileReader fr=null;
		try{
			fr = new FileReader("A-small-attempt1.in");
			st = new Scanner(fr);
			PrintWriter pw = new PrintWriter("A-small-attempt1.out");
			int T = st.nextInt();
			//int [] numbs = new int[T];
			for(int i=0;i<T;i++){
				int sheep=st.nextInt();
				int sheep1=0;
				int c=2;
				
				Set<Character> allset = new HashSet<Character>();
				for(char a:Integer.toString(sheep).toCharArray() ) allset.add(a); 
				while(allset.size()<10){
				sheep1 = c*sheep;
				for(char a:Integer.toString(sheep1).toCharArray() ) allset.add(a);
				c++;
				if(c>90) {sheep1=-1;break;}
				}
				//numbs[i]=sheep1;
				if(sheep1==-1)
					pw.println("Case #"+(i+1)+": INSOMNIA");
				else
					pw.println("Case #"+(i+1)+": "+sheep1);
				
			}
			pw.close();
			
			
			
		}
		finally{

		}
		
		
	}

}
