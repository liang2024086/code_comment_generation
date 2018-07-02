package methodEmbedding.Standing_Ovation.S.LYD571;



import java.util.*;


public class Jam {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t = 1; t <= T;t++){
			int shyMax = in.nextInt();
			int std = 0;
                        int inv = 0;
                        String string = in.next();
			for(int shyLvl = 0; shyLvl <=shyMax;shyLvl++ ){
                         
                            int ppl = 0;
                            ppl = Character.getNumericValue(string.charAt(shyLvl));
                          
                             if( std<shyLvl*((ppl==0)?0:1)){
                                inv= inv+shyLvl-std;
                                std = std +inv+ppl;
                                }
                            else{
                             std = std +ppl;                              
                            }
                        }
                        
			System.out.format("Case #%d: %d\n", t, inv);
		}
	}
}
