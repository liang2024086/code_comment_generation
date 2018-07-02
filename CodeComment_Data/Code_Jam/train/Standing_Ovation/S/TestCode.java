package methodEmbedding.Standing_Ovation.S.LYD289;


import CodeJam_2014.qualification.cookie_clicker_alpha;
import CodeJam_2014.qualification.magic_trick;
import CodeJam_2015.qualifications.StandingOvation;

/**
 * Created by deep on 3/11/15.
 */
public class TestCode {
	public static void main(String[] args) {
		String dir_2014 = "src/CodeJam_2014/test_files/";
		String dir_2015 = "src/CodeJam_2015/test_files/";
		String input = "input/";
		String output = "output/";

		/* QUALIFICATION ROUND 2014 */
		magic_trick.solve(dir_2014 + input + "A-small-practice.in", dir_2014
				+ output + "A-small-practice");

		cookie_clicker_alpha.solve(dir_2014 + input + "B-small-practice.in",
				dir_2014 + output + "B-small-practice");
		cookie_clicker_alpha.solve(dir_2014 + input + "B-large-practice.in",
				dir_2014 + output + "B-large-practice");

		/* QUALIFICATION ROUND 2015 */
		StandingOvation.solve(dir_2015 + input + "A-small-attempt1.in",
				dir_2015 + output + "A-small");
	}
}
