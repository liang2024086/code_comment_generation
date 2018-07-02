package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1358;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

public class Main {
	
	public static void main (String[] args) throws IOException, ParseException {
		System.out.println ("Inicia procesamiento...");
		long t = System.currentTimeMillis();
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setGroupingSeparator(',');
		symbols.setDecimalSeparator('.');
		String pattern = "#####0.0#####";
		DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		decimalFormat.setParseBigDecimal(true);
		
		String fileName = "B-small-attempt0";
		PrintWriter writer = new PrintWriter (fileName + ".out");
		
		BufferedReader br = new BufferedReader(new FileReader(fileName + ".in"));
		int casos = Integer.parseInt(br.readLine());
		for (int i = 1; i <= casos; i++) {
		   String[] parametros = br.readLine().split(" ");
		   
		   BigDecimal c = (BigDecimal) decimalFormat.parse(parametros[0]);
		   BigDecimal f = (BigDecimal) decimalFormat.parse(parametros[1]);
		   BigDecimal x = (BigDecimal) decimalFormat.parse(parametros[2]);
		   BigDecimal dos = new BigDecimal(2);
		   
		   BigDecimal tmin = x.divide(dos);
		   BigDecimal tgranjas = BigDecimal.ZERO;
		   BigDecimal tasa = dos;
		   
		   while (true) {
			   // C / (2 + granjas * f)
			   tgranjas = tgranjas.add(c.divide(tasa, 7, RoundingMode.HALF_DOWN));
			   
			   // incrementamos la tasa
			   tasa = tasa.add(f);

			   // calculamos el tiempo total
			   BigDecimal total = tgranjas.add (x.divide(tasa, 7, RoundingMode.HALF_DOWN));
			   
			   // si es mayor nos quedamos con el minimo
			   if (total.compareTo(tmin) >= 0) break;

			   // actualizamos el minimo
			   tmin = total;
		   }
		   
		   writer.println ("Case #" + i + ": " + tmin);
		}
		
		br.close();
		writer.close();
		
		System.out.println ("Fin procesamiento, t: " + (System.currentTimeMillis() - t));
	}

}
