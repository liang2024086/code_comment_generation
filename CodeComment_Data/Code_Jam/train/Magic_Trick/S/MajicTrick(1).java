package methodEmbedding.Magic_Trick.S.LYD977;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MajicTrick {

	public static void main(String[] args){

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    try {
	    	
	    	s = in.readLine();
	    	int case_num = Integer.parseInt(s);
	    	for (int k = 0; k < case_num; k++) {
	    		String[] answer_1st = new String[4];
	    		String[] answer_2st = new String[4];
	    		int row_1st = Integer.parseInt(in.readLine());
	    		for (int i = 0; i < 4; i++) {
					if ((i+1)==row_1st) {
						answer_1st = in.readLine().split(" ");
					}
					else{
						in.readLine();
					}
				}
	    		int row_2st = Integer.parseInt(in.readLine());
	    		for (int i = 0; i < 4; i++) {
					if ((i+1)==row_2st) {
						answer_2st = in.readLine().split(" ");
					}
					else{
						in.readLine();
					}
				}
	    		int count = 0;
	    		String annswer = "";
	    		for (int i = 0; i < answer_2st.length; i++) {
					for (int j = 0; j < answer_1st.length; j++) {
						if (answer_1st[j].equals(answer_2st[i])) {
							count++;
							annswer = answer_1st[j];
						}
					}
				}
	    		if (count==1) {
					System.out.println("Case #"+(k+1)+": "+annswer);
				}
	    		else if (count==0) {
	    			System.out.println("Case #"+(k+1)+": Volunteer cheated!");
				}
	    		else{
	    			System.out.println("Case #"+(k+1)+": Bad magician!");
	    		}
			}
	    	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
