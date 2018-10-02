package methodEmbedding.Counting_Sheep.S.LYD1549;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountingSheep {

	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				System.out));
		int casos = (Integer.parseInt(in.readLine()));
		int c = 1;
		while (c <= casos) {

				//n= numero escogido
			long n= (Integer.parseInt(in.readLine()));
			
			if(n==0){out.write("Case #"+c+": INSOMNIA"+"\n");
			}
			else{
				
			boolean todos= false;
			int a=1; 
			
			long resp=0;
			boolean[] digitos= new boolean[10];
			
			

			int completo= 0;
			while(!todos){
				
				long mult= n*a;
				String ae= ""+mult;
				int f= ae.length();
				
				
				for (int i = 0; i < f; i++) {
					int b= Integer.parseInt(ae.charAt(i)+"");
					if(!digitos[b]){
						digitos[b]=true;
						completo++;
					}
					
				}
				
				
				if(completo==10){
					resp=mult;
					todos=true;
				}else{a++;}
				
				
			}
			out.write("Case #"+c+": "+ resp+"\n");
			}
			
			
			c++;

		}
		out.flush();
		out.close();
		in.close();
	}
}
