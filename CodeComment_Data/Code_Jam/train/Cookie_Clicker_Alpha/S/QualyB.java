package methodEmbedding.Cookie_Clicker_Alpha.S.LYD3;


import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

import org.apache.commons.io.FileUtils;

public class QualyB {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("0.0000000", new DecimalFormatSymbols(Locale.US));
		Scanner sc = new Scanner(new File("2014/qualy/b/B-small-attempt0.in"));
		sc.useLocale(Locale.ENGLISH);
		int N = sc.nextInt();
		StringBuffer resposta = new StringBuffer();
		for (int i = 0; i < N; i++) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			double pace = 2.0;
			double anteriores = 0.0;
			double ateX = Double.MAX_VALUE;
			double ateXant = Double.MAX_VALUE;
			double atual = 0.0;
			do {
				ateXant = ateX;
				atual = x/pace;
				ateX = anteriores + atual;
				anteriores += c/pace;
				pace += f;
			} while (ateXant >= ateX);
			String out = "Case #"+(i+1)+": "+df.format(ateXant)+"\n";
			System.out.println(out);
			resposta.append(out);
		}
		FileUtils.writeStringToFile(new File("2014/qualy/b/B-small-attempt0.out"), resposta.toString());
		System.exit(0);
	}
}
