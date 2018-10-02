package methodEmbedding.Standing_Ovation.S.LYD1573;


import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		int t=0;
		int caseNo = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt();
		
		while(t>0){
			
			
			int ans = 0 ;
			int npST=0;
			int a[] = null;
			int size;
			
			String temp[] = new String[2];
			temp[0] = scan.next();
			temp[1]=  scan.next();
			size = Integer.parseInt(temp[0]) + 1;
			a= new int[size];
			
		    
			
			for(int i =0 ;i < temp[1].length();i++){
				a[i] = Character.getNumericValue(temp[1].charAt(i));
				
			}
				
			
			
			npST = a[0]; 
			
			
			for(int i =1 ;i < size;i++){
				if(npST<i){
					ans+= i - npST;
					npST = a[i] + i;
					
				}else{
					npST+= a[i];
				}
			}
				
			
			System.out.println("Case #"+ caseNo+": " +ans);
			caseNo++;
			t--;
		}
		
		
		
	}
}
