package methodEmbedding.Speaking_in_Tongues.S.LYD1322;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Googlerese {

	public static void main(String[] args) {
		
		try{
		
			Map<String,String> alfabetoMap = new HashMap<String,String>();
			alfabetoMap.put("y","a");
			alfabetoMap.put("n","b");
			alfabetoMap.put("f","c" );
			alfabetoMap.put("i","d");
			alfabetoMap.put("c","e");
			alfabetoMap.put("w","f");
			alfabetoMap.put("l","g");
			alfabetoMap.put("b","h" );
			alfabetoMap.put("k","i");
			alfabetoMap.put("u","j");
			alfabetoMap.put("o","k");
			alfabetoMap.put("m","l");
			alfabetoMap.put("x","m");
			alfabetoMap.put("s","n");
			alfabetoMap.put("e","o");
			alfabetoMap.put("v","p");
			alfabetoMap.put("z","q");
			alfabetoMap.put("p","r");
			alfabetoMap.put("d","s");
			alfabetoMap.put("r","t");
			alfabetoMap.put("j","u");
			alfabetoMap.put("g","v");
			alfabetoMap.put("t","w");
			alfabetoMap.put("h","x");
			alfabetoMap.put("a","y");
			alfabetoMap.put("q","z");
			alfabetoMap.put(" ", " ");
			
			BufferedReader fileGoo = new BufferedReader(new FileReader("A-small-attempt1 (1).in"));
			FileWriter miArchivo = new FileWriter("A-small-attempt1 (1).out");
			
			List<String> listaCasos = new ArrayList<String>();
			String s;
			while ((s = fileGoo.readLine()) != null) {
				listaCasos.add(s);
			}
			int casos = new Integer(listaCasos.get(0));
			
			if (casos>=1 && casos<=30){
				listaCasos.remove(0);
				int indc= 1; 
				for (String texto : listaCasos) {
						StringBuffer carta=new StringBuffer();
						for (int i=0;i<texto.length();i++){ 
							String caracter = Character.toString(texto.charAt(i));
							carta.append(alfabetoMap.get(caracter));
						}
						miArchivo.write("Case #" + indc + ": " + carta.toString().trim()+"\n");
						indc++;
				}
			}
			miArchivo.flush();
			miArchivo.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
