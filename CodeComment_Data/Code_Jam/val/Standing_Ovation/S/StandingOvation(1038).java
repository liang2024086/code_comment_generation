package methodEmbedding.Standing_Ovation.S.LYD1409;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
4
4 11111
1 09
5 110011
0 1
 */

import java.util.*;


public class StandingOvation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t = 1; t <= T;t++){
			int shyLvlMax = in.nextInt();
			int std = 0;
                        int inv = 0;
                        String str = in.next();
			for(int shyLvl = 0; shyLvl <=shyLvlMax;shyLvl++ ){
                         
                            int ppl=0;
                            ppl = Character.getNumericValue(str.charAt(shyLvl));
                          
                             if( std<shyLvl*((ppl==0)?0:1)){
                                inv= inv+shyLvl-std;
                                std = std +ppl+inv;
                              //   System.out.println("if");
                            }
                            else{
                             std = std +ppl;
                               //  System.out.println("else");
                            }
                            
			//System.out.format("shylvlMax:%d shylvl:%d ppl:%d std:%d inv:%d \n", shyLvlMax, shyLvl,ppl,std,inv);
			}
                        
			System.out.format("Case #%d: %d\n", t, inv);
		}
	}
}
