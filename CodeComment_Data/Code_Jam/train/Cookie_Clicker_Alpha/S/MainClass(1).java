package methodEmbedding.Cookie_Clicker_Alpha.S.LYD320;


public class MainClass {
	public static void main(String[] args) {
		CookieClicker cookie = new CookieClicker();
		try {
			cookie.solve("input.data", "output.data");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
