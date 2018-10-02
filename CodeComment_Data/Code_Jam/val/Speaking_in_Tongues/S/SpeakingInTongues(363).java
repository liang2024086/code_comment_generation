package methodEmbedding.Speaking_in_Tongues.S.LYD574;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SpeakingInTongues {

	public static void main(String[] args) {
		new SpeakingInTongues();
	}

	private String[] cambios={"y","h","e","s","o","c","v","x","d","u","i","g","l","b","k","r"," q","t","n","w","j","p","f","m","a"," z"};
	private String[] cambiosOpcion={"y","h","e","s","o","c","v","x","d","u","i","g","l","b","k","r","z","t","n","w","j","p","f","m","a","q"};

	public SpeakingInTongues() {
		File entrada = new File("data/A-small-attempt0.in");
		File salida= new File("data/out.txt");
		try 
		{
			BufferedReader lector= new BufferedReader(new FileReader(entrada));
			PrintWriter escritor= new PrintWriter(salida);
			String linea=lector.readLine();
			int casos = Integer.parseInt(linea);
			for (int i = 0; i < casos; i++) 
			{
				linea=lector.readLine();
				String lineaResp="";
				char[] cadena= linea.toCharArray();
				for (int j = 0; j < cadena.length; j++) {
					int x= cadena[j]-97;
					if (x==-65) 
					{
						lineaResp+=" ";
					}
					else
					{
						System.out.println(cadena[j]+"="+cambiosOpcion[x]);
						lineaResp+=cambiosOpcion[x];
					}
					System.out.println(x);
				}
				escritor.println("Case #"+(i+1)+": "+lineaResp);
			}
			escritor.close();
		}
		catch (IOException  e){e.printStackTrace();}	
		System.out.println("Fin");
	}
}
