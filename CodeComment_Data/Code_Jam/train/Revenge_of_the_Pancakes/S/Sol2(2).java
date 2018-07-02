package methodEmbedding.Revenge_of_the_Pancakes.S.LYD88;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sol2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String s = br.readLine();
			char arr[]=s.toCharArray();
			int len=arr.length;
			int count=0;
			for(int j=0;j<len;j++){
				if(arr[j]=='-'){
					if(j>0){
						if(arr[j-1]=='+')count+=2;
					}
					if(j==0)count++;
				}
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
		
	}

}
