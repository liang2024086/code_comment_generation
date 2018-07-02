package methodEmbedding.Standing_Ovation.S.LYD1290;


import java.io.BufferedReader;
import java.io.FileReader;

public class StandingOvation {

    public static void main(String[] args) throws Exception {
	String url = StandingOvation.class.getResource("StandingOvation").getFile();
        BufferedReader br = new BufferedReader(new FileReader(url));
        StringBuilder result = new StringBuilder();
        int c = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < c; i++) {
	    String[] problems = br.readLine().split(" ");
	    char[] audiences = problems[1].toCharArray();
	    long additional = 0, standing = 0;
	    
	    for (int j = 0; j < audiences.length; j++) {
		int a = audiences[j] - '0';
		if (j == 0) {
		    standing += a;
		} else {
		    if(j <= standing) {
			standing += a;
		    } else {
			if (a == 0) {
			    continue;
			} else {
			    additional += j - standing;
			    standing += a + (j - standing);
			}
		    }
		}
	    }
	    
	    result.append(String.format("Case #%d: %d", i + 1, additional)).append("\n");
	}
        br.close();
        System.out.println(result.toString());
    }

}
