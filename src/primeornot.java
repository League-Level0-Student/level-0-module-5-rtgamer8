import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	
	String num123456789 = JOptionPane.showInputDialog("Type in any number.");
	
int num =Integer.parseInt(num123456789);	

	isPrime(num);
System.out.println(isPrime(num));


	}

	static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i==0) {
			return false;
			
		
			}
			
			
		}
		return true;
	}
	
	

	
}
