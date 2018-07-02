package methodEmbedding.Counting_Sheep.S.LYD167;



import java.util.*;
import java.io.*;

public class Sheep {

    public static String filename = "A-small-attempt0";


    public static void main(String[] args) {


    	try {
	    	Scanner filein = new Scanner(new File(filename+".in"));
	    	PrintWriter fileout = new PrintWriter(new FileWriter(filename+".out"));
	    	int totalCase = filein.nextInt();
	    	System.out.println("Total Case:"+totalCase);
	    	//filein.nextLine();
	    	for(int item=1; item<=totalCase; item++) {


				//int cases = filein.nextInt();
				//filein.nextLine();
				fileout.print("Case #" + (item) + ": ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Case #" + (item) + ": ");
				System.out.println("------------------------------------------------------------------------");
				int multiple = filein.nextInt();
				int multiplet=0;
				System.out.println("------------------------------------------------------------------------"+multiple );
				int total=0;
				if(multiple==0)
									{
										fileout.println("INSOMNIA");
										System.out.println("--------------------------------INSOMNIA--------------------------------");
										continue;
					}
				boolean intarr[]={false,false,false,false,false,false,false,false,false,false};
				for(int i=1; i<=1000; i++)
				{
					multiplet=multiple*i;
					System.out.println("Mul"+multiple+"*"+i);
					char nums[] = (multiplet+"").toCharArray();
					if(multiple==0)
					{
						fileout.println("INSOMNIA");
						System.out.println("INSOMNIA");
						break;
					}
					for(int j=0; j < nums.length; j++)
					{
						System.out.println("Char:"+nums[j] );
						        switch (Character.getNumericValue(nums[j])) {
						            case 0:  intarr[0] = true;
						                     break;
						            case 1:  intarr[1] = true;
						                     break;
						            case 2:  intarr[2] = true;
						                     break;
						            case 3:  intarr[3] = true;
						                     break;
						            case 4:  intarr[4] = true;
						                     break;
						            case 5:  intarr[5] = true;
						                     break;
						            case 6:  intarr[6] = true;
						                     break;
						            case 7:  intarr[7] = true;
						                     break;
						            case 8:  intarr[8] = true;
						                     break;
						            case 9: intarr[9] = true;
						                     break;
						            default: multiple = multiple;
						                     break;
        						}
					}
					if(intarr[0]&&intarr[1]&&intarr[2]&&intarr[3]&&intarr[4]&&intarr[5]&&intarr[6]&&intarr[7]&&intarr[8]&&intarr[9])
					{
												fileout.println(multiplet);
												System.out.println("Mu is "+multiplet);
												i=100;
												break;
					}

				}

	    	}

	    	filein.close();
	    	fileout.close();
       	}
       	catch(IOException e) {
       		System.out.println("Error loading input or output file");
       	}
    }
}
