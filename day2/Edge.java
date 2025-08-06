package week3.day2;

public class Edge extends Browser {
	// Method to take the snap
	public void takeSnap()
	{
		System.out.println("Snap taken");
	}
	// Method to clear the cookies
	public void clearCookies()
	{
		System.out.println("Cookies cleared");
	}
	public static void main(String[] args)
	{
		// Creating object for edge class
		Edge edgeBrowser=new Edge();
		
		// Defining the variables
		edgeBrowser.browserName="Edge";
		edgeBrowser.browserVersion="138.0.3351.121";
		
		// Printing the variables
		System.out.println("Browser Name:" +edgeBrowser.browserName);
		System.out.println("Browser Version:" +edgeBrowser.browserVersion);
		
		// Calling both edge and browser class
		edgeBrowser.openURL();
		edgeBrowser.navigateBack();
		edgeBrowser.takeSnap();
		edgeBrowser.clearCookies();
		edgeBrowser.closeBrowser();
		
	}

}
