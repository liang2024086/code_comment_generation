package methodEmbedding.Magic_Trick.S.LYD166;

import java.io.*;

class Magician
{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n ;i++) {
			int x1[]=new int[4];
			int x2[]=new int[4];
			int x3[]=new int[4];
			int x4[]=new int[4];
			int arr1[]=new int[4];
			int arr2[]=new int[4];

			int row1=Integer.parseInt(br.readLine());
			String[] r1=br.readLine().split(" ");
			String[] r2=br.readLine().split(" ");
			String[] r3=br.readLine().split(" ");
			String[] r4=br.readLine().split(" ");
			

			for (int p=0;p<4 ;p++ ) {
				x1[p]=Integer.parseInt(r1[p]);
				
			}
			for (int q=0;q<4 ;q++ ) {
				x2[q]=Integer.parseInt(r2[q]);
				
			}
			for (int r=0;r<4 ;r++ ) {
				x3[r]=Integer.parseInt(r3[r]);
				
			}
			for (int s=0;s<4 ;s++ ) {
				x4[s]=Integer.parseInt(r4[s]);
				
			}


			int row2=Integer.parseInt(br.readLine());
			int a1[]=new int[4];
			int a2[]=new int[4];
			int a3[]=new int[4];
			int a4[]=new int[4];

			String[] ro1=br.readLine().split(" ");
			String[] ro2=br.readLine().split(" ");
			String[] ro3=br.readLine().split(" ");
			String[] ro4=br.readLine().split(" ");
			

			for (int p1=0;p1<4 ;p1++ ) {
				a1[p1]=Integer.parseInt(ro1[p1]);
				
			}
			for (int q1=0;q1<4 ;q1++ ) {
				a2[q1]=Integer.parseInt(ro2[q1]);
				
			}
			for (int t1=0;t1<4 ;t1++ ) {
				a3[t1]=Integer.parseInt(ro3[t1]);
				
			}
			for (int s1=0;s1<4 ;s1++ ) {
				a4[s1]=Integer.parseInt(ro4[s1]);
				
			}


			if(row1==1){
				System.arraycopy( x1, 0, arr1, 0, 4 );
			}
			else if(row1==2){
				System.arraycopy( x2, 0, arr1, 0, 4 );
			}
			else if(row1==3){
				System.arraycopy( x3, 0, arr1, 0, 4 );
			}
			else if(row1==4){
				System.arraycopy( x4, 0, arr1, 0, 4 );
			}

			if(row2==1){
				System.arraycopy( a1, 0, arr2, 0, 4 );
			}
			else if(row2==2){
				System.arraycopy( a2, 0, arr2, 0, 4 );
			}
			else if(row2==3){
				System.arraycopy( a3, 0, arr2, 0, 4 );
			}
			else if(row2==4){
				System.arraycopy( a4, 0, arr2, 0, 4 );
			}

			int count=0;
        	for(int x=0;x<4;x++){
            	for(int y=0;y<4;y++){
                	if(arr1[x]==arr2[y]){
                    	count++;
                	}
            	}
        	}
        	if (count==1) {
        		for(int x=0;x<4;x++){
            		for(int y=0;y<4;y++){
                		if(arr1[x]==arr2[y]){
                    		System.out.println("Case #"+(i+1)+": "+arr1[x]);
                		}
            		}
        		}

        	}
        	else if (count>1) {
        		System.out.println("Case #"+(i+1)+": Bad magician!");
        		
        	}
        	else if (count==0) {
        		System.out.println("Case #"+(i+1)+": Volunteer cheated!");
        		
        	}
    
   		}
	}
}
