package methodEmbedding.Speaking_in_Tongues.S.LYD506;

import java.io.*;

import javax.swing.*;

public class Appli {
	
	public static void main(String args[]) throws IOException
	{
		String filename; String ch_resultat="";
		String ch_infile="", ch_outfile="";		
		
		filename=JOptionPane.showInputDialog("Nom du fichier ?");
		ch_infile=filename; ch_outfile=filename;	
		StringBuffer infile = new StringBuffer (ch_infile) ;
		StringBuffer outfile = new StringBuffer (ch_outfile) ;
		
		StringBuffer resultat = new StringBuffer (ch_resultat) ;
		resultat=resultat.append("nombre de fichier  "  + filename +  "\n");		
		
		infile=infile.append (".in") ; 
		outfile=outfile.append (".out") ;
		BufferedReader fr = new BufferedReader (new FileReader (infile.toString())) ;
		
		int T=0;
		String G="", S=""; StringBuffer sbufS=null;
		String CH1="abcdefghijklmnopqrstuvwxyz ";
		String CH2="yhesocvxduiglbkrztnwjpfmaq ";
		int i,j;
		
		String ligne = fr.readLine() ;
		if (ligne != null)
		{	T=Integer.parseInt(ligne);
			FileWriter fw = new FileWriter (outfile.toString()) ;	
			PrintWriter pw = new PrintWriter (fw) ;
			for(i=1;i<=T;i++)
			{
				G = fr.readLine() ;
				int L=G.length();
				sbufS = new StringBuffer (S) ;
				for(j=0;j<L;j++)
				{
					int posCar = CH1.indexOf(G.charAt(j)) ;
					sbufS.append(CH2.charAt(posCar));
				}
				
				pw.println ("Case #"+i+": "+sbufS) ;
				
			}
			pw.close();
			
		}
		else
			JOptionPane.showMessageDialog(null, "Aucun resultat");
		
		
	}
}
