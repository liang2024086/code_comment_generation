package methodEmbedding.Cookie_Clicker_Alpha.S.LYD656;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


class Cookie_Clicker_Alpha {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//long t1=System.currentTimeMillis();
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BufferedReader bf=new BufferedReader(new FileReader("C://Users/Austin/Downloads/B-small-attempt1.in"));
PrintWriter pr=new PrintWriter(new File("E://OO.txt"));
StringBuilder sb=new StringBuilder();
int cas=1;
//int t=Integer.parseInt(br.readLine());
int t=Integer.parseInt(bf.readLine());
while(t-->0){
	StringTokenizer st=new StringTokenizer(bf.readLine());
	double C=Double.parseDouble(st.nextToken());
	double F=Double.parseDouble(st.nextToken());
	double X=Double.parseDouble(st.nextToken());
	double initial_time=2.0;
	double sum=0;
	while((X/initial_time)>(C/initial_time)+(X/(initial_time+F))){
		sum+=C/initial_time;
		initial_time+=F;
	}
	sum+=X/initial_time;
	DecimalFormat f = new DecimalFormat("#######.0000000");  // this will helps you to always keeps in two decimal places
	 String xx=(f.format(sum));
	sb.append("Case #"+cas+": "+xx).append("\n");
	cas++;
}
pr.print(sb);
pr.flush();
pr.close();
bf.close();
//System.out.println(((System.currentTimeMillis()-t1)/1000.0));
	//System.out.println(sb);
	}

}
