package week1.day2;

public class Browser {

	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	void launchBrowser(String browserName) {
		System.out.println(browserName);
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser bw=new Browser();
		bw.launchBrowser("Chrome");
		bw.launchBrowser();
		bw.loadUrl();

	}

}
