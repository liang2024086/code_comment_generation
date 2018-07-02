package methodEmbedding.Magic_Trick.S.LYD1598;


import java.io.*;
import java.util.*;

import org.apache.commons.io.FileUtils;

public class QualyA {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("2014/qualy/a/A-small-attempt0.in"));
		int N = sc.nextInt();
		StringBuffer resposta = new StringBuffer();
		for (int i = 0; i < N; i++) {
			Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
			//Primeiro n?mero escolhido
			int r = sc.nextInt();
			sc.nextLine();
			//Linhas anteriores
			for(int l=1; l<=r-1; l++) {
				sc.nextLine();
			}
			//Linha selecionada
			for(int l=0; l<4; l++) {
				int n = sc.nextInt();
				hash.put(n, n);
			}
			sc.nextLine();
			//Linhas posteriores
			for(int l=r+1; l<=4; l++) {
				sc.nextLine();
			}
			
			//Segundo n?mero escolhido
			r = sc.nextInt();
			sc.nextLine();
			//Linhas anteriores
			for(int l=1; l<=r-1; l++) {
				sc.nextLine();
			}
			int comb = 0;
			Integer resp=null;
			//Linha selecionada
			for(int l=0; l<4; l++) {
				int n = sc.nextInt();
				if (hash.get(n)!=null) {
					resp = n;
					comb++;
				}
			}
			sc.nextLine();
			//Linhas posteriores
			for(int l=r+1; l<=4; l++) {
				sc.nextLine();
			}
			String out = "Case #"+(i+1)+": ";
			if (comb==0) {
				out += "Volunteer cheated!\n";
			}
			else if (comb==1) {
				out += resp + "\n";
			}
			else {
				out += "Bad magician!\n";
			}
			System.out.println(out);
			resposta.append(out);
		}
		FileUtils.writeStringToFile(new File("2014/qualy/a/A-small-attempt0.out"), resposta.toString());
		System.exit(0);
	}
}
