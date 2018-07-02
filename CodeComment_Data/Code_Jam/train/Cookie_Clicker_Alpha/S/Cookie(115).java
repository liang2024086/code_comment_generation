package methodEmbedding.Cookie_Clicker_Alpha.S.LYD903;

import java.util.Scanner;
import java.util.Arrays;
class Cookie
{
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);
	int ncase=in.nextInt();	
	for(int icase=0;icase<ncase;icase++){
	    int icase1=icase+1;
	    int itr=0;
	    double C=in.nextDouble();
	    double F=in.nextDouble();
	    double X=in.nextDouble();
	    double default_rate=2.0;
	    double curr_val=0.0;
	    double curr_slope=default_rate;
	    int nfarms=0;
	    double dtfin=X/default_rate;
	    double dtbuy,test_slope;
	    double tcurr=0.0;
	    double tmin=dtfin;

	    while(true){
		dtbuy=(C-curr_val)/curr_slope;
		if(dtbuy>dtfin){
		    tcurr+=dtfin;
		    break;
		}
		tcurr+=dtbuy;
		curr_val+=curr_slope*dtbuy;
		nfarms++;
		dtfin=(X-curr_val)/curr_slope;
		if(dtfin<1e-10)break;
		test_slope=curr_slope+F*nfarms;
		double dtpred=X/test_slope;
		if(dtpred<dtfin){
		    dtfin=dtpred;
		    curr_slope=test_slope;
		    curr_val=0.0;
		    nfarms=0;
		}else{
		    tcurr=tcurr+dtfin;
		    break;
		}
		if(tcurr>tmin){
		    tcurr=tmin;
		    break;
		}
		
	    }
	    //	    System.out.println("Case #"+icase1+":"+" "+tcurr);
	    System.out.printf("Case #%d: %.7f\n",icase1,tcurr);
	}
    }
}
