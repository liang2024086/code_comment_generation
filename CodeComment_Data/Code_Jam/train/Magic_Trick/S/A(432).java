package methodEmbedding.Magic_Trick.S.LYD853;

import java.util.*;

public class A{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	
	int T = in.nextInt();
	for(int caseno = 1; caseno <= T; caseno++){
	    boolean[] used = new boolean[16];
	    int ans = 0;
	    
	    int row = in.nextInt();
	    for(int i = 0; i < 16; i++){
		int num = in.nextInt();
		if((i / 4) == (row - 1)){
		    used[num-1]=true;
		}
	    }

	    row = in.nextInt();
	    for(int i = 0; i < 16; i++){
		int num = in.nextInt();
		if((i / 4) == (row - 1)){
		    if(used[num-1]){
			if(ans != 0)
			    ans = -1;
			else
			    ans = num;
		    }
		}
	    }
	    
	    System.out.print("Case #" + caseno + ": ");
	    if(ans == 0)
		System.out.println("Volunteer cheated!");
	    else if(ans < 0)
		System.out.println("Bad magician!");
	    else
		System.out.println(ans);
	}
    }
}
