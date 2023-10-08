package examples;

    interface Safari {
	public void openApp();

	public void closeApp();
}

class Firefox implements Safari{
	public void openApp() {
		System.out.println("Open Firefox Browser");
	}

	public void closeApp() {
		System.out.println("Close Firefox Browser");
	}
}

    class Chrome implements Safari {
	public void openApp() {
		System.out.println("Open Chrome Browser");
	}
	
	public void closeApp() {
		System.out.println("Close Chrome Browser");
	}

	public static void main(String args[]) {
//Direct Method
		Firefox ff = new Firefox();
		ff.openApp();
		ff.closeApp();
		Chrome ch = new Chrome();
		ch.openApp();
		ch.closeApp();
		
		Safari driver = new Firefox();
		driver.openApp();
		driver.closeApp();
		
		Safari driver1 = new Chrome();
		driver1.openApp();
		driver1.closeApp();
		

	}
}