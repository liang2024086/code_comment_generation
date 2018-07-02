package methodEmbedding.Standing_Ovation.S.LYD1768;


import java.io.*;


public class main {
public static void main(String[] args) {
	try {
		BufferedReader read=new BufferedReader(new FileReader("A-small-attempt3.in"));
		BufferedWriter write=new BufferedWriter(new FileWriter("out.in"));
		int N=Integer.valueOf(read.readLine());
		
		for(int i=0;i<N;i++){
			int l=0;
			
			int shyness=0;
			int max=0;
			int sum=0;
			int pplnd=0;
			String a[]=read.readLine().split(" ");
			int r=Integer.parseInt(a[0]);
			String seprtd[]=a[1].split("");
			
			int ia[]=new int[seprtd.length];
			
				//splitting the line
				
				for(int j=0;j<seprtd.length;j++){
					ia[j]=Integer.parseInt(seprtd[j]);
					
				}
				max=seprtd.length-1;
				
				while(shyness<=r){
					if(ia[shyness]>0){
						
						sum=sum+ia[shyness];
						shyness++;
					}else if(ia[shyness]==0 && shyness>=sum){
						pplnd++;
						sum++;
						shyness++;
					}else{
						shyness++;
					}
					
				}
				
			
			write.write("Case #" + (i+1)+": "+ pplnd +"\n");
			write.flush();
			
		}
		
		
		
	} catch(IOException ex) {
		ex.printStackTrace();
}
}
}
