package methodEmbedding.Magic_Trick.S.LYD1770;

import java.util.Scanner;
class magician {
    public static void main(String args[]) {    
    	Scanner sc = new Scanner(System.in);	
		int cases = sc.nextInt();
		sc.skip("\n");
		String ans[] = new String[cases];
		int first[] = new int[cases];
		int second[] = new int[cases];
		int cards[][][] = new int[2][4][4];
		int r1[] = new int[4];
        int r2[] = new int[4];
        int tmp = 0, i = 0, an = 0;        
	while(cases>0) {	
            int count = 0, j = 0;
            String str = null;            
            first[i] = sc.nextInt();
            sc.skip("\n");
            for( int x = 0; x<4 ; x++) {            
		String s = sc.nextLine();			
		String temp[] = s.split(" ");
		for(int k=0;k<4;k++)
                    cards[0][j][k] = Integer.parseInt(temp[k]);
		j++;
            }
            tmp = first[i];
            for( int x = 0; x<4 ; x++)			
		r1[x] = cards[0][tmp-1][x];						            
            second[i] = sc.nextInt();
            sc.skip("\n");
            j = 0;
            for( int x = 0; x<4 ; x++) {            				
		String s = sc.nextLine();	                                
		String temp[] = s.split(" ");
		for(int k=0;k<4;k++)
                    cards[1][j][k] = Integer.parseInt(temp[k]);
                j++;
            }
            tmp = second[i];
            for( int x = 0; x<4 ; x++)        
		r2[x] = cards[1][tmp-1][x];	            
            for(int x = 0;x<4; x++)
		for(int y = 0;y<4; y++)                
                    if(r1[x]==r2[y]) {                    
                        count++;
                        if(count==1)
                            ans[an] = Integer.toString(r1[x]);
                    }                                                         
            if(count==0)        str = "Case #"+(an+1)+": Volunteer cheated!";
            else if(count>1)	str = "Case #"+(an+1)+": Bad magician!";
            else if(count==1)   str = "Case #"+(an+1)+": "+ans[an];
            ans[an] = str;
            an++;
            cases--;
	}		
        for(int n = 0; n<ans.length ;n++)
            System.out.println(ans[n]);
    }
}
