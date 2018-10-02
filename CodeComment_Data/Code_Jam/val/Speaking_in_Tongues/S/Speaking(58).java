package methodEmbedding.Speaking_in_Tongues.S.LYD934;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Speaking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String fichier ="C:\\result.txt";
		int compteurlignes = 0;
		int nombreCas ;
		ArrayList<String> langageNormal = new ArrayList<String>();
		ArrayList<String> googlerese = new ArrayList<String>();
		//lecture du fichier texte	
		try
		{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				compteurlignes++;
				//System.out.println(ligne);
				if (compteurlignes ==1)
				{
					nombreCas = Integer.valueOf(ligne);
				}
				else
				{
					googlerese.add(ligne);
					//System.out.println(ligne);
				}
				
			}
			br.close(); 
			
			
			
			String [] alphabetGooglerese = {"a","b","c","d","e","f","g","h","i","j",
					"k","l","m","n","o","p","q","r","s","t","u","v","w","x",
					"y","z"," "};
			
			
			String [] alphabetNormal ={"y","h","e","s","o","c","v","x","d","u",
					"i","g","l","b","k","r","z","t","n","w","j","p","f","m","a",
					"q"," "};
			
			String ligneGooglerese;
			String ligneLangageNormal;
			for(int i =0; i < googlerese.size();i++)
			{
				ligneGooglerese = googlerese.get(i);
				ligneLangageNormal ="";
				for(int j = 0; j<ligneGooglerese.length(); j++)
				{
					String letter;
					int temp = j+1;
					if(temp == ligneGooglerese.length() )
					{
						letter = ligneGooglerese.substring(j);
					}
					else
					{
						letter = ligneGooglerese.substring(j, j+1);
					}
					//System.out.print(letter); 
					for(int k =0; k<alphabetGooglerese.length;k++)
					{
						if(letter.equals(alphabetGooglerese[k]))
						{
							ligneLangageNormal +=alphabetNormal[k];
							break;
						}
					}
				}
				langageNormal.add(ligneLangageNormal);
				//System.out.println(ligneLangageNormal);
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		
		}
		
		
		//?crire dans le fichier
		try 
		{
			FileWriter fw = new FileWriter (fichier);
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter fichierSortie = new PrintWriter (bw); 
			for (int w =0; w<langageNormal.size();w++)
			{
				fichierSortie.println ("Case #"+(w+1)+": "+langageNormal.get(w)); 
			}
			fichierSortie.close();
			System.out.println("Le fichier " + fichier + " a ?t? cr??!"); 
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}	
		

	}

}
