package O1;

import javax.swing.JOptionPane;

public class o2 {
public static void main(String[] args) {
	
	
	for (int i = 0; i < 10; i++) {
		String S = JOptionPane.showInputDialog("Skriv inn din score");
				int Sc = Integer.parseInt(S);
		
		if (Sc > 100 || Sc < 0 ) {
			System.out.println("Scoren du har skrevet inn er ikke gyldig");
			i=i-1;

		}else if (Sc >= 90) {
			System.out.println("Din karakter er A");	
		}else if (Sc >= 80) {
			System.out.println("Din karakter er B");
		}else if (Sc >= 60) {
			System.out.println("Din karakter er C");
		}else if (Sc >= 50) {
				System.out.println("Din karakter er D");
		}else if (Sc >= 40) {
			System.out.println("Din karakter er E");
		}else {
			System.out.println("Din karakter er F");
		}
		
	
	}
	
}
}
