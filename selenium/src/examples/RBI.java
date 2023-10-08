package examples;

    abstract class Bank {
	abstract void debit();
    abstract void credit();
}

class Sbi extends Bank {
	public void debit() {
		System.out.println("Dear SBI User Your A/C X1739 has been debited by 4000. On date 27th July");
	}

	public void credit() {
		System.out.println("Dear SBI User Your A/C X1739 has been credited by 20000. On date 24th July");
	}
}

class Hdfc extends Bank {
	public void debit() {
		System.out.println("Dear HDFC User Your A/C X1739 has been debited by 1000. On date 20th July");
	}

	public void credit() {
		System.out.println("Dear HDFC User Your A/C X1739 has been credited by 7000. On date 25th July");
	}
}

class Icici  extends Bank{
 public void debit() {	
 System.out.println("Dear ICICI User Your A/C X1739 has been debited by 500. On date 17th July");
}
 public void credit() {
 System.out.println("Dear ICICI User Your A/C X1739 has been credited by 1000. On date 19th July");
 }
}

class Kotak extends Bank {
 public void debit() {
System.out.println("Dear KOTAK User Your A/C X1739 has been debited by 2000. On date 01st July");	 
 }
 public void credit() {
System.out.println("Dear KOTAK User Your A/C X1739 has been credited by 5600. On date 24th July");
 }
}

class Indusland extends Bank{
public void debit() {
System.out.println("Dear INDUSLAND User Your A/C X1739 has been debited by 200. On date 12th July");	
}
public void credit() {
System.out.println("Dear INDUSLAND User Your A/C X1739 has been credited by 5600. On date 20th July");	
}
}

public class RBI {
	public static void main(String args[]) {
		Sbi sb = new Sbi();	
		sb.debit();
		sb.credit();
		Hdfc hd = new Hdfc();
		hd.debit();
		hd.credit();
		Icici ic = new Icici();
		ic.debit();
		ic.credit();
		Kotak kt = new Kotak();
		kt.debit();
		kt.credit();
		Indusland id = new Indusland();
		id.debit();
		id.credit();
	}
}