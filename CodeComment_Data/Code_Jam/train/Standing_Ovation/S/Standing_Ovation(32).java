package methodEmbedding.Standing_Ovation.S.LYD1208;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.text.StyledEditorKit.ForegroundAction;


public class Standing_Ovation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = 0;
		String tab[]=new  String[10000];


PrintWriter pw=new PrintWriter(new FileOutputStream("output"));
	try {
		BufferedReader bf=new BufferedReader(new  InputStreamReader (new FileInputStream("file")));
		t=Integer.valueOf(bf.readLine());
for(int i=0;i<t;i++){
 tab[i]=bf.readLine();
	System.out.println(tab[i]);
}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
for(int i=0;i<t;i++){
	int cpt=0;
	int nbr_aud=0;
	//System.out.println((int)(tab[i].charAt(0))-48);
	for (int j=2;j<=(int)(tab[i].charAt(0))-46;j++){
		if((int)(tab[i].charAt(j))!=48){
			//System.out.println((j-2)+"vv"+nbr_aud);
			if((j-2)>nbr_aud){cpt+=j-nbr_aud-2;nbr_aud+=cpt;} 
			if("123456789".contains(String.valueOf(tab[i].charAt(j))))nbr_aud+=(int)(tab[i].charAt(j))-48 ;
			
					
		}
	}
	System.out.println("Case #"+(i+1)+": "+cpt);

	pw.print("Case #"+(i+1)+": "+cpt+"\n");

	pw.flush();
}

}

}
