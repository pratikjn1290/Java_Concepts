package ownSelenium;

public class FirefoxDriverTest implements WebDriver {

	public FirefoxDriverTest() {
		System.out.println("Launch Chrome");
	}
	
	@Override
	public void Click() {
		System.out.println("Click");

	}

	@Override
	public void findElement() {
		System.out.println("Element Find");

	}

	@Override
	public void sendkeys() {
		System.out.println("Send Keys");

	}

	@Override
	public String get(String url) {
		System.out.println(url);
		return url;
	}


}
