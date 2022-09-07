package O1;

import javax.swing.JOptionPane;

public class o3 {
	
	
	public static void main(String[] args) {
		
		int f = 1;
		
		String N = JOptionPane.showInputDialog("skriv inn et heltall");
		
		int n = Integer.parseInt(N);
		
		if(n > 0) {
			
			for (int tall=1; tall<=n; tall++)
			      f = f * tall;
			
			System.out.println(f);
		}
		
		
		
		
	}
}
