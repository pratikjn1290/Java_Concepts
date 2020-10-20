package constructorConcept;

import java.util.ArrayList;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> pluginData = new ArrayList<String>();
		pluginData.add("Screencast");
		pluginData.add("LightShot");
		pluginData.add("FireBug");

		Browser b = new Browser("IE");
		System.out.println(b.BrowserName);

		Browser b1 = new Browser("Firefox", "Mozzila");
		Browser b2 = new Browser("SAFARI", "APPLE", 12.00);
		Browser b3 = new Browser("Firefox", "Mozzila", 12, pluginData);

		System.out.println(b1.BrowserName + " " + b1.VendorName);
		System.out.println(b2.BrowserName + " " + b2.VendorName + " " + b2.currentVersion);
		System.out.println(b3.BrowserName + " " + b3.VendorName + " " + b3.currentVersion + " " + pluginData);

		
		System.out.println(b.getBrowserName());
		System.out.println(b1.getCurrentVersion());
		System.out.println(b1.getVendorName());
		System.out.println(b3.getPlugins().get(1));
	}

}
