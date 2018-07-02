package methodEmbedding.Magic_Trick.S.LYD381;


public class Solution1_Magic {

	public static void main(String[] args) {
		String[] input = FileLoadSave.loadFile("C:\\Users\\Umut\\Desktop\\quest.in");
		String[] srow, s2row;
		String out = "";
		int num= Integer.parseInt(input[0]);
		String[] output = new String[num];
		int sline, srowid, chances;
		for (int i=0; i<num; i++) {
			sline=1+i*10;
			srowid=Integer.parseInt(input[sline]);
			srow=input[sline+srowid].split(" ");
			srowid=Integer.parseInt(input[sline+5]);
			chances=0;
			s2row=input[sline+5+srowid].split(" ");
			for(int j=0; j<4; j++) {
				for (int k=0; k<4; k++)
					if(srow[j].equals(s2row[k])) {
						chances++;
						out=srow[j];
					}
			}
			if (chances==1) {
				output[i]="Case #"+(i+1)+": "+out;
			}
			else if(chances==0) {
				output[i]="Case #"+(i+1)+": "+"Volunteer cheated!";
			}
			else {
				output[i]="Case #"+(i+1)+": "+"Bad magician!";
			}
		}
		FileLoadSave.writeFile("C:\\Users\\Umut\\Desktop\\quest2.txt", output);
	}

	
	
}
