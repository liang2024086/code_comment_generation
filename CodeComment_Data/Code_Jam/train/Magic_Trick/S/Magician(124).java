package methodEmbedding.Magic_Trick.S.LYD722;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Magician extends Template {

	static int nbr;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			int i,j,taille,number1,number2,a,cle2 = 0;
			String ch = "";
			Hashtable<Integer,Integer> h=new Hashtable<Integer, Integer>();
			File f2=new File("output.in");
			PrintWriter pw=new PrintWriter(f2);
			FileReader f1=new FileReader("input.in");
			BufferedReader br=new BufferedReader(f1);
			nbr=Integer.parseInt(br.readLine());
			
			for (i=0;i<nbr;i++){// for each cases
				number1=Integer.parseInt(br.readLine());	
				for(j=0;j<number1;j++){
			
				 ch=br.readLine();
				}
				
				StringTokenizer tok=new StringTokenizer(ch);
				while(tok.hasMoreTokens()){
					a=Integer.parseInt(tok.nextToken());
					h.put(a, 1);
				}
				
				for(j=number1;j<4;j++){	
					 ch=br.readLine();
				}
				
				number2=Integer.parseInt(br.readLine());	
				for(j=0;j<number2;j++){
					
				 ch=br.readLine();
				}
				tok=new StringTokenizer(ch);
				while(tok.hasMoreTokens()){
					a=Integer.parseInt(tok.nextToken());
					if(h.containsKey(a)){
					h.put(a, h.get(a)+1);
					}
					else{
						h.put(a, 1);
					}
				}
				Enumeration<Integer> e = h.keys();
				while(e.hasMoreElements()){
					int cle=e.nextElement();
					if(h.get(cle)<2){
						h.remove(cle);
					}
					else{
					   cle2=cle;
					}
				}
				taille=h.size();
				
				if(taille==1){
					pw.println("Case #" + (i + 1) + ": "+cle2);
				}
				else{
					if(taille>1){
					pw.println("Case #" + (i + 1) + ": Bad magician!");
					}
					else{
						pw.println("Case #" + (i + 1) + ": Volunteer cheated!");
					}
				}
				for(j=number2;j<4;j++){	
					 ch=br.readLine();
				}
				
			}
			pw.close();
	}

}
