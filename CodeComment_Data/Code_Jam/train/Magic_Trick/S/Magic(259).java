package methodEmbedding.Magic_Trick.S.LYD965;

import java.io.BufferedReader;
import java.io.FileReader;


class Magic {
	
	static int nwl,ndic,nmsg,count[];
	static String[] dic,msg;
	
	
    public static void main(String args[] ) throws Exception {
       
	try{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
		int N=Integer.parseInt(line);
		int check[]=new int[N];
		int outputs[]=new int[N];
		for(int i=0;i<N;i++){
			check[i]=0;
		}
		for(int i=0;i<N;i++){
			
			int ans1=Integer.parseInt(br.readLine());
			int card1[][]=new int[4][4];
			int card2[][]=new int[4][4];
			String arrange[]=new String[4];
			String arrange2[]=new String[4];
			//System.out.println("Card1: ");
			for(int j=0;j<4;j++){
				arrange[j]=br.readLine();
				String[] inputs = arrange[j].split(" ");
				int k=0;
				for(String a: inputs){
					card1[j][k]=Integer.parseInt(a);
					//System.out.println(""+j+k+":"+a);
					k++;
				}
			}
			int ans2=Integer.parseInt(br.readLine());
			//System.out.println("Card2: ");
			for(int j=0;j<4;j++){
				arrange2[j]=br.readLine();
				String[] inputs = arrange2[j].split(" ");
				int l=0;
				for(String a: inputs){
					card2[j][l]=Integer.parseInt(a);
					//System.out.println(""+j+l+":"+a);
					l++;
				}
			}
			
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					
					if(card1[ans1-1][j]==card2[ans2-1][k]){
						outputs[i]=card1[ans1-1][j];
						check[i]++;
					}
				}
				
			}
			
			
			
			
		}
		
		for(int i=0;i<N;i++){
			if(check[i]==0){
				System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
			}else if(check[i]==1){
			
			System.out.println("Case #"+(i+1)+": "+outputs[i]);
			}else{
				System.out.println("Case #"+(i+1)+": "+"Bad magician!");
			}
		}
		
		
		
        
       
	}catch(Exception e){
		e.printStackTrace();
	}
       
    }


	
   
}
