package methodEmbedding.Magic_Trick.S.LYD2193;


import java.util.Scanner;

public class Magic_trick {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][4];
		int b[] = new int[4];
		Scanner s = new Scanner(System.in);
		int t ;
		t = s.nextInt();
		if(t>100 || t<=0)
			return;
		int i,j,k;
		for(i=0;i<t;i++){
		    int row,column,count=0,check = -1;
		    row = s.nextInt();
		    for(j=0;j<4;j++){
		        for(k=0;k<4;k++){
		        a[j][k] = s.nextInt();
		        }
		    }
		    j=0;
		    for(j=0;j<4;j++){
		        b[j] = a[row-1][j];
		    }
		
		    
		   column = s.nextInt();
		    for(j=0;j<4;j++){
		        for(k=0;k<4;k++){
		        	a[j][k] = s.nextInt();
		        }
		    }
		    for(j=0;j<4;j++){
		        for(k=0;k<4;k++){
		            if(a[column-1][j]== b[k]){
		                count++;
		                check = b[k] ;
		            }
		        }
		    }
		    int m=i+1;
		    if(count==0){
		        System.out.println("Case #"+m+": Volunteer cheated!");
		    }
		    else if(count==1){
		        System.out.println("Case #"+m+": " + check);
		    }
		    else{
		        System.out.println("Case #"+m+": "+ "Bad magician!");
		    }
		}

	}
}

	
