package methodEmbedding.Standing_Ovation.S.LYD359;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class first {

	public static void main(String[] args) {
		BufferedReader br = 
		          new BufferedReader(new InputStreamReader(System.in));
		        String s;
				try {
					s = br.readLine();
					 int n=Integer.parseInt(s);
				        
				        for (int i = 0; i < n; i++) {
				        	s=br.readLine();
							String temp[]=s.split(" ");
							int smax=Integer.parseInt(temp[0]);
							String shy=temp[1];
							int sum=0;
							int count=0;
							int dig=0;
							int curr=Integer.parseInt(shy.charAt(dig)+"");
							if(curr==0){
								count++;
								dig++;
							}
							
							while(sum+count<smax){
								curr=Integer.parseInt(shy.charAt(dig)+"");
								//System.out.println("sum="+sum);
								//System.out.println("dig="+dig);
								if(sum+count<dig){
									count++;
								}
								//System.out.println("count="+count);
								sum=sum+curr;
								//System.out.println("sumafter="+sum);
								dig++;
							}
							System.out.println("Case #"+(i+1)+": "+count);
				        }
					
					
				}
				catch(Exception e){
					System.out.println(e);
				}
	}

}
