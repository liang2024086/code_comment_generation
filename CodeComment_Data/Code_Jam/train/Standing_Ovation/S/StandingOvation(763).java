package methodEmbedding.Standing_Ovation.S.LYD1844;


public class StandingOvation {
    public static void main(String args[]){
    	ReadFile RF=new ReadFile("A-small-attempt0.in");
    	WriteResult WR=new WriteResult();
    	//System.out.println(RF.cases.toString());
    	for(int caseIndex=0;caseIndex<RF.caseNum;caseIndex++){
    		System.out.println(RF.cases.get(caseIndex).toString());
            WR.addCaseResult(new Execute(RF.cases.get(caseIndex)).output());
    		//break;
    	}
    	WR.printResult();
    }
}
