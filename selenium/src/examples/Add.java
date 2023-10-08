package examples;

public class Add {

	public static void main(String args[]) {

		System.out.println("Welcome to SELENIUM");

		int a = 10;
		int b = 50;
		System.out.println(a+b);
		
		class B extends Add {
		public void m1 () {
		 int x = 30;
		 int y = 40;
		 Add obj = new Add();
		 System.out.println(b-a);
		 System.out.println(x+y);
		}
		}
}
}