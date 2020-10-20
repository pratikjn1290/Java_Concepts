package constructorConcept;

import java.util.ArrayList;

public class Browser {

	String BrowserName;
	String VendorName;
	double currentVersion;
	ArrayList<String> plugins;

	public Browser(String BrowserName) {
		this.BrowserName = BrowserName;
	}

	public Browser(String BrowserName, String VendorName) {
		this.BrowserName = BrowserName;
		this.VendorName = VendorName;
	}

	public Browser(String BrowserName, String VendorName, double currentVersion) {

		this.BrowserName = BrowserName;
		this.VendorName = VendorName;
		this.currentVersion = currentVersion;

	}

	public Browser(String BrowserName, String VendorName, double currentVersion, ArrayList<String> plugins) {
		this.BrowserName = BrowserName;
		this.VendorName = VendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

	public String getBrowserName() {
		return BrowserName;
	}

	public String getVendorName() {
		return VendorName;
	}

	public double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}

	public ArrayList<String> getPlugins() {
		return plugins;
	}

}
