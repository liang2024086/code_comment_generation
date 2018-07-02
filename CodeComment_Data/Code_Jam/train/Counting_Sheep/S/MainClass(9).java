package methodEmbedding.Counting_Sheep.S.LYD396;


public class MainClass {

	public MainClass() {
		
		int[] res=Mouton.lectureFichier();
		int n=res[200];
		//Utils.extraireChiffre(20);
		Utils.afficheMatInc(res, n);
		res=Mouton.construction(res, n);
		Mouton.ecritureFichier(n,res);
		
	}

	public static void main(String[] args) {
		new MainClass();
	}

}
